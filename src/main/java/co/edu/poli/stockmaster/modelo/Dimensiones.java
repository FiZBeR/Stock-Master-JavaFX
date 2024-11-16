package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Dimensiones {

    /**
     * Default constructor
     */
    public Dimensiones() {
    }

    /**
     * 
     */
    private double largo;

    /**
     * 
     */
    private double ancho;

    /**
     * 
     */
    private double alto;

    public Dimensiones(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }
}