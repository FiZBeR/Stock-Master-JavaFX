package co.edu.poli.stockmaster.controlador;

import co.edu.poli.stockmaster.modelo.Productos;
import co.edu.poli.stockmaster.utilities.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductosViewController {

    @FXML
    private Button btBuscar;

    @FXML
    private Button btCrear;

    @FXML
    private Button btEliminar;

    @FXML
    private TableColumn<Productos, ?> columNombre;

    @FXML
    private TableColumn<Productos, ?> columnCalidad;

    @FXML
    private TableColumn<Productos, ?> columnCosto;

    @FXML
    private TableColumn<Productos, ?> columnDisponible;

    @FXML
    private TableColumn<Productos, ?> columnFechaDeIngreso;

    @FXML
    private TableColumn<Productos, ?> columnId;

    @FXML
    private TableColumn<Productos, ?> columnValor;

    @FXML
    private TextField lbId;

    @FXML
    private TableView<Productos> tbProducts;

    @FXML
    void buscarID(ActionEvent event) {

    }

    @FXML
    void create(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_SELECT));
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
    void delete(ActionEvent event) {

    }
}
