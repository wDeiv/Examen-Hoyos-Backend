package pe.edu.upeu.examen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.examen.model.Pedido;
import pe.edu.upeu.examen.model.Plato;
import pe.edu.upeu.examen.service.PedidoService;
import pe.edu.upeu.examen.service.PlatoService;

import java.util.List;

@RestController
@RequestMapping("/api/platos")
@CrossOrigin(origins = "*")
public class PlatoController {

    @Autowired
    private PlatoService servicio;

    @GetMapping
    public List<Plato> ListarPlatos() {
        return servicio.ListarPlatos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plato> BuscarPorId(@PathVariable Long id) {
        Plato plato = servicio.BuscarPorId(id);
        if (plato == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(plato);
    }

    @PostMapping
    public Plato Agregar(@RequestBody Plato plato) {
        return servicio.Agregar(plato);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plato> Actualizar(@PathVariable Long id, @RequestBody Plato plato) {
        Plato actualizado = servicio.Actualizar(id, plato);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Eliminar(@PathVariable Long id) {
        servicio.Eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
