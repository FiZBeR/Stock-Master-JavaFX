package co.edu.poli.stockmaster.controlador;

import co.edu.poli.stockmaster.utilities.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MecanicaController {

    @FXML
    private ComboBox<?> cbProveedor;

    @FXML
    private TextField lbCantidad;

    @FXML
    private TextField lbCompativilidad;

    @FXML
    private TextField lbCosto;

    @FXML
    private TextField lbDescripcion;

    @FXML
    private TextField lbDia;

    @FXML
    private TextField lbMaterial;

    @FXML
    private TextField lbMes;

    @FXML
    private TextField lbNombre;

    @FXML
    private TextField lbPeso;

    @FXML
    private TextField lbanio;

    @FXML
    private TextField lbid;

    @FXML
    private TextField lvValor;

    @FXML
    private RadioButton rbNoDisponible;

    @FXML
    private RadioButton rbYesDisponible;

    @FXML
    private Button btCrear;

    @FXML
    void create(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_PRINCIPAL));
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
        assert btCrear != null : "fx:id=\"btCrear\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert cbProveedor != null : "fx:id=\"cbProveedor\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbCantidad != null : "fx:id=\"lbCantidad\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbCompativilidad != null : "fx:id=\"lbCompativilidad\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbCosto != null : "fx:id=\"lbCosto\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbDescripcion != null : "fx:id=\"lbDescripcion\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbDia != null : "fx:id=\"lbDia\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbMaterial != null : "fx:id=\"lbMaterial\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbMes != null : "fx:id=\"lbMes\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbNombre != null : "fx:id=\"lbNombre\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbPeso != null : "fx:id=\"lbPeso\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbanio != null : "fx:id=\"lbanio\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lbid != null : "fx:id=\"lbid\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert lvValor != null : "fx:id=\"lvValor\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert rbNoDisponible != null : "fx:id=\"rbNoDisponible\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";
        assert rbYesDisponible != null : "fx:id=\"rbYesDisponible\" was not injected: check your FXML file 'MecanicoFrom.fxml'.";

    }

}
