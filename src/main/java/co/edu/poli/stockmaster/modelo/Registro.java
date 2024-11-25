package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un registro asociado a un operador.
 * Incluye información sobre el operador y la fecha del registro.
 */
public class Registro {

    /**
     * Operador asociado a este registro.
     */
    private Operador operador;

    /**
     * Fecha en la que se realizó el registro.
     */
    private String fecha_registro;

    /**
     * Constructor de la clase Registro.
     *
     * @param operador Operador asociado a este registro.
     * @param fecha_registro Fecha en la que se realizó el registro.
     */
    public Registro(Operador operador, String fecha_registro) {
        this.operador = operador;
        this.fecha_registro = fecha_registro;
    }

    /**
     * Obtiene el operador asociado a este registro.
     *
     * @return Operador asociado.
     */
    public Operador getOperador() {
        return operador;
    }

    /**
     * Establece el operador asociado a este registro.
     *
     * @param operador Operador a establecer.
     */
    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    /**
     * Obtiene la fecha en la que se realizó el registro.
     *
     * @return Fecha de registro.
     */
    public String getFecha_registro() {
        return fecha_registro;
    }

    /**
     * Establece la fecha en la que se realizó el registro.
     *
     * @param fecha_registro Fecha a establecer.
     */
    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /**
     * Retorna una representación en forma de cadena del registro.
     *
     * @return Cadena que representa las características del registro.
     */
    @Override
    public String toString() {
        return "Registro{" +
                "operador=" + operador +
                ", fecha_registro='" + fecha_registro + '\'' +
                '}';
    }

    /**
     * Método para enviar un mensaje asociado a un operador.
     *
     * @param mensaje Mensaje a enviar.
     * @param id_operador Identificador del operador al que se envía el mensaje.
     */
    public void enviar_mensaje(String mensaje, String id_operador) {
        // TODO implement here
    }

}
