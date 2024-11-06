package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class AutoPartes extends Productos {
    public AutoPartes(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor) {
        super(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, ventas, fecha_ingreso, proveedor);
    }
}