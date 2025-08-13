package com.montecafe.montecafe.venta.model;

import com.montecafe.montecafe.producto.model.Producto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMin;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    @NotNull(message = "El producto es obligatorio.")
    private Producto producto;

    @Min(value = 1, message = "La cantidad debe ser al menos 1.")
    private int cantidad;

    @DecimalMin(value = "0.01", message = "El precio unitario debe ser un valor positivo.")
    private double precioUnitario;

    @DecimalMin(value = "0.01", message = "El precio total debe ser un valor positivo.")
    private double precioTotal;

    public DetalleVenta() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }
    public double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(double precioTotal) { this.precioTotal = precioTotal; }
}