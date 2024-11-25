package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa una medida de protección aplicada a un árbol notable.
 * Incluye información sobre el tipo de protección, la fecha de inicio y
 * la autoridad responsable de la medida.
 */
public class MedidadeProyeccion {

    /**
     * Tipo de protección aplicada al árbol notable (por ejemplo, conservación, restauración).
     */
    private String tipo_proteccion;

    /**
     * Fecha de inicio de la medida de protección.
     */
    private String fecha_inicio;

    /**
     * Autoridad responsable de la medida de protección.
     */
    private Institucion autoridad;

    /**
     * Constructor de la clase MedidadeProyeccion.
     *
     * @param tipo_proteccion Tipo de protección aplicada.
     * @param fecha_inicio Fecha de inicio de la medida de protección.
     * @param autoridad Autoridad responsable de la medida de protección.
     */
    public MedidadeProyeccion(String tipo_proteccion, String fecha_inicio, Institucion autoridad) {
        this.tipo_proteccion = tipo_proteccion;
        this.fecha_inicio = fecha_inicio;
        this.autoridad = autoridad;
    }

    /**
     * Obtiene el tipo de protección aplicada.
     *
     * @return Tipo de protección.
     */
    public String getTipo_proteccion() {
        return tipo_proteccion;
    }

    /**
     * Establece el tipo de protección aplicada.
     *
     * @param tipo_proteccion Tipo de protección a establecer.
     */
    public void setTipo_proteccion(String tipo_proteccion) {
        this.tipo_proteccion = tipo_proteccion;
    }

    /**
     * Obtiene la fecha de inicio de la medida de protección.
     *
     * @return Fecha de inicio de la medida de protección.
     */
    public String getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * Establece la fecha de inicio de la medida de protección.
     *
     * @param fecha_inicio Fecha de inicio a establecer.
     */
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * Obtiene la autoridad responsable de la medida de protección.
     *
     * @return Autoridad responsable.
     */
    public Institucion getAutoridad() {
        return autoridad;
    }

    /**
     * Establece la autoridad responsable de la medida de protección.
     *
     * @param autoridad Autoridad a establecer.
     */
    public void setAutoridad(Institucion autoridad) {
        this.autoridad = autoridad;
    }

    /**
     * Retorna una representación en forma de cadena de la medida de proyección.
     *
     * @return Cadena que representa las características de la medida de proyección.
     */
    @Override
    public String toString() {
        return "MedidadeProyeccion{" +
                "tipo_proteccion='" + tipo_proteccion + '\'' +
                ", fecha_inicio='" + fecha_inicio + '\'' +
                ", autoridad=" + autoridad +
                '}';
    }
}
