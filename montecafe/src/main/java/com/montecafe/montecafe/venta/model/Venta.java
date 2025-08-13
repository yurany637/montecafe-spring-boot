package com.montecafe.montecafe.venta.model;

import com.montecafe.montecafe.cliente.model.cliente;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @NotNull(message = "El cliente es obligatorio.") // <-- Validación agregada
    private cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "venta_id")
    @NotNull(message = "Una venta debe tener al menos un detalle.")
    @Size(min = 1, message = "Una venta debe tener al menos un detalle.") // <-- Validación agregada
    private List<DetalleVenta> detalles;

    @NotNull(message = "La fecha de venta es obligatoria.") // <-- Validación agregada
    private LocalDateTime fechaVenta;

    @DecimalMin(value = "0.0", message = "El valor total no puede ser negativo.") // <-- Validación agregada
    private double valorTotal;

    public Venta() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public cliente getCliente() { return cliente; }
    public void setcliente(cliente cliente) { this.cliente = cliente; }
    public List<DetalleVenta> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleVenta> detalles) { this.detalles = detalles; }
    public LocalDateTime getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(LocalDateTime fechaVenta) { this.fechaVenta = fechaVenta; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}