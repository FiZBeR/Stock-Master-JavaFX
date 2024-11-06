package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class NoPerecedero extends Alimentos {

    /**
     *
     */
    private int durabilidad;

    /**
     *
     */
    private String tipo_envase;


    public NoPerecedero(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor, int durabilidad, String tipo_envase) {
        super(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, ventas, fecha_ingreso, proveedor);
        this.durabilidad = durabilidad;
        this.tipo_envase = tipo_envase;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public String getTipo_envase() {
        return tipo_envase;
    }

    public void setTipo_envase(String tipo_envase) {
        this.tipo_envase = tipo_envase;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "durabilidad=" + durabilidad +
                ", tipo_envase='" + tipo_envase + '\'' +
                '}';
    }
}