package com.four.picartapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "VentaDetalle")
public class  VentaDetalle {
    @Column
    int idVentaDetalle;
    @Column
    int cantidad;
    @Column
    int importe;
    @JoinColumn(name = "idVenta")
    Venta venta;
    @JoinColumn(name = "idProducto")
    Producto producto;

    public VentaDetalle(int idVentaDetalle, int cantidad, int importe, Venta venta, Producto producto) {
        this.idVentaDetalle = idVentaDetalle;
        this.cantidad = cantidad;
        this.importe = importe;
        this.venta = venta;
        this.producto = producto;
    }

    public int getIdVentaDetalle() {
        return idVentaDetalle;
    }

    public void setIdVentaDetalle(int idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
