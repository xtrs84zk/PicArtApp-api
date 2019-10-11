package com.four.picartapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Venta")
public class Venta {
    @Column
    @Id
    @GeneratedValue
    private int idVenta;
    @Column
    private String fecha;
    @Column
    private int montoTotal;
    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name = "idIntegrante")
    private Integrante integrante;

    public Venta() {
    }

    public Venta(int idVenta, String fecha, int montoTotal, Cliente cliente, Integrante integrante) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.integrante = integrante;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getmontoTotal() {
        return montoTotal;
    }

    public void setmontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
}
