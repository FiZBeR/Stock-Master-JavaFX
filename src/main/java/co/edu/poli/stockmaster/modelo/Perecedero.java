package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Perecedero extends Alimentos {

    /**
     * 
     */
    private int caducidad;

    /**
     * 
     */
    private String condicion_almacenamiento;

    /**
     * 
     */
    private String tipo_envase;


    public Perecedero(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor, int caducidad, String condicion_almacenamiento, String tipo_envase) {
        super(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, ventas, fecha_ingreso, proveedor);
        this.caducidad = caducidad;
        this.condicion_almacenamiento = condicion_almacenamiento;
        this.tipo_envase = tipo_envase;
    }

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }

    public String getCondicion_almacenamiento() {
        return condicion_almacenamiento;
    }

    public void setCondicion_almacenamiento(String condicion_almacenamiento) {
        this.condicion_almacenamiento = condicion_almacenamiento;
    }

    public String getTipo_envase() {
        return tipo_envase;
    }

    public void setTipo_envase(String tipo_envase) {
        this.tipo_envase = tipo_envase;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "caducidad=" + caducidad +
                ", condicion_almacenamiento='" + condicion_almacenamiento + '\'' +
                ", tipo_envase='" + tipo_envase + '\'' +
                '}';
    }
}