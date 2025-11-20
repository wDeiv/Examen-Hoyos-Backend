package pe.edu.upeu.examen.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="platos")
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="Nombre")
    private String nombre;

    @Column (name="Descripcion")
    private String descripcion;

    @Column (name="Precio")
    private Double precio;

}
