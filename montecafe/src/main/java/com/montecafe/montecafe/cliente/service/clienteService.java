package com.montecafe.montecafe.cliente.service;

import com.montecafe.montecafe.cliente.model.cliente;
import java.util.List;

public interface clienteService {
    List<cliente> listarTodos();
    cliente guardar(cliente cliente);
    cliente obtenerPorId(Long id);
    void eliminar(Long id);
}