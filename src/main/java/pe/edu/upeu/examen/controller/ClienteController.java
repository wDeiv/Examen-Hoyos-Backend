package pe.edu.upeu.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.examen.model.Cliente;
import pe.edu.upeu.examen.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService servicio;

    @GetMapping
    public List<Cliente> ListarClientes() {
        return servicio.ListarClientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> BuscarPorId(@PathVariable Long id) {
        Cliente cliente = servicio.BuscarPorId(id);
        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public Cliente Agregar(@RequestBody Cliente cliente) {
        return servicio.Agregar(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> Actualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente actualizado = servicio.Actualizar(id, cliente);
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
