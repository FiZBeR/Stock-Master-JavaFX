package co.edu.poli.stockmaster.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.stockmaster.modelo.*;
import co.edu.poli.stockmaster.utilities.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CarroceriaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Proveedor> cbProveedor;

    @FXML
    private TextField lbAlto;

    @FXML
    private TextField lbAmplio;

    @FXML
    private TextField lbAncho;

    @FXML
    private TextField lbCantidad;

    @FXML
    private TextField lbColor;

    @FXML
    private TextField lbCosto;

    @FXML
    private TextField lbDescripcion;

    @FXML
    private TextField lbDia;

    @FXML
    private TextField lbEnvase;

    @FXML
    private TextField lbMes;

    @FXML
    private TextField lbNombre;

    @FXML
    private TextField lbanio;

    @FXML
    private TextField lbid;

    @FXML
    private TextField lvValor;

    @FXML
    private TextField lbPeso;


    @FXML
    private Button btCrear;

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
        int anio = Integer.parseInt(lbanio.getText());
        FechaIngreso fecha = new FechaIngreso(dia, mes, anio);
        Proveedor proveedor = new Proveedor();
        String color = lbColor.getText();
        String material = lbEnvase.getText();
        Dimensiones dimensiones = new Dimensiones(Double.parseDouble(lbAlto.getText()), Double.parseDouble(lbAncho.getText()), Double.parseDouble(lbAmplio.getText()));
        double peso = Double.parseDouble(lbPeso.getText());
        PartesCarroceria carroceriaUno = new PartesCarroceria(id_producto, nombre, cantidad, costo, valor, descripcion, disponible, listaVentas, fecha, proveedor, color, material, dimensiones, peso);

        op.agregarElemento(carroceriaUno);

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
        assert cbProveedor != null : "fx:id=\"cbProveedor\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbAlto != null : "fx:id=\"lbAlto\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbAmplio != null : "fx:id=\"lbAmplio\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbAncho != null : "fx:id=\"lbAncho\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbCantidad != null : "fx:id=\"lbCantidad\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbColor != null : "fx:id=\"lbColor\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbCosto != null : "fx:id=\"lbCosto\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbDescripcion != null : "fx:id=\"lbDescripcion\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbDia != null : "fx:id=\"lbDia\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbEnvase != null : "fx:id=\"lbEnvase\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbMes != null : "fx:id=\"lbMes\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbNombre != null : "fx:id=\"lbNombre\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbanio != null : "fx:id=\"lbanio\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lbid != null : "fx:id=\"lbid\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";
        assert lvValor != null : "fx:id=\"lvValor\" was not injected: check your FXML file 'CarroceriaForm.fxml'.";

    }

}
