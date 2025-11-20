package pe.edu.upeu.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.examen.model.Pedido;
import pe.edu.upeu.examen.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository repositorio;

    @Override
    public List<Pedido> ListarPedidos() {
        return repositorio.findAll();
    }

    @Override
    public Pedido Agregar(Pedido pedido) {
        return repositorio.save(pedido);
    }

    @Override
    public Pedido BuscarPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void Eliminar(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public Pedido Actualizar(Long id, Pedido actualizarPedido) {
        Pedido pedidoExistente = repositorio.findById(id).orElse(null);
        if (pedidoExistente != null) {
            pedidoExistente.setNumeromesa(actualizarPedido.getNumeromesa());
            repositorio.save(pedidoExistente);
        }
        return null;
    }
}
