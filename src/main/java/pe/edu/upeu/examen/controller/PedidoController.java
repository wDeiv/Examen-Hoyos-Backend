package pe.edu.upeu.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.examen.model.Cliente;
import pe.edu.upeu.examen.model.Pedido;
import pe.edu.upeu.examen.service.ClienteService;
import pe.edu.upeu.examen.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    @Autowired
    private PedidoService servicio;

    @GetMapping
    public List<Pedido> ListarPedidos() {
        return servicio.ListarPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> BuscarPorId(@PathVariable Long id) {
        Pedido pedido = servicio.BuscarPorId(id);
        if (pedido == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedido);
    }

    @PostMapping
    public Pedido Agregar(@RequestBody Pedido pedido) {
        return servicio.Agregar(pedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> Actualizar(@PathVariable Long id, @RequestBody Pedido pedido) {
        Pedido actualizado = servicio.Actualizar(id, pedido);
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
