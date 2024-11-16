package co.edu.poli.stockmaster.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NoPerecederoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> cbProveedor;

    @FXML
    private TextField lbCantidad;

    @FXML
    private TextField lbCosto;

    @FXML
    private DatePicker lbDate;

    @FXML
    private TextField lbDescripcion;

    @FXML
    private TextField lbDurabilidad;

    @FXML
    private TextField lbEnvase;

    @FXML
    private TextField lbNombre;

    @FXML
    private TextField lbid;

    @FXML
    private TextField lvValor;

    @FXML
    private Button btCrear;

    @FXML
    void create(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../../../../../resources/fxml/HomeView.fxml"));
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
        assert cbProveedor != null : "fx:id=\"cbProveedor\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbCantidad != null : "fx:id=\"lbCantidad\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbCosto != null : "fx:id=\"lbCosto\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbDate != null : "fx:id=\"lbDate\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbDescripcion != null : "fx:id=\"lbDescripcion\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbDurabilidad != null : "fx:id=\"lbDurabilidad\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbEnvase != null : "fx:id=\"lbEnvase\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbNombre != null : "fx:id=\"lbNombre\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lbid != null : "fx:id=\"lbid\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";
        assert lvValor != null : "fx:id=\"lvValor\" was not injected: check your FXML file 'NoPerecederosForm.fxml'.";

    }
}
