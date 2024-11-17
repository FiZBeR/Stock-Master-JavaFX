package co.edu.poli.stockmaster.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.stockmaster.modelo.FechaIngreso;
import co.edu.poli.stockmaster.modelo.Perecedero;
import co.edu.poli.stockmaster.modelo.Proveedor;
import co.edu.poli.stockmaster.modelo.Venta;
import co.edu.poli.stockmaster.utilities.Paths;
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

public class PerecederoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Proveedor> cbProveedor;

    @FXML
    private TextField lbCantidad;

    @FXML
    private TextField lbCondicion;

    @FXML
    private TextField lbCosto;

    @FXML
    private DatePicker lbDate;

    @FXML
    private TextField lbDescripcion;

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
    private TextField lbDia;

    @FXML
    private TextField lbMes;

    @FXML
    private TextField lbAnio;

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
        FechaIngreso fecha = new FechaIngreso(Integer.parseInt(lbDia.getText()), Integer.parseInt(lbMes.getText()), Integer.parseInt(lbAnio.getText()));
        Proveedor proveedor = new Proveedor();
        int caducidad = 10;
        String condicion = lbCondicion.getText();
        String envase = lbEnvase.getText();

        Perecedero productoUno = new Perecedero(id_producto, nombre, cantidad, costo, valor, descripcion,
                disponible, listaVentas, fecha, proveedor, caducidad, condicion, envase);

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

    @FXML
    void initialize() {
        assert cbProveedor != null : "fx:id=\"cbProveedor\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbCantidad != null : "fx:id=\"lbCantidad\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbCondicion != null : "fx:id=\"lbCondicion\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbCosto != null : "fx:id=\"lbCosto\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbDate != null : "fx:id=\"lbDate\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbDescripcion != null : "fx:id=\"lbDescripcion\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbEnvase != null : "fx:id=\"lbEnvase\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbNombre != null : "fx:id=\"lbNombre\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lbid != null : "fx:id=\"lbid\" was not injected: check your FXML file 'ProductsForm.fxml'.";
        assert lvValor != null : "fx:id=\"lvValor\" was not injected: check your FXML file 'ProductsForm.fxml'.";

    }
}
