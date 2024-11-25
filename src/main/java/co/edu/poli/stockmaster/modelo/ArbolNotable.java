package co.edu.poli.stockmaster.modelo;

import co.edu.poli.stockmaster.servicios.Ubicacion;

import java.io.*;
import java.util.*;

/**
 * Representa un árbol notable, que extiende las características de un árbol
 * común y agrega atributos específicos como identificación, ubicación, registro
 * y estado de conservación.
 */
public class ArbolNotable extends Arbol {

    /**
     * Identificación única del árbol notable.
     */
    private String id;

    /**
     * Ubicación geográfica del árbol notable.
     */
    public Ubicacion ubicacion;

    /**
     * Registro relacionado con el árbol notable.
     */
    private Registro registro;

    /**
     * Estado de conservación del árbol notable.
     */
    private EstadodeConservacion[] estado;

    /**
     * Constructor de la clase ArbolNotable.
     *
     * @param nombre_cientifico Nombre científico del árbol.
     * @param nombre_comun Nombre común del árbol.
     * @param origen Origen del árbol.
     * @param altura Altura del árbol en metros.
     * @param diametro_tronco Diámetro del tronco en metros.
     * @param edad_estimada Edad estimada del árbol en años.
     * @param id Identificación única del árbol notable.
     * @param ubicacion Ubicación geográfica del árbol.
     * @param registro Registro relacionado con el árbol.
     * @param estado Estado de conservación del árbol.
     */
    public ArbolNotable(String nombre_cientifico, String nombre_comun, String origen, double altura, double diametro_tronco, int edad_estimada, String id, Ubicacion ubicacion, Registro registro, EstadodeConservacion[] estado) {
        super(nombre_cientifico, nombre_comun, origen, altura, diametro_tronco, edad_estimada);
        this.id = id;
        this.ubicacion = ubicacion;
        this.registro = registro;
        this.estado = estado;
    }

    /**
     * Obtiene la identificación del árbol notable.
     *
     * @return Identificación única del árbol notable.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece la identificación del árbol notable.
     *
     * @param id Identificación única del árbol notable.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la ubicación del árbol notable.
     *
     * @return Ubicación geográfica del árbol.
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del árbol notable.
     *
     * @param ubicacion Ubicación geográfica del árbol.
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene el registro relacionado con el árbol notable.
     *
     * @return Registro del árbol notable.
     */
    public Registro getRegistro() {
        return registro;
    }

    /**
     * Establece el registro relacionado con el árbol notable.
     *
     * @param registro Registro del árbol notable.
     */
    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    /**
     * Obtiene el estado de conservación del árbol notable.
     *
     * @return Estado de conservación del árbol notable.
     */
    public EstadodeConservacion[] getEstado() {
        return estado;
    }

    /**
     * Establece el estado de conservación del árbol notable.
     *
     * @param estado Estado de conservación del árbol notable.
     */
    public void setEstado(EstadodeConservacion[] estado) {
        this.estado = estado;
    }

    /**
     * Retorna una representación en forma de cadena del objeto ArbolNotable.
     *
     * @return Cadena que representa las características del árbol notable.
     */
    @Override
    public String toString() {
        return "ArbolNotable{" +
                "id='" + id + '\'' +
                ", ubicacion=" + ubicacion +
                ", registro=" + registro +
                ", estado=" + Arrays.toString(estado) +
                '}';
    }

    /**
     * Calcula el tiempo de conservación del árbol notable a partir de una fecha dada.
     *
     * @param fecha Fecha desde la cual se calcula el tiempo de conservación.
     * @param Parameter1 Un parámetro adicional para el cálculo (su uso debe definirse).
     */
    public void tiempo_de_conservacion(String fecha, int Parameter1) {
        // TODO implement here
    }
}
