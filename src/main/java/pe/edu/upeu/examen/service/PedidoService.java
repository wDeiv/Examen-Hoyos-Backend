package pe.edu.upeu.examen.service;

import pe.edu.upeu.examen.model.Pedido;

import java.util.List;

public interface PedidoService {
    List<Pedido> ListarPedidos();
    Pedido Agregar(Pedido pedido);
    Pedido BuscarPorId(Long id);
    void Eliminar(Long id);
    Pedido Actualizar(Long id, Pedido pedido);
}
