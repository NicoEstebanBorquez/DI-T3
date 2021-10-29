package componente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ComponenteController implements Initializable {

    @FXML
    private TextField txtNombre, txtApellidos, txtDni;

    public String obtenNombre() {
        String nombre = txtNombre.getText();
        return nombre;
    }

    public String obtenApellidos() {
        String apellidos = txtApellidos.getText();
        return apellidos;
    }

    public String obtenDni() {
        String dni = txtDni.getText();
        return dni;
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
