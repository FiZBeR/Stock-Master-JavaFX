package co.edu.poli.stockmaster.vista;

import co.edu.poli.stockmaster.modelo.ArbolNotable;
import co.edu.poli.stockmaster.modelo.EstadodeConservacion;
import co.edu.poli.stockmaster.modelo.Operador;
import co.edu.poli.stockmaster.modelo.Registro;
import co.edu.poli.stockmaster.servicios.Coordenadas;
import co.edu.poli.stockmaster.servicios.ImplementacionOperacion;
import co.edu.poli.stockmaster.servicios.Ubicacion;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Principal {

    public static void main(String [ ] args) {
        // TODO implement here

        String path = "";
        String file = "TextBinary.bin";
        ImplementacionOperacion crud = new ImplementacionOperacion();
        EstadodeConservacion[] estados = new EstadodeConservacion[10];


        Coordenadas coordenadasArbolUno = new Coordenadas(4.60971, -74.08175);
        Ubicacion ubicacionArbolUno = new Ubicacion(coordenadasArbolUno, "Bogota", "Suba", "Rincon", "Calle 145 3 78 - 29");
        Operador operadorUno = new Operador("ADFFFF", "Arturo Calle", "B+","3158899955", "arturoCallejonXD@gmail.com");
        Registro registroUno = new Registro(operadorUno, "24-10-2024");

        ArbolNotable arbolUno = new ArbolNotable("Pichupichu", "NoSeNombresDeMatas", "Colombia", 12.5, 80.6, 32, "DFFH9008", ubicacionArbolUno, registroUno, estados);


        Coordenadas coordenadasArbolDos = new Coordenadas(6.217, -75.567);
        Ubicacion ubicacionArbolDos = new Ubicacion(coordenadasArbolDos, "Medellín", "El Poblado", "Patio Bonito", "Carrera 43A #10-45");
        Operador operadorDos = new Operador("ADGE324", "Luis Pérez", "O+", "3001234567", "luisPerez123@gmail.com");
        Registro registroDos = new Registro(operadorDos, "15-11-2024");

        ArbolNotable arbolDos = new ArbolNotable("Ceiba", "Ceiba pentandra", "Colombia", 18.3, 75.2, 25, "CEIBA123", ubicacionArbolDos, registroDos, estados);


        Coordenadas coordenadasArbolTres = new Coordenadas(3.4516, -76.532);
        Ubicacion ubicacionArbolTres = new Ubicacion(coordenadasArbolTres, "Cali", "San Fernando", "Ciudad Jardín", "Avenida Roosevelt #25-45");
        Operador operadorTres = new Operador("BGH324", "María Gomez", "A-", "3149876543", "mariaGomez@example.com");
        Registro registroTres = new Registro(operadorTres, "12-12-2024");

        ArbolNotable arbolTres = new ArbolNotable("Guayacán", "Tabebuia chrysantha", "Colombia", 16.7, 90.1, 45, "GUAYA123", ubicacionArbolTres, registroTres, estados);


        Coordenadas coordenadasArbolCuatro = new Coordenadas(11.0041, -74.8069);
        Ubicacion ubicacionArbolCuatro = new Ubicacion(coordenadasArbolCuatro, "Santa Marta", "Rodadero", "Playa Salguero", "Carrera 2 #5-30");
        Operador operadorCuatro = new Operador("JDK223", "Carlos Pérez", "AB+", "3176543210", "carlosPerez@gmail.com");
        Registro registroCuatro = new Registro(operadorCuatro, "30-01-2025");

        ArbolNotable arbolCuatro = new ArbolNotable("Mango", "Mangifera indica", "Colombia", 14.2, 95.5, 50, "MANGO123", ubicacionArbolCuatro, registroCuatro, estados);


        Coordenadas coordenadasArbolCinco = new Coordenadas(10.391, -75.479);
        Ubicacion ubicacionArbolCinco = new Ubicacion(coordenadasArbolCinco, "Cartagena", "Bocagrande", "Castillogrande", "Avenida San Martín #5-67");
        Operador operadorCinco = new Operador("KKL321", "Ana Torres", "O-", "3112233445", "anaTorres@gmail.com");
        Registro registroCinco = new Registro(operadorCinco, "05-02-2025");

        ArbolNotable arbolCinco = new ArbolNotable("Almendro", "Terminalia catappa", "Colombia", 20.0, 88.3, 60, "ALMEN123", ubicacionArbolCinco, registroCinco, estados);


        System.out.println(crud.create(arbolUno));;
        System.out.println(crud.create(arbolDos));
        System.out.println(crud.create(arbolTres));
        System.out.println(crud.create(arbolCuatro));
        System.out.println(crud.create(arbolCinco));

        for (int i = 0; i < crud.readall().length; i++)
            System.out.println(crud.readall()[i]);
        System.out.println("***************************");

        crud.delete("ALMEN123");

        for (int i = 0; i < crud.readall().length; i++)
            System.out.println(crud.readall()[i]);


        crud.serializar(crud.readall(), path, file);

    }

}