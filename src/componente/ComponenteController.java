package componente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * Esta clase se encarga de gestionar la funcionalidad del componente creado en esta tarea. 
 * Tiene los siguientes métodos: - obtenNombre() - obtenApellidos() - obtenDni() - limpiarCampos()
 *
 * @author Nicolás Esteban Borquez - DNI 55124290Y
 */
public class ComponenteController implements Initializable {

    @FXML
    private TextField txtNombre, txtApellidos, txtDni;

    /**
     * Este método obtiene el texto introducido en el campo "txtNombre" del componente.
     *
     * @return nombre Devuelve una String con el texto obtenido
     */
    public String obtenNombre() {
        String nombre = txtNombre.getText();
        return nombre;
    }

    /**
     * Este método obtiene el texto introducido en el campo "txtApellidos" del componente.
     *
     * @return apellidos. Devuelve una String con el texto obtenido.
     */
    public String obtenApellidos() {
        String apellidos = txtApellidos.getText();
        return apellidos;
    }

    /**
     * Este método obtiene el texto introducido en el campo "txtDni" del componente.
     *
     * @return dni Devuelve una String con el texto obtenido.
     */
    public String obtenDni() {
        String dni = txtDni.getText();
        return dni;
    }

    /**
     * Este método limpia los campos de texto del componente.
     */
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
