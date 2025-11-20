package pe.edu.upeu.examen.service;

import pe.edu.upeu.examen.model.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> ListarClientes();
    Cliente Agregar(Cliente cliente);
    Cliente BuscarPorId(Long id);
    void Eliminar(Long id);
    Cliente Actualizar(Long id, Cliente cliente);


}
