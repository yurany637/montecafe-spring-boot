package com.montecafe.montecafe.inventario.controller;

import com.montecafe.montecafe.inventario.model.Inventario;
import com.montecafe.montecafe.inventario.repository.InventarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioRepository inventarioRepository;

    @GetMapping
    public List<Inventario> listar() {
        return inventarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inventario> obtenerPorId(@PathVariable Long id) {
        return inventarioRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Inventario guardar(@Valid @RequestBody Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inventario> actualizar(@PathVariable Long id, @Valid @RequestBody Inventario detalles) {
        return inventarioRepository.findById(id)
                .map(inventario -> {
                    inventario.setProducto(detalles.getProducto());
                    inventario.setCantidad(detalles.getCantidad());
                    Inventario updated = inventarioRepository.save(inventario);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (inventarioRepository.existsById(id)) {
            inventarioRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}