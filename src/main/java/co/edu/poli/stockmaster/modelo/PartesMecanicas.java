package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PartesMecanicas extends AutoPartes {
    /**
     * 
     */
    private String modelos_compatibles;

    /**
     * 
     */
    private String material;

    /**
     * 
     */
    private double peso;

    public PartesMecanicas(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor, String modelos_compatibles, String material, double peso) {
        super(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, ventas, fecha_ingreso, proveedor);
        this.modelos_compatibles = modelos_compatibles;
        this.material = material;
        this.peso = peso;
    }

    public String getModelos_compatibles() {
        return modelos_compatibles;
    }

    public void setModelos_compatibles(String modelos_compatibles) {
        this.modelos_compatibles = modelos_compatibles;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "PartesMecanicas{" +
                "modelos_compatibles='" + modelos_compatibles + '\'' +
                ", material='" + material + '\'' +
                ", peso=" + peso +
                '}';
    }
}