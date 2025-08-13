package com.montecafe.montecafe.cliente.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion; // <-- CAMBIO AQUÍ
    private String correo;
    private String telefono;

    public cliente() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; } // <-- CAMBIO EN EL GETTER
    public void setDireccion(String direccion) { this.direccion = direccion; } // <-- CAMBIO EN EL SETTER
    public String getcorreo() { return correo; }
    public void setcorreo(String correo) { this.correo = correo; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}