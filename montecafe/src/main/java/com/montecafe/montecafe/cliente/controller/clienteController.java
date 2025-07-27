package com.montecafe.montecafe.cliente.controller;

import com.montecafe.montecafe.cliente.model.cliente;
import com.montecafe.montecafe.cliente.service.clienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class clienteController {

    private final clienteService clienteService;

    public clienteController(clienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.listarTodos());
        return "clientes/lista"; // Vista Thymeleaf (se creará luego)
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new cliente());
        return "clientes/formulario";
    }

    @PostMapping
    public String guardarCliente(@ModelAttribute cliente cliente) {
        clienteService.guardar(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editar/{id}")
    public String editarCliente(@PathVariable Long id, Model model) {
        model.addAttribute("cliente", clienteService.obtenerPorId(id));
        return "clientes/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        clienteService.eliminar(id);
        return "redirect:/clientes";
    }
}