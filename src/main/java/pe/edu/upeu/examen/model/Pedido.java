package pe.edu.upeu.examen.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Numero_Mesa")
    private Integer numeromesa;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "plato_id", nullable = false)
    private Plato plato;
}
