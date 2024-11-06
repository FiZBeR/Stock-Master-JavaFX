package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Alimentos extends Productos {

    public Alimentos(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor) {
        super(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, ventas, fecha_ingreso, proveedor);
    }


    /**
     * @return
     */
    public String [] proximo_a_vencer(Productos[] productos) {

        LocalDate fechaActual = LocalDate.now();
        String fechaComoCadena = fechaActual.toString();
        String[] fechaDia = fechaComoCadena.split("-");
        int mes = Integer.parseInt(fechaDia[1]);
        int dia = Integer.parseInt(fechaDia[2]);
        int conteo = 0;
        String[] auxi = new String[10];
        for (int i = 0; i < productos.length; i++){
            if (productos[i] instanceof Alimentos){
                FechaIngreso fechaIngreso = productos[i].getFecha_ingreso();
                int diaObjeto = fechaIngreso.getMes();
                int mesObjeto = fechaIngreso.getDia();

                if (mes == mesObjeto){
                    if (dia < diaObjeto){
                        auxi[i] = "El producto: " + productos[i].getNombre() + " con ID: " + productos[i].getId_producto() + "esta proximo a vencer";
                        conteo++;
                        if (conteo == 9){
                            return auxi;
                        }
                    }
                }
            }
        }
        return auxi;
    }

    /**
     * @return
     */
    public String[] vencido(Productos[] productos) {
        LocalDate fechaActual = LocalDate.now();
        String fechaComoCadena = fechaActual.toString();
        String[] fechaDia = fechaComoCadena.split("-");
        int mes = Integer.parseInt(fechaDia[1]);
        int dia = Integer.parseInt(fechaDia[2]);
        int conteo = 0;
        String[] auxi = new String[10];
        for (int i = 0; i < productos.length; i++){
            if (productos[i] instanceof Alimentos){
                FechaIngreso fechaIngreso = productos[i].getFecha_ingreso();
                int diaObjeto = fechaIngreso.getMes();
                int mesObjeto = fechaIngreso.getDia();

                if (mes == mesObjeto){
                    if (dia >= diaObjeto){
                        auxi[i] = "El producto: " + productos[i].getNombre() + " con ID: " + productos[i].getId_producto() + "esta proximo a vencer";
                        conteo++;
                        if (conteo == 9){
                            return auxi;
                        }
                    }
                }
            }
        }
        return auxi;
    }

}