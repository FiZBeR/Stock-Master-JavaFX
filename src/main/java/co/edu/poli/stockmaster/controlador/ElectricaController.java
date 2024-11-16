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

public class ElectricaController {

    @FXML
    private ComboBox<?> cbProveedor;

    @FXML
    private TextField lbCantidad;

    @FXML
    private TextField lbCompativilidad;

    @FXML
    private TextField lbConsumo;

    @FXML
    private TextField lbCosto;

    @FXML
    private TextField lbDescripcion;

    @FXML
    private TextField lbDia;

    @FXML
    private TextField lbMes;

    @FXML
    private TextField lbNombre;

    @FXML
    private TextField lbVoltaje;

    @FXML
    private TextField lbanio;

    @FXML
    private TextField lbid;

    @FXML
    private TextField lvValor;

    @FXML
    private RadioButton rbNoDisponible;

    @FXML
    private RadioButton rbNoResistencia;

    @FXML
    private RadioButton rbYesDisponible;

    @FXML
    private RadioButton rbYesResistencia;

    @FXML
    private Button btCrear;

    @FXML
    void crear(ActionEvent event) {
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

}

