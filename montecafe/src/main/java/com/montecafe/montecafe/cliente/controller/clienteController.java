package com.montecafe.montecafe.cliente.controller;

import com.montecafe.montecafe.cliente.model.cliente;
import com.montecafe.montecafe.cliente.repository.clienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class clienteController {

    @Autowired
    private clienteRepository clienteRepository;

    @GetMapping
    public List<cliente> listar() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<cliente> obtenerPorId(@PathVariable Long id) {
        return clienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public cliente guardar(@RequestBody cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<cliente> actualizar(@PathVariable Long id, @RequestBody cliente detalles) {
        return clienteRepository.findById(id)
                .map(cliente -> {
                    cliente.setNombre(detalles.getNombre());
                    cliente.setDireccion(detalles.getDireccion()); // <-- CAMBIO AQUÍ
                    cliente.setcorreo(detalles.getcorreo());
                    cliente.setTelefono(detalles.getTelefono());
                    cliente updated = clienteRepository.save(cliente);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}