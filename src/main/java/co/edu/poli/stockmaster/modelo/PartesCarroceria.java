package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PartesCarroceria extends AutoPartes {


    /**
     * 
     */
    private String color;

    /**
     * 
     */
    private String material;

    /**
     * 
     */
    private Dimensiones dimensiones;

    /**
     * 
     */
    private double peso;

    public PartesCarroceria(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor, String color, String material, Dimensiones dimensiones, double peso) {
        super(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, ventas, fecha_ingreso, proveedor);
        this.color = color;
        this.material = material;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "PartesCarroceria{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", dimensiones=" + dimensiones +
                ", peso=" + peso +
                '}';
    }
}