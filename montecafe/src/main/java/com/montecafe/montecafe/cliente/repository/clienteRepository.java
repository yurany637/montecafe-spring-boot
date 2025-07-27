package com.montecafe.montecafe.cliente.repository;

import com.montecafe.montecafe.cliente.model.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends JpaRepository<cliente, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}