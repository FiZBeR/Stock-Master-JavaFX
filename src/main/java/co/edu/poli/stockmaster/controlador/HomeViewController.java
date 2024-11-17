package co.edu.poli.stockmaster.controlador;

import co.edu.poli.stockmaster.modelo.Productos;
import co.edu.poli.stockmaster.utilities.Paths;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeViewController {

    @FXML
    private Button btHome;

    @FXML
    private Button btLogout;

    @FXML
    private Button btMoreSells;

    @FXML
    private Button btProducts;

    @FXML
    private Button btSockDown;

    @FXML
    private Button btStockDwon;

    @FXML
    private Button btVencer;

    @FXML
    private Button btViewMoreSells;

    @FXML
    private TableColumn<Map<String, String>, String> equipoCodigo;

    @FXML
    private TableColumn<Map<String, String>, String> equiponombre;

    @FXML
    private TableColumn<Map<String, String>, String> moreId;

    @FXML
    private TableColumn<Map<String, String>, String> moreNombre;

    @FXML
    private TableColumn<Map<String, String>, String> stockId;

    @FXML
    private TableColumn<Map<String, String>, String> stockNombre;

    @FXML
    private TableView<Map<String, String>> tbPartners;

    @FXML
    private TableView<Map<String, String>> tbStockDown;

    @FXML
    private TableView<Map<String, String>> tbvMoreSells;

    private List<Productos> listaPrincipal;

    public HomeViewController() {
        listaPrincipal = new ArrayList<>();
    }

    public void agregarElemento(Productos elemento) {
        listaPrincipal.add(elemento);
    }

    // Método para obtener el contenido de la lista
    public List<Productos> obtenerLista() {
        return listaPrincipal;
    }

    @FXML
    void create(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_PRODUCTS));
            Parent nuevaVista = loader.load();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.getScene().setRoot(nuevaVista);
        } catch (IOException e) {
            // Manejo de la excepción: puedes registrar el error o mostrar un mensaje
            e.printStackTrace();
            // También puedes mostrar un mensaje de alerta al usuario si es necesario
        }
    }

    @FXML
    void salir(ActionEvent event) {

    }

    @FXML
    void viewProducts(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_PRODUCTS));
            Parent nuevaVista = loader.load();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.getScene().setRoot(nuevaVista);
        } catch (IOException e) {
            // Manejo de la excepción: puedes registrar el error o mostrar un mensaje
            e.printStackTrace();
            // También puedes mostrar un mensaje de alerta al usuario si es necesario
        }
    }

    @FXML
    void viewSells(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_FIXED));
            Parent nuevaVista = loader.load();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.getScene().setRoot(nuevaVista);
        } catch (IOException e) {
            // Manejo de la excepción: puedes registrar el error o mostrar un mensaje
            e.printStackTrace();
            // También puedes mostrar un mensaje de alerta al usuario si es necesario
        }
    }

    @FXML
    void viewStock(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_FIXED));
            Parent nuevaVista = loader.load();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.getScene().setRoot(nuevaVista);
        } catch (IOException e) {
            // Manejo de la excepción: puedes registrar el error o mostrar un mensaje
            e.printStackTrace();
            // También puedes mostrar un mensaje de alerta al usuario si es necesario
        }
    }

    @FXML
    void viewVencer(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_FIXED));
            Parent nuevaVista = loader.load();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.getScene().setRoot(nuevaVista);
        } catch (IOException e) {
            // Manejo de la excepción: puedes registrar el error o mostrar un mensaje
            e.printStackTrace();
            // También puedes mostrar un mensaje de alerta al usuario si es necesario
        }
    }

    @FXML
    void initialize() {
        assert btHome != null : "fx:id=\"btHome\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert btLogout != null : "fx:id=\"btLogout\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert btMoreSells != null : "fx:id=\"btMoreSells\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert btProducts != null : "fx:id=\"btProducts\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert btSockDown != null : "fx:id=\"btSockDown\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert btStockDwon != null : "fx:id=\"btStockDwon\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert btVencer != null : "fx:id=\"btVencer\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert btViewMoreSells != null : "fx:id=\"btViewMoreSells\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert equipoCodigo != null : "fx:id=\"equipoCodigo\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert equiponombre != null : "fx:id=\"equiponombre\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert moreId != null : "fx:id=\"moreId\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert moreNombre != null : "fx:id=\"moreNombre\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert stockId != null : "fx:id=\"stockId\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert stockNombre != null : "fx:id=\"stockNombre\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert tbPartners != null : "fx:id=\"tbPartners\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert tbStockDown != null : "fx:id=\"tbStockDown\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert tbvMoreSells != null : "fx:id=\"tbvMoreSells\" was not injected: check your FXML file 'HomeView.fxml'.";


        moreId.setCellValueFactory(cellData -> {
            String value = cellData.getValue().get("id");
            return new javafx.beans.property.SimpleStringProperty(value);
        });

        moreNombre.setCellValueFactory(cellData -> {
            String value = cellData.getValue().get("nombre");
            return new javafx.beans.property.SimpleStringProperty(value);
        });
        // Crea una lista de mapas para representar las filas
        ObservableList<Map<String, String>> listaProductos = FXCollections.observableArrayList(
                crearFila("ASHSYS", "Producto A"),
                crearFila("AJSDHG", "Producto B"),
                crearFila("POOUIEY", "Producto C")
        );

        // Asocia la lista con la tabla
        tbvMoreSells.setItems(listaProductos);

        stockId.setCellValueFactory(cellData -> {
            String value = cellData.getValue().get("id");
            return new javafx.beans.property.SimpleStringProperty(value);
        });

        stockNombre.setCellValueFactory(cellData -> {
            String value = cellData.getValue().get("nombre");
            return new javafx.beans.property.SimpleStringProperty(value);
        });
        // Crea una lista de mapas para representar las filas
        ObservableList<Map<String, String>> listaProductos2 = FXCollections.observableArrayList(
                crearFila("QWE", "Producto D"),
                crearFila("WER", "Producto F"),
                crearFila("ETRTY", "Producto G")
        );

        // Asocia la lista con la tabla
        tbStockDown.setItems(listaProductos2);

        equiponombre.setCellValueFactory(cellData -> {
            String value = cellData.getValue().get("id");
            return new javafx.beans.property.SimpleStringProperty(value);
        });

        equipoCodigo.setCellValueFactory(cellData -> {
            String value = cellData.getValue().get("nombre");
            return new javafx.beans.property.SimpleStringProperty(value);
        });
        // Crea una lista de mapas para representar las filas
        ObservableList<Map<String, String>> listaProductos3 = FXCollections.observableArrayList(
                crearFila("0001", "Dayana"),
                crearFila("0002", "Cristian"),
                crearFila("0003", "Jose"),
                crearFila("0004", "Alejandro")
        );

        // Asocia la lista con la tabla
        tbPartners.setItems(listaProductos3);
    }

    private Map<String, String> crearFila(String id, String nombre) {
        Map<String, String> fila = new HashMap<>();
        fila.put("id", id);
        fila.put("nombre", nombre);
        return fila;
    }
}
