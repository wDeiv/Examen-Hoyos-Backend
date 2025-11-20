package pe.edu.upeu.examen.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Nombre")
    private String nombre;

    @Column(name="Telefono")
    private String telefono;
}
