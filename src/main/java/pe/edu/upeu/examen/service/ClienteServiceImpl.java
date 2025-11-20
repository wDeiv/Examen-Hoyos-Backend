package pe.edu.upeu.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.examen.model.Cliente;
import pe.edu.upeu.examen.repository.ClienteRepository;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repositorio;

    @Override
    public List<Cliente> ListarClientes() {
        return repositorio.findAll();
    }

    @Override
    public Cliente Agregar(Cliente cliente) {
        return repositorio.save(cliente);
    }

    @Override
    public Cliente BuscarPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public void Eliminar(Long id) {
        repositorio.deleteById(id);

    }

    @Override
    public Cliente Actualizar(Long id, Cliente actualizarcliente) {
        Cliente clienteExistente = repositorio.findById(id).orElse(null);
        if (clienteExistente != null) {
            clienteExistente.setNombre(actualizarcliente.getNombre());
            clienteExistente.setTelefono(actualizarcliente.getTelefono());
            return repositorio.save(clienteExistente);
        }
        return null;
    }
}
