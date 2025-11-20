package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.examen.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
