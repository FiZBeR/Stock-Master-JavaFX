package co.edu.poli.stockmaster.servicios;

import java.io.*;
import java.util.*;

/**
 * Clase que representa una ubicación geográfica.
 * Incluye coordenadas y detalles sobre la ciudad, localidad, barrio y dirección.
 */
public class Ubicacion {
    /**
     * Coordenadas geográficas de la ubicación.
     */
    private Coordenadas coordenadas;

    /**
     * Nombre de la ciudad donde se encuentra la ubicación.
     */
    private String ciudad;

    /**
     * Nombre de la localidad de la ubicación.
     */
    private String localidad;

    /**
     * Nombre del barrio de la ubicación.
     */
    private String barrio;

    /**
     * Dirección específica de la ubicación.
     */
    private String direccion;

    /**
     * Constructor que inicializa una instancia de la clase Ubicacion.
     *
     * @param coordenadas Coordenadas geográficas de la ubicación.
     * @param ciudad Nombre de la ciudad.
     * @param localidad Nombre de la localidad.
     * @param barrio Nombre del barrio.
     * @param direccion Dirección específica.
     */
    public Ubicacion(Coordenadas coordenadas, String ciudad, String localidad, String barrio, String direccion) {
        this.coordenadas = coordenadas;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.barrio = barrio;
        this.direccion = direccion;
    }

    /**
     * Obtiene las coordenadas de la ubicación.
     *
     * @return Coordenadas de la ubicación.
     */
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    /**
     * Establece las coordenadas de la ubicación.
     *
     * @param coordenadas Nuevas coordenadas de la ubicación.
     */
    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Obtiene el nombre de la ciudad.
     *
     * @return Nombre de la ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece el nombre de la ciudad.
     *
     * @param ciudad Nuevo nombre de la ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el nombre de la localidad.
     *
     * @return Nombre de la localidad.
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Establece el nombre de la localidad.
     *
     * @param localidad Nuevo nombre de la localidad.
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Obtiene el nombre del barrio.
     *
     * @return Nombre del barrio.
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * Establece el nombre del barrio.
     *
     * @param barrio Nuevo nombre del barrio.
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * Obtiene la dirección específica de la ubicación.
     *
     * @return Dirección de la ubicación.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección específica de la ubicación.
     *
     * @param direccion Nueva dirección de la ubicación.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Retorna una representación en forma de cadena de la ubicación.
     *
     * @return Cadena que representa la ubicación.
     */
    @Override
    public String toString() {
        return "Ubicacion{" +
                "coordenadas=" + coordenadas +
                ", ciudad='" + ciudad + '\'' +
                ", localidad='" + localidad + '\'' +
                ", barrio='" + barrio + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
