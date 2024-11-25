package co.edu.poli.stockmaster.modelo;

import java.io.*;
import java.util.*;

/**
 * Representa un árbol con atributos específicos como altura, diámetro del tronco y edad estimada.
 * Esta clase extiende de la clase {@link Especie} para incluir información común a todas las especies.
 */
public class Arbol extends Especie {

    /**
     * Altura del árbol en metros.
     */
    private double altura;

    /**
     * Diámetro del tronco del árbol en metros.
     */
    private double diametro_tronco;

    /**
     * Edad estimada del árbol en años.
     */
    private int edad_estimada;

    /**
     * Constructor de la clase Arbol.
     *
     * @param nombre_cientifico Nombre científico del árbol.
     * @param nombre_comun Nombre común del árbol.
     * @param origen Origen del árbol.
     * @param altura Altura del árbol en metros.
     * @param diametro_tronco Diámetro del tronco en metros.
     * @param edad_estimada Edad estimada del árbol en años.
     */
    public Arbol(String nombre_cientifico, String nombre_comun, String origen, double altura, double diametro_tronco, int edad_estimada) {
        super(nombre_cientifico, nombre_comun, origen);
        this.altura = altura;
        this.diametro_tronco = diametro_tronco;
        this.edad_estimada = edad_estimada;
    }

    /**
     * Obtiene la altura del árbol.
     *
     * @return Altura del árbol en metros.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura del árbol.
     *
     * @param altura Altura del árbol en metros.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Obtiene el diámetro del tronco del árbol.
     *
     * @return Diámetro del tronco en metros.
     */
    public double getDiametro_tronco() {
        return diametro_tronco;
    }

    /**
     * Establece el diámetro del tronco del árbol.
     *
     * @param diametro_tronco Diámetro del tronco en metros.
     */
    public void setDiametro_tronco(double diametro_tronco) {
        this.diametro_tronco = diametro_tronco;
    }

    /**
     * Obtiene la edad estimada del árbol.
     *
     * @return Edad estimada del árbol en años.
     */
    public int getEdad_estimada() {
        return edad_estimada;
    }

    /**
     * Establece la edad estimada del árbol.
     *
     * @param edad_estimada Edad estimada del árbol en años.
     */
    public void setEdad_estimada(int edad_estimada) {
        this.edad_estimada = edad_estimada;
    }

    /**
     * Retorna una representación en forma de cadena del objeto Arbol.
     *
     * @return Cadena que representa las características del árbol.
     */
    @Override
    public String toString() {
        return "Arbol{" +
                "altura=" + altura +
                ", diametro_tronco=" + diametro_tronco +
                ", edad_estimada=" + edad_estimada +
                '}';
    }
}
