package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase abstracta que representa una especie, que puede ser un árbol
 * u otro tipo de planta. Proporciona atributos básicos como nombre
 * científico, nombre común y origen, así como métodos para acceder
 * y modificar estos atributos.
 */
public abstract class Especie implements Serializable {

    /**
     * Nombre científico de la especie.
     */
    private String nombre_cientifico;

    /**
     * Nombre común de la especie.
     */
    private String nombre_comun;

    /**
     * Origen de la especie.
     */
    private String origen;

    /**
     * Constructor de la clase Especie.
     *
     * @param nombre_cientifico Nombre científico de la especie.
     * @param nombre_comun Nombre común de la especie.
     * @param origen Origen de la especie.
     */
    public Especie(String nombre_cientifico, String nombre_comun, String origen) {
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;
        this.origen = origen;
    }

    /**
     * Obtiene el nombre científico de la especie.
     *
     * @return Nombre científico de la especie.
     */
    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    /**
     * Establece el nombre científico de la especie.
     *
     * @param nombre_cientifico Nombre científico de la especie.
     */
    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    /**
     * Obtiene el nombre común de la especie.
     *
     * @return Nombre común de la especie.
     */
    public String getNombre_comun() {
        return nombre_comun;
    }

    /**
     * Establece el nombre común de la especie.
     *
     * @param nombre_comun Nombre común de la especie.
     */
    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    /**
     * Obtiene el origen de la especie.
     *
     * @return Origen de la especie.
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el origen de la especie.
     *
     * @param origen Origen de la especie.
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Retorna una representación en forma de cadena de la especie.
     *
     * @return Cadena que representa las características de la especie.
     */
    @Override
    public String toString() {
        return "Especie{" +
                "nombre_cientifico='" + nombre_cientifico + '\'' +
                ", nombre_comun='" + nombre_comun + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }
}
