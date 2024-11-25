package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa una institución que puede estar relacionada
 * con el cuidado y conservación de árboles notables. Proporciona
 * información sobre el nombre, contacto y tipo de entidad de la institución.
 */
public class Institucion {

    /**
     * Nombre de la institución.
     */
    private String nombre;

    /**
     * Información de contacto de la institución.
     */
    private String contacto;

    /**
     * Tipo de entidad a la que pertenece la institución (por ejemplo, pública, privada).
     */
    private String tipo_entidad;

    /**
     * Constructor de la clase Institucion.
     *
     * @param nombre Nombre de la institución.
     * @param contacto Información de contacto de la institución.
     * @param tipo_entidad Tipo de entidad a la que pertenece la institución.
     */
    public Institucion(String nombre, String contacto, String tipo_entidad) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.tipo_entidad = tipo_entidad;
    }

    /**
     * Obtiene el nombre de la institución.
     *
     * @return Nombre de la institución.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la institución.
     *
     * @param nombre Nombre de la institución.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la información de contacto de la institución.
     *
     * @return Información de contacto de la institución.
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Establece la información de contacto de la institución.
     *
     * @param contacto Información de contacto de la institución.
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * Obtiene el tipo de entidad a la que pertenece la institución.
     *
     * @return Tipo de entidad de la institución.
     */
    public String getTipo_entidad() {
        return tipo_entidad;
    }

    /**
     * Establece el tipo de entidad a la que pertenece la institución.
     *
     * @param tipo_entidad Tipo de entidad de la institución.
     */
    public void setTipo_entidad(String tipo_entidad) {
        this.tipo_entidad = tipo_entidad;
    }

    /**
     * Retorna una representación en forma de cadena de la institución.
     *
     * @return Cadena que representa las características de la institución.
     */
    @Override
    public String toString() {
        return "Institucion{" +
                "nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                ", tipo_entidad='" + tipo_entidad + '\'' +
                '}';
    }

    /**
     * Método para contactar a la institución.
     *
     * @return Cadena vacía. Este método debe ser implementado con la lógica de contacto.
     */
    public String contactar() {
        // TODO implement here
        return "";
    }

}
