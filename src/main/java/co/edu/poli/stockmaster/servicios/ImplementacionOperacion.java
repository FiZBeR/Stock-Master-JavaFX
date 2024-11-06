package co.edu.poli.stockmaster.servicios;

import co.edu.poli.stockmaster.modelo.Productos;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ImplementacionOperacion implements Operacion {

    /**
     * Default constructor
     */
    public ImplementacionOperacion() {
    }

    /**
     * 
     */
    private Productos [ ] productos;

    /**
     * @param x 
     * @return
     */
    public String create(Productos x) {
        // TODO implement Operacion.create() here
        return "";
    }

    /**
     * @param id_producto 
     * @param Parameter1
     */
    public void read(String id_producto, Productos Parameter1) {
        // TODO implement Operacion.read() here
    }

    /**
     * @param Parameter1
     */
    public void readall(Productos [ ] Parameter1) {
        // TODO implement Operacion.readall() here
    }

    /**
     * @param x 
     * @param id_producto 
     * @return
     */
    public String update(Productos x, String id_producto) {
        // TODO implement Operacion.update() here
        return "";
    }

    /**
     * @param id_producto 
     * @return
     */
    public Productos delete(String id_producto) {
        // TODO implement Operacion.delete() here
        return null;
    }

    /**
     * @param producto 
     * @param path 
     * @param name 
     * @return
     */
    public String serializar(Productos producto, String path, String name) {
        // TODO implement Operacion.serializar() here
        return "";
    }

    /**
     * @param path 
     * @param name 
     * @param Parameter1
     */
    public void deserializar(String path, String name, Productos [ ] Parameter1) {
        // TODO implement Operacion.deserializar() here
    }

}