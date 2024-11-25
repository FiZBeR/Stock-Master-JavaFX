package co.edu.poli.stockmaster.servicios;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un par de coordenadas geográficas.
 * Incluye la latitud y longitud.
 */
public class Coordenadas {

    /**
     * Latitud de la ubicación.
     */
    private double latitud;

    /**
     * Longitud de la ubicación.
     */
    private double longitud;

    /**
     * Constructor de la clase Coordenadas.
     *
     * @param latitud Latitud de la ubicación.
     * @param longitud Longitud de la ubicación.
     */
    public Coordenadas(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    /**
     * Obtiene la latitud de la ubicación.
     *
     * @return Latitud.
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Establece la latitud de la ubicación.
     *
     * @param latitud Latitud a establecer.
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Obtiene la longitud de la ubicación.
     *
     * @return Longitud.
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Establece la longitud de la ubicación.
     *
     * @param longitud Longitud a establecer.
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
