package pe.edu.upeu.examen.service;

import pe.edu.upeu.examen.model.Plato;

import java.util.List;

public interface PlatoService {
    List<Plato> ListarPlatos();
    Plato Agregar(Plato plato);
    Plato BuscarPorId(Long id);
    void Eliminar(Long id);
    Plato Actualizar(Long id, Plato plato);
}
