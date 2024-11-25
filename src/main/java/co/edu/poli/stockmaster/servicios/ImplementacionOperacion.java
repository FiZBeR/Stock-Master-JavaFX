package co.edu.poli.stockmaster.servicios;

import co.edu.poli.stockmaster.modelo.ArbolNotable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase que implementa las operaciones de gestión sobre los objetos ArbolNotable.
 * Esta clase implementa la interfaz Operacion y proporciona métodos para crear,
 * leer, actualizar, eliminar, y serializar/deserializar objetos ArbolNotable.
 */
public class ImplementacionOperacion implements Operacion {

    /**
     * Array que almacena los objetos ArbolNotable.
     */
    private ArbolNotable[] ArbolNotable;

    /**
     * Constructor de la clase ImplementacionOperacion.
     * Inicializa un array de ArbolNotable con una longitud de 1.
     */
    public ImplementacionOperacion() {
        ArbolNotable = new ArbolNotable[1];
    }

    /**
     * Establece el array de ArbolNotable.
     *
     * @param ArbolNotable Array de objetos ArbolNotable a establecer.
     */
    public void setEArbolNotable(ArbolNotable[] ArbolNotable) {
        this.ArbolNotable = ArbolNotable;
    }

    /**
     * Crea un nuevo objeto ArbolNotable y lo añade al array.
     *
     * @param x Objeto ArbolNotable a crear.
     * @return Mensaje indicando si la operación fue exitosa.
     */
    public String create(ArbolNotable x) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.create() here
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (ArbolNotable[i] == null) {
                ArbolNotable[i] = x;
                return "Save!";
            }
        }
        ArbolNotable[] ArbolNotableaux = new ArbolNotable[ArbolNotable.length * 2];
        System.arraycopy(ArbolNotable, 0, ArbolNotableaux, 0, ArbolNotable.length);
        ArbolNotableaux[ArbolNotable.length] = x;
        ArbolNotable = ArbolNotableaux;
        return "Save!!";
    }

    /**
     * Lee un objeto ArbolNotable por su ID.
     *
     * @param id ID del objeto ArbolNotable a leer.
     * @return Objeto ArbolNotable encontrado o null si no existe.
     */
    public ArbolNotable read(String id) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.read() here
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (!(ArbolNotable[i] == null))
                if (ArbolNotable[i].getId().equals(id))
                    return ArbolNotable[i];
        }
        return null;
    }

    /**
     * Lee todos los objetos ArbolNotable.
     *
     * @return Array de todos los objetos ArbolNotable.
     */
    public ArbolNotable[] readall() {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.readall() here
        return ArbolNotable;
    }

    /**
     * Actualiza un objeto ArbolNotable por su ID.
     *
     * @param id ID del objeto ArbolNotable a actualizar.
     * @param x Objeto ArbolNotable con los nuevos datos.
     * @return Mensaje indicando si la operación fue exitosa.
     */
    public String update(String id, ArbolNotable x) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.update() here
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (!(ArbolNotable[i] == null))
                if (ArbolNotable[i].getId().equals(id)) {
                    ArbolNotable[i] = x;
                    return "Update!";
                }
        }
        return "Cod is not in the array!";
    }

    /**
     * Elimina un objeto ArbolNotable por su ID.
     *
     * @param id ID del objeto ArbolNotable a eliminar.
     * @return Objeto ArbolNotable eliminado o null si no existe.
     */
    public ArbolNotable delete(String id) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.delete() here
        ArbolNotable temp = null;
        for (int i = 0; i < ArbolNotable.length; i++) {
            if (!(ArbolNotable[i] == null))
                if (ArbolNotable[i].getId().equals(id)) {
                    temp = ArbolNotable[i];
                    ArbolNotable[i] = null;
                    return temp;
                }
        }
        return temp;
    }

    /**
     * Serializa un array de objetos ArbolNotable a un archivo.
     *
     * @param ArbolNotable Array de objetos ArbolNotable a serializar.
     * @param path Ruta del archivo donde se guardará la serialización.
     * @param name Nombre del archivo a crear.
     * @return Mensaje indicando si la operación fue exitosa.
     */
    public String serializar(ArbolNotable[] ArbolNotable, String path, String name) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.serializar() here
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ArbolNotable);
            oos.close();
            fos.close();
            return "File create!!";
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage();
        }
    }

    /**
     * Deserializa un array de objetos ArbolNotable desde un archivo.
     *
     * @param path Ruta del archivo desde donde se deserializará.
     * @param name Nombre del archivo a deserializar.
     * @return Array de objetos ArbolNotable deserializados.
     */
    public ArbolNotable[] deserializar(String path, String name) {
        // TODO implement co.poli.edu.segundaEntrega.servicios.Operacion.deserializar() here
        ArbolNotable[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (ArbolNotable[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return a;
    }

    /**
     * Método adicional que puede ser utilizado para otras funcionalidades.
     *
     * @return Mensaje u objeto que se quiera retornar.
     */
}
