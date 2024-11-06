package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Productos {
    /**
     * 
     */
    private String id_producto;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private int cantidad;

    /**
     * 
     */
    private int costo;

    /**
     * 
     */
    private int valor;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private boolean disponible;

    /**
     * 
     */
    private Venta [ ] ventas;

    /**
     * 
     */
    private FechaIngreso fecha_ingreso;

    /**
     * 
     */
    private Proveedor proveedor;

    public Productos(String id_producto, String nombre, int cantidad, int costo, int valor, String descripcion, boolean disponible, Venta[] ventas, FechaIngreso fecha_ingreso, Proveedor proveedor) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.valor = valor;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.ventas = ventas;
        this.fecha_ingreso = fecha_ingreso;
        this.proveedor = proveedor;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Venta[] getVentas() {
        return ventas;
    }

    public void setVentas(Venta[] ventas) {
        this.ventas = ventas;
    }

    public FechaIngreso getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(FechaIngreso fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id_producto='" + id_producto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", costo=" + costo +
                ", valor=" + valor +
                ", descripcion='" + descripcion + '\'' +
                ", disponible=" + disponible +
                ", ventas=" + Arrays.toString(ventas) +
                ", fecha_ingreso=" + fecha_ingreso +
                ", proveedor=" + proveedor +
                '}';
    }

    /**
     * @return
     */
    public String[] alerta_stock(Productos[] productos) {
        int auxiCont = 0;
        String[] auxi = new String[20];
        for (int i = 0; i < productos.length; i++){
            if (productos[i].cantidad < 10){
                auxi[i] = productos[i].nombre + "Stock Bajo, solo quedan: " + productos[i].cantidad;
                auxiCont++;
            }
        }
        return auxi;
    }

    /**
     * @return
     */
    public String [] estado_stock(Productos[] productos) {
        int auxiCont = 0;
        String[] auxi = new String[productos.length];
        for (int i = 0; i < productos.length; i++){
            if (productos[i].cantidad < 10){
                auxi[i] = productos[i].nombre + "estado: Bajo";
                auxiCont++;
            } else if (productos[i].cantidad > 10 && productos[i].cantidad < 20){
                auxi[i] = productos[i].nombre + "estado: Aceptable";
                auxiCont++;
            } else if (productos[i].cantidad < 20 ) {
                auxi[i] = productos[i].nombre + "estado: Optimo";
                auxiCont++;
            }
        }
        return auxi;
    }

    /**
     * @param producto 
     * @return
     */
    public int ganancias_totales(Productos producto) {
        int costo = producto.getCosto();
        int valor = producto.getValor();
        int cantidad = 0;
        int ganancia_final;
        for (int i = 0; i < producto.ventas.length; i++){
            cantidad += producto.ventas[i].getCantidad_vendida();
        }
        ganancia_final = (valor * cantidad) - (costo * cantidad);
        return ganancia_final;
    }

    /**
     * @return
     */
    public String estatus_ventas() {
        // TODO implement here
        return "";
    }

}