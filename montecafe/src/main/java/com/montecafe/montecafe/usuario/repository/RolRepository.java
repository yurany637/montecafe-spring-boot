package com.montecafe.montecafe.usuario.repository;

import com.montecafe.montecafe.usuario.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}