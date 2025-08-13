package com.montecafe.montecafe.inventario.model;

import com.montecafe.montecafe.producto.model.Producto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull; // <-- Agrega esta importación

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "producto_id")
    @NotNull(message = "El producto es obligatorio.") // <-- Validación para el producto
    private Producto producto;

    @NotNull(message = "La cantidad es obligatoria.") // <-- Validación para la cantidad
    @Min(value = 0, message = "La cantidad no puede ser negativa.") // <-- La cantidad debe ser >= 0
    private int cantidad;

    public Inventario() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}