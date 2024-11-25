package co.edu.poli.stockmaster.servicios;

import co.edu.poli.stockmaster.modelo.ArbolNotable;

import java.io.*;
import java.util.*;

/**
 * Interfaz que define las operaciones básicas para la gestión de objetos ArbolNotable.
 * Esta interfaz incluye métodos para crear, leer, actualizar, eliminar, serializar y deserializar
 * objetos ArbolNotable.
 */
public interface Operacion {

    /**
     * Crea un nuevo objeto ArbolNotable.
     *
     * @param x Objeto ArbolNotable a crear.
     * @return Mensaje que indica el resultado de la operación.
     */
    public String create(ArbolNotable x);

    /**
     * Lee un objeto ArbolNotable por su ID.
     *
     * @param id ID del objeto ArbolNotable a leer.
     * @return Objeto ArbolNotable encontrado o null si no existe.
     */
    public ArbolNotable read(String id);

    /**
     * Lee todos los objetos ArbolNotable.
     *
     * @return Array de todos los objetos ArbolNotable.
     */
    public ArbolNotable[] readall();

    /**
     * Actualiza un objeto ArbolNotable por su ID.
     *
     * @param id ID del objeto ArbolNotable a actualizar.
     * @param x Objeto ArbolNotable con los nuevos datos.
     * @return Mensaje que indica el resultado de la operación.
     */
    public String update(String id, ArbolNotable x);

    /**
     * Elimina un objeto ArbolNotable por su ID.
     *
     * @param id ID del objeto ArbolNotable a eliminar.
     * @return Objeto ArbolNotable eliminado o null si no existe.
     */
    public ArbolNotable delete(String id);

    /**
     * Serializa un array de objetos ArbolNotable a un archivo.
     *
     * @param arbolnotable Array de objetos ArbolNotable a serializar.
     * @param Parameter2 Ruta del archivo donde se guardará la serialización.
     * @param Parameter3 Nombre del archivo a crear.
     * @return Mensaje que indica el resultado de la operación.
     */
    public String serializar(ArbolNotable[] arbolnotable, String Parameter2, String Parameter3);

    /**
     * Deserializa un array de objetos ArbolNotable desde un archivo.
     *
     * @param path Ruta del archivo desde donde se deserializará.
     * @param name Nombre del archivo a deserializar.
     * @return Array de objetos ArbolNotable deserializados.
     */
    public ArbolNotable[] deserializar(String path, String name);
}
