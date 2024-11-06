package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Proveedor {

    /**
     * 
     */
    private String id_proveedor;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String direccion;

    /**
     * 
     */
    private String telefono;

    /**
     * 
     */
    private String contacto_principal;

    public Proveedor(String id_proveedor, String nombre, String direccion, String telefono, String contacto_principal) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contacto_principal = contacto_principal;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto_principal() {
        return contacto_principal;
    }

    public void setContacto_principal(String contacto_principal) {
        this.contacto_principal = contacto_principal;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id_proveedor='" + id_proveedor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", contacto_principal='" + contacto_principal + '\'' +
                '}';
    }
}