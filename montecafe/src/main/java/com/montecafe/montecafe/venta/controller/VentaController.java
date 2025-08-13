package com.montecafe.montecafe.venta.controller;

import com.montecafe.montecafe.venta.model.Venta;
import com.montecafe.montecafe.venta.repository.VentaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaRepository ventaRepository;

    @GetMapping
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> obtenerPorId(@PathVariable Long id) {
        return ventaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Venta guardar(@Valid @RequestBody Venta venta) {
        return ventaRepository.save(venta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> actualizar(@PathVariable Long id, @Valid @RequestBody Venta detalles) {
        return ventaRepository.findById(id)
                .map(venta -> {
                    venta.setcliente(detalles.getCliente());
                    venta.setDetalles(detalles.getDetalles());
                    venta.setFechaVenta(detalles.getFechaVenta());
                    venta.setValorTotal(detalles.getValorTotal());
                    Venta updated = ventaRepository.save(venta);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (ventaRepository.existsById(id)) {
            ventaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}