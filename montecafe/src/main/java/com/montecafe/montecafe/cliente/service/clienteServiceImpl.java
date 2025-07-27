package com.montecafe.montecafe.cliente.service;

import com.montecafe.montecafe.cliente.model.cliente;
import com.montecafe.montecafe.cliente.repository.clienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class clienteServiceImpl implements clienteService {

    private final clienteRepository clienteRepository;

    public clienteServiceImpl(clienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public cliente guardar(cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public cliente obtenerPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + id));
    }

    @Override
    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}