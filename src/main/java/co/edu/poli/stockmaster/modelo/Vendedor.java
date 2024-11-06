package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Vendedor {

    /**
     * 
     */
    private String id_vendedor;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private int telefono;

    public Vendedor(String id_vendedor, String nombre, String email, int telefono) {
        this.id_vendedor = id_vendedor;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id_vendedor='" + id_vendedor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}