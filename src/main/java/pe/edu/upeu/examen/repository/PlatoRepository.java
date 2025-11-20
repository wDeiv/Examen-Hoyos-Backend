package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.examen.model.Plato;

@Repository
public interface PlatoRepository extends JpaRepository<Plato,Long> {
}
