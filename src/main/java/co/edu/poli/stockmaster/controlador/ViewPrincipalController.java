package co.edu.poli.stockmaster.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.poli.stockmaster.modelo.*;
import co.edu.poli.stockmaster.servicios.Coordenadas;
import co.edu.poli.stockmaster.servicios.ImplementacionOperacion;
import co.edu.poli.stockmaster.servicios.Ubicacion;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ViewPrincipalController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btBuscar;

    @FXML
    private Button btCrear;

    @FXML
    private Button btDelete;

    @FXML
    private Button btUpdate;

    @FXML
    private DatePicker dpFechaInicio;

    @FXML
    private DatePicker dpFechaRevision;

    @FXML
    private TextField lbAltura;

    @FXML
    private TextField lbBarrio;

    @FXML
    private TextField lbBuscarPOrID;

    @FXML
    private TextField lbCiudad;

    @FXML
    private TextField lbContactoInstitucion;

    @FXML
    private TextField lbDiametro;

    @FXML
    private TextField lbDireccion;

    @FXML
    private TextField lbEdad;

    @FXML
    private TextField lbIDArbol;

    @FXML
    private TextField lbLatitud;

    @FXML
    private TextField lbLocalidad;

    @FXML
    private TextField lbLongitud;

    @FXML
    private TextField lbNombreCientifico;

    @FXML
    private TextField lbNombreComun;

    @FXML
    private TextField lbNombreInstitucion;

    @FXML
    private TextField lbTipoEntidad;

    @FXML
    private ComboBox<String> cmProteccion;

    @FXML
    private ComboBox<String> cmSalud;

    @FXML
    private RadioButton rbOP1;

    @FXML
    private RadioButton rbOP2;

    @FXML
    private RadioButton rbOP3;

    @FXML
    private TextArea txtArea1;


    private ToggleGroup opcionesOperador = new ToggleGroup();

    private ObservableList<ArbolNotable> listaFugas = FXCollections.observableArrayList();

    String path = "";
    String file = "TextBinary.bin";

    Operador operadorUno = new Operador("ADFFFF", "Arturo Calle", "B+","3158899955", "arturoCallejonXD@gmail.com");
    Operador operadorDos = new Operador("ADFFFF", "Arturo Calle", "B+","3158899955", "arturoCallejonXD@gmail.com");
    Operador operadorTres = new Operador("ADFFFF", "Arturo Calle", "B+","3158899955", "arturoCallejonXD@gmail.com");

    ImplementacionOperacion op = new ImplementacionOperacion();


    @FXML
    void create(ActionEvent event) {

        //Ubicacion
        double latitud = Double.parseDouble(lbLatitud.getText());
        double longitud = Double.parseDouble(lbLongitud.getText());
        Coordenadas coordenadaUno = new Coordenadas(latitud, longitud);

        String ciudad = lbCiudad.getText();
        String localidad = lbLocalidad.getText();
        String barrio = lbBarrio.getText();
        String direccion = lbDireccion.getText();

        Ubicacion ubicacionUno = new Ubicacion(coordenadaUno, ciudad, localidad,barrio, direccion);

        //Arbol Notable
        String idArbol = lbIDArbol.getText();
        String nombreCientifico = lbNombreCientifico.getText();
        String nombreComun = lbNombreComun.getText();
        EstadodeConservacion[] listaUno = new EstadodeConservacion[9];
        String origen = "ACA";
        double altura = Double.parseDouble(lbAltura.getText());
        double diametro = Double.parseDouble(lbDiametro.getText());
        int edad = Integer.parseInt(lbEdad.getText());

        //Registro
        LocalDate fechaRegistro = dpFechaInicio.getValue();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaTexto = fechaRegistro.format(formatter);

        RadioButton seleccionadoOperador = (RadioButton) opcionesOperador.getSelectedToggle();

        if (seleccionadoOperador.equals("OP1")){

            Registro registroUno = new Registro(operadorUno, fechaTexto);
            ArbolNotable arbolUno = new ArbolNotable(nombreCientifico, nombreComun, origen, altura, diametro, edad, idArbol, ubicacionUno, registroUno, listaUno);

            txtArea1.setText(op.create(arbolUno));
            op.serializar(op.readall(), path, file);
            listaFugas.add(arbolUno);
            actualizarTextArea();
            clear();

        } else if (seleccionadoOperador.equals("OP2")) {

            Registro registroUno = new Registro(operadorDos, fechaTexto);
            ArbolNotable arbolUno = new ArbolNotable(nombreCientifico, nombreComun, origen, altura, diametro, edad, idArbol, ubicacionUno, registroUno, listaUno);

            txtArea1.setText(op.create(arbolUno));
            op.serializar(op.readall(), path, file);
            listaFugas.add(arbolUno);
            actualizarTextArea();
            clear();

        } else {

            Registro registroUno = new Registro(operadorTres, fechaTexto);
            ArbolNotable arbolUno = new ArbolNotable(nombreCientifico, nombreComun, origen, altura, diametro, edad, idArbol, ubicacionUno, registroUno, listaUno);

            txtArea1.setText(op.create(arbolUno)) ;
            listaFugas.add(arbolUno);
            actualizarTextArea();
            clear();
        }

    }

    @FXML
    void delete(ActionEvent event) {
        String idActualizar = lbBuscarPOrID.getText();

        boolean eliminado = listaFugas.removeIf(arbol -> arbol.getId().equals(idActualizar));

        if (eliminado){
            actualizarTextArea();
            clear();
            System.out.println("El árbol con el ID " + idActualizar + " fue eliminado.");
        } else {
            actualizarTextArea();
            clear();
            System.out.println("No se encontró un árbol con el ID especificado.");
        }

    }

    @FXML
    void update(ActionEvent event) {
        String idActualizar = lbBuscarPOrID.getText();
        for (ArbolNotable arbol : listaFugas) {
            if (arbol.getId().equals(idActualizar)) {
                //Ubicacion
                double latitud = Double.parseDouble(lbLatitud.getText());
                double longitud = Double.parseDouble(lbLongitud.getText());
                Coordenadas coordenadaUno = new Coordenadas(latitud, longitud);

                String ciudad = lbCiudad.getText();
                String localidad = lbLocalidad.getText();
                String barrio = lbBarrio.getText();
                String direccion = lbDireccion.getText();

                Ubicacion ubicacionUno = new Ubicacion(coordenadaUno, ciudad, localidad,barrio, direccion);

                arbol.setUbicacion(ubicacionUno);

                //Arbol Notable
                String idArbol = lbIDArbol.getText();
                String nombreCientifico = lbNombreCientifico.getText();
                String nombreComun = lbNombreComun.getText();
                EstadodeConservacion[] listaUno = new EstadodeConservacion[9];
                String origen = "ACA";
                double altura = Double.parseDouble(lbAltura.getText());
                double diametro = Double.parseDouble(lbDiametro.getText());
                int edad = Integer.parseInt(lbEdad.getText());



                //Registro
                LocalDate fechaRegistro = dpFechaInicio.getValue();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String fechaTexto = fechaRegistro.format(formatter);

                RadioButton seleccionadoOperador = (RadioButton) opcionesOperador.getSelectedToggle();

                if (seleccionadoOperador.equals("OP1")){

                    Registro registroUno = new Registro(operadorUno, fechaTexto);
                    arbol.setRegistro(registroUno);

                    arbol.setNombre_cientifico(nombreCientifico);
                    arbol.setNombre_comun(nombreComun);
                    arbol.setOrigen(origen);
                    arbol.setAltura(altura);
                    arbol.setDiametro_tronco(diametro);
                    arbol.setEdad_estimada(edad);

                    System.out.println("Datos del árbol actualizados.");
                    actualizarTextArea();
                    op.serializar(op.readall(), path, file);
                    clear();

                } else if (seleccionadoOperador.equals("OP2")) {

                    Registro registroUno = new Registro(operadorDos, fechaTexto);
                    arbol.setRegistro(registroUno);

                    arbol.setNombre_cientifico(nombreCientifico);
                    arbol.setNombre_comun(nombreComun);
                    arbol.setOrigen(origen);
                    arbol.setAltura(altura);
                    arbol.setDiametro_tronco(diametro);
                    arbol.setEdad_estimada(edad);

                    System.out.println("Datos del árbol actualizados.");
                    actualizarTextArea();
                    op.serializar(op.readall(), path, file);
                    clear();

                } else {

                    Registro registroUno = new Registro(operadorTres, fechaTexto);
                    arbol.setRegistro(registroUno);

                    arbol.setNombre_cientifico(nombreCientifico);
                    arbol.setNombre_comun(nombreComun);
                    arbol.setOrigen(origen);
                    arbol.setAltura(altura);
                    arbol.setDiametro_tronco(diametro);
                    arbol.setEdad_estimada(edad);

                    System.out.println("Datos del árbol actualizados.");
                    actualizarTextArea();
                    op.serializar(op.readall(), path, file);
                    clear();
                }


            }
        }
    }

    @FXML
    void read(ActionEvent event) {
        String idActualizar = lbBuscarPOrID.getText();
        // Lista auxiliar donde se almacenarán los elementos filtrados
        List<ArbolNotable> listaAuxiliar = new ArrayList<>();

        // Filtrar los elementos de la lista principal
        for (ArbolNotable elemento : listaFugas) {
            if (elemento.getId().equals(idActualizar)) { // Verifica si el elemento cumple el criterio
                listaAuxiliar.add(elemento);
            }
        }

        // Crear el texto para mostrar en el TextArea
        StringBuilder textoAMostrar = new StringBuilder();
        for (ArbolNotable elemento : listaAuxiliar) {
            textoAMostrar.append(elemento).append("\n"); // Convierte cada elemento a texto con salto de línea
        }

        // Actualizar el TextArea con el texto filtrado
        txtArea1.setText(textoAMostrar.toString());
    }

    @FXML
    void initialize() {
        assert btBuscar != null : "fx:id=\"btBuscar\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert btCrear != null : "fx:id=\"btCrear\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert btDelete != null : "fx:id=\"btDelete\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert btUpdate != null : "fx:id=\"btUpdate\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert dpFechaInicio != null : "fx:id=\"dpFechaInicio\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert dpFechaRevision != null : "fx:id=\"dpFechaRevision\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbAltura != null : "fx:id=\"lbAltura\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbBarrio != null : "fx:id=\"lbBarrio\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbBuscarPOrID != null : "fx:id=\"lbBuscarPOrID\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbCiudad != null : "fx:id=\"lbCiudad\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbContactoInstitucion != null : "fx:id=\"lbContactoInstitucion\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbDiametro != null : "fx:id=\"lbDiametro\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbDireccion != null : "fx:id=\"lbDireccion\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbEdad != null : "fx:id=\"lbEdad\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbIDArbol != null : "fx:id=\"lbIDArbol\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbLatitud != null : "fx:id=\"lbLatitud\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbLocalidad != null : "fx:id=\"lbLocalidad\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbLongitud != null : "fx:id=\"lbLongitud\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbNombreCientifico != null : "fx:id=\"lbNombreCientifico\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbNombreComun != null : "fx:id=\"lbNombreComun\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbNombreInstitucion != null : "fx:id=\"lbNombreInstitucion\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert lbTipoEntidad != null : "fx:id=\"lbTipoEntidad\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert rbOP1 != null : "fx:id=\"rbOP1\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert rbOP2 != null : "fx:id=\"rbOP2\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert rbOP3 != null : "fx:id=\"rbOP3\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";
        assert txtArea1 != null : "fx:id=\"txtArea1\" was not injected: check your FXML file 'ViewPrincipal.fxml'.";

        rbOP1.setToggleGroup(opcionesOperador);
        rbOP2.setToggleGroup(opcionesOperador);
        rbOP3.setToggleGroup(opcionesOperador);
        cmSalud.getItems().addAll("Buena", "Regular", "Mala");
        cmSalud.setValue("Buena");
        cmProteccion.getItems().addAll("Nacional", "Regional", "Local", "Ambiental");
        cmProteccion.setValue("Nacional");

        ArbolNotable[] listaArbol = op.deserializar(path, file);
        /*System.out.println("listaArbol = " + listaArbol);
        for (int i = 0; i < listaArbol.length; i ++){
            System.out.println(listaArbol[i]);
            //listaFugas.add(listaArbol[i]);
        }*/

        actualizarTextArea();
    }
    private void actualizarTextArea() {
        txtArea1.clear();
        listaFugas.forEach(arbol -> txtArea1.appendText(arbol.toString() + "\n"));
    }

    // Método para limpiar los campos del formulario
    void clear() {

        lbDiametro.setText("");
        lbAltura.setText("");
        lbBuscarPOrID.setText("");
        lbLongitud.setText("");
        lbLatitud.setText("");
        lbIDArbol.setText("");
        lbBarrio.setText("");
        lbCiudad.setText("");
        lbLocalidad.setText("");
        lbContactoInstitucion.setText("");
        lbDireccion.setText("");
        lbEdad.setText("");
        lbTipoEntidad.setText("");
        lbNombreCientifico.setText("");
        lbNombreComun.setText("");
        lbNombreInstitucion.setText("");
        dpFechaInicio.setValue(LocalDate.now());
        dpFechaRevision.setValue(LocalDate.now());
        cmProteccion.setValue("Nacional");
        cmSalud.setValue("Buena");

    }

}
