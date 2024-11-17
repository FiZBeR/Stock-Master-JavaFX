package co.edu.poli.stockmaster.controlador;

import co.edu.poli.stockmaster.modelo.*;
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

public class NoPerecederoController {

    @FXML
    private Button btCrear;

    @FXML
    private ComboBox<?> cbProveedor;

    @FXML
    private TextField lbAnio;

    @FXML
    private TextField lbCantidad;

    @FXML
    private TextField lbCosto;

    @FXML
    private TextField lbDescripcion;

    @FXML
    private TextField lbDia;

    @FXML
    private TextField lbDurabilidad;

    @FXML
    private TextField lbEnvase;

    @FXML
    private TextField lbMes;

    @FXML
    private TextField lbNombre;

    @FXML
    private TextField lbid;

    @FXML
    private TextField lvValor;

    @FXML
    private RadioButton rbNo;

    @FXML
    private RadioButton rbYes;

    HomeViewController op = new HomeViewController();

    @FXML
    void create(ActionEvent event) {
        String id_producto = lbid.getText();
        String nombre = lbNombre.getText();
        int cantidad = Integer.parseInt(lbCantidad.getText());
        int costo = Integer.parseInt(lbCosto.getText());
        int valor = Integer.parseInt(lvValor.getText());
        String descripcion = lbDescripcion.getText();
        boolean disponible = true;
        Venta[] listaVentas = new Venta[9];
        int dia = Integer.parseInt(lbDia.getText());
        int mes = Integer.parseInt(lbMes.getText());
        int anio = Integer.parseInt(lbAnio.getText());
        FechaIngreso fecha = new FechaIngreso(dia, mes, anio);
        Proveedor proveedor = new Proveedor();
        int durabilidad = Integer.parseInt(lbDurabilidad.getText());
        String envase = lbEnvase.getText();

        NoPerecedero productoUno = new NoPerecedero(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, listaVentas, fecha, proveedor, durabilidad, envase);

        op.agregarElemento(productoUno);


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
