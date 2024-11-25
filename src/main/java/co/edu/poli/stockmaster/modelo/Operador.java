package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un operador que puede estar involucrado en la gestión de árboles notables.
 * Incluye información personal como identificador, nombre, tipo sanguíneo y datos de contacto.
 */
public class Operador {

    /**
     * Identificador único del operador.
     */
    private String id_operador;

    /**
     * Nombre del operador.
     */
    private String nombre;

    /**
     * Tipo sanguíneo del operador.
     */
    private String tipo_sanguineo;

    /**
     * Número de contacto celular del operador.
     */
    private String contacto_celular;

    /**
     * Correo electrónico del operador.
     */
    private String correo;

    /**
     * Constructor de la clase Operador.
     *
     * @param id_operador Identificador único del operador.
     * @param nombre Nombre del operador.
     * @param tipo_sanguineo Tipo sanguíneo del operador.
     * @param contacto_celular Número de contacto celular del operador.
     * @param correo Correo electrónico del operador.
     */
    public Operador(String id_operador, String nombre, String tipo_sanguineo, String contacto_celular, String correo) {
        this.id_operador = id_operador;
        this.nombre = nombre;
        this.tipo_sanguineo = tipo_sanguineo;
        this.contacto_celular = contacto_celular;
        this.correo = correo;
    }

    /**
     * Obtiene el identificador único del operador.
     *
     * @return Identificador del operador.
     */
    public String getId_operador() {
        return id_operador;
    }

    /**
     * Establece el identificador único del operador.
     *
     * @param id_operador Identificador a establecer.
     */
    public void setId_operador(String id_operador) {
        this.id_operador = id_operador;
    }

    /**
     * Obtiene el nombre del operador.
     *
     * @return Nombre del operador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del operador.
     *
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo sanguíneo del operador.
     *
     * @return Tipo sanguíneo del operador.
     */
    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    /**
     * Establece el tipo sanguíneo del operador.
     *
     * @param tipo_sanguineo Tipo sanguíneo a establecer.
     */
    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    /**
     * Obtiene el contacto celular del operador.
     *
     * @return Número de contacto celular.
     */
    public String getContacto_celular() {
        return contacto_celular;
    }

    /**
     * Establece el contacto celular del operador.
     *
     * @param contacto_celular Número de contacto a establecer.
     */
    public void setContacto_celular(String contacto_celular) {
        this.contacto_celular = contacto_celular;
    }

    /**
     * Obtiene el correo electrónico del operador.
     *
     * @return Correo electrónico del operador.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del operador.
     *
     * @param correo Correo a establecer.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Retorna una representación en forma de cadena del operador.
     *
     * @return Cadena que representa las características del operador.
     */
    @Override
    public String toString() {
        return "Operador{" +
                "id_operador='" + id_operador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo_sanguineo='" + tipo_sanguineo + '\'' +
                ", contacto_celular='" + contacto_celular + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    /**
     * Método que simula el contacto con el operador.
     *
     * @return Mensaje de contacto.
     */
    public String contactar() {
        // TODO implement here
        return "";
    }
}
