package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PartesElectricas extends AutoPartes {

    /**
     * 
     */
    private double voltaje;

    /**
     * 
     */
    private String consumo_energia;

    /**
     * 
     */
    private boolean resistencia_al_agua;

    /**
     * 
     */
    private String modelos_compatibles;

    public PartesElectricas(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor, double voltaje, String consumo_energia, boolean resistencia_al_agua, String modelos_compatibles) {
        super(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, ventas, fecha_ingreso, proveedor);
        this.voltaje = voltaje;
        this.consumo_energia = consumo_energia;
        this.resistencia_al_agua = resistencia_al_agua;
        this.modelos_compatibles = modelos_compatibles;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public String getConsumo_energia() {
        return consumo_energia;
    }

    public void setConsumo_energia(String consumo_energia) {
        this.consumo_energia = consumo_energia;
    }

    public boolean isResistencia_al_agua() {
        return resistencia_al_agua;
    }

    public void setResistencia_al_agua(boolean resistencia_al_agua) {
        this.resistencia_al_agua = resistencia_al_agua;
    }

    public String getModelos_compatibles() {
        return modelos_compatibles;
    }

    public void setModelos_compatibles(String modelos_compatibles) {
        this.modelos_compatibles = modelos_compatibles;
    }

    @Override
    public String toString() {
        return "PartesElectricas{" +
                "voltaje=" + voltaje +
                ", consumo_energia='" + consumo_energia + '\'' +
                ", resistencia_al_agua=" + resistencia_al_agua +
                ", modelos_compatibles='" + modelos_compatibles + '\'' +
                '}';
    }
}