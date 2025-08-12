package com.montecafe.montecafe.inventario.controller;

import com.montecafe.montecafe.inventario.model.Inventario;
import com.montecafe.montecafe.inventario.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {
    @Autowired
    private InventarioRepository inventarioRepository;

    @GetMapping
    public List<Inventario> getAllInventario() {
        return inventarioRepository.findAll();
    }
}