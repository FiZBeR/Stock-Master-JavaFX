package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa el estado de conservación de un árbol notable.
 * Proporciona información sobre el estado de salud, la fecha de revisión,
 * las medidas de protección aplicadas y comentarios adicionales.
 */
public class EstadodeConservacion {

    /**
     * Estado de salud del árbol.
     */
    private String estado_salud;

    /**
     * Fecha de la última revisión del estado de conservación.
     */
    private String fecha_revision;

    /**
     * Medida de protección aplicada al árbol.
     */
    private MedidadeProyeccion medida_proteccion;

    /**
     * Comentarios adicionales sobre el estado de conservación.
     */
    private String comentarios;

    /**
     * Constructor de la clase EstadodeConservacion.
     *
     * @param estado_salud Estado de salud del árbol.
     * @param fecha_revision Fecha de la última revisión.
     * @param medida_proteccion Medida de protección aplicada.
     * @param comentarios Comentarios adicionales.
     */
    public EstadodeConservacion(String estado_salud, String fecha_revision, MedidadeProyeccion medida_proteccion, String comentarios) {
        this.estado_salud = estado_salud;
        this.fecha_revision = fecha_revision;
        this.medida_proteccion = medida_proteccion;
        this.comentarios = comentarios;
    }

    /**
     * Obtiene el estado de salud del árbol.
     *
     * @return Estado de salud del árbol.
     */
    public String getEstado_salud() {
        return estado_salud;
    }

    /**
     * Establece el estado de salud del árbol.
     *
     * @param estado_salud Estado de salud del árbol.
     */
    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    /**
     * Obtiene la fecha de revisión del estado de conservación.
     *
     * @return Fecha de revisión del estado de conservación.
     */
    public String getFecha_revision() {
        return fecha_revision;
    }

    /**
     * Establece la fecha de revisión del estado de conservación.
     *
     * @param fecha_revision Fecha de revisión del estado de conservación.
     */
    public void setFecha_revision(String fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    /**
     * Obtiene la medida de protección aplicada al árbol.
     *
     * @return Medida de protección aplicada.
     */
    public MedidadeProyeccion getMedida_proteccion() {
        return medida_proteccion;
    }

    /**
     * Establece la medida de protección aplicada al árbol.
     *
     * @param medida_proteccion Medida de protección aplicada.
     */
    public void setMedida_proteccion(MedidadeProyeccion medida_proteccion) {
        this.medida_proteccion = medida_proteccion;
    }

    /**
     * Obtiene los comentarios adicionales sobre el estado de conservación.
     *
     * @return Comentarios sobre el estado de conservación.
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Establece los comentarios adicionales sobre el estado de conservación.
     *
     * @param comentarios Comentarios sobre el estado de conservación.
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Retorna una representación en forma de cadena del estado de conservación.
     *
     * @return Cadena que representa las características del estado de conservación.
     */
    @Override
    public String toString() {
        return "EstadodeConservacion{" +
                "estado_salud='" + estado_salud + '\'' +
                ", fecha_revision='" + fecha_revision + '\'' +
                ", medida_proteccion=" + medida_proteccion +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
