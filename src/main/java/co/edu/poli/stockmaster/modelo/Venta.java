package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Venta {

    /**
     * 
     */
    private String fecha_venta;

    /**
     * 
     */
    private int cantidad_vendida;

    /**
     * 
     */
    private Vendedor vendedor;

    /**
     * 
     */
    private int valor_total;


    public Venta(String fecha_venta, int cantidad_vendida, Vendedor vendedor, int valor_total) {
        this.fecha_venta = fecha_venta;
        this.cantidad_vendida = cantidad_vendida;
        this.vendedor = vendedor;
        this.valor_total = valor_total;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha_venta='" + fecha_venta + '\'' +
                ", cantidad_vendida=" + cantidad_vendida +
                ", vendedor=" + vendedor +
                ", valor_total=" + valor_total +
                '}';
    }
}