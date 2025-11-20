package pe.edu.upeu.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.examen.model.Pedido;
import pe.edu.upeu.examen.model.Plato;
import pe.edu.upeu.examen.repository.PlatoRepository;

import java.util.List;

@Service
public class PlatoServiceImpl implements PlatoService {

    @Autowired
    private PlatoRepository repositorio;

    @Override
    public List<Plato> ListarPlatos() {
        return repositorio.findAll();
    }

    @Override
    public Plato Agregar(Plato plato) {
        return repositorio.save(plato);
    }

    @Override
    public Plato BuscarPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public void Eliminar(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public Plato Actualizar(Long id, Plato actualizarplato) {
        Plato platoExistente = repositorio.findById(id).orElse(null);
        if (platoExistente != null) {
            platoExistente.setNombre(actualizarplato.getNombre());
            platoExistente.setDescripcion(actualizarplato.getDescripcion());
            platoExistente.setPrecio(actualizarplato.getPrecio());
            repositorio.save(platoExistente);
        }
        return null;
    }
}
