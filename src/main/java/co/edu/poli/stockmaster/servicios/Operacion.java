package co.edu.poli.stockmaster.servicios;

import co.edu.poli.stockmaster.modelo.Productos;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Operacion {

    /**
     * @param x 
     * @return
     */
    public String create(Productos x);

    /**
     * @param id_producto 
     * @param Parameter1
     */
    public void read(String id_producto, Productos Parameter1);

    /**
     * @param Parameter1
     */
    public void readall(Productos [ ] Parameter1);

    /**
     * @param x 
     * @param id_producto 
     * @return
     */
    public String update(Productos x, String id_producto);

    /**
     * @param id_producto 
     * @return
     */
    public Productos delete(String id_producto);

    /**
     * @param producto 
     * @param path 
     * @param name 
     * @return
     */
    public String serializar(Productos producto, String path, String name);

    /**
     * @param path 
     * @param name 
     * @param Parameter1
     */
    public void deserializar(String path, String name, Productos [ ] Parameter1);

}