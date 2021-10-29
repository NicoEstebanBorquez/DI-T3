package dit355124290y;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import componente.ComponenteController;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class InterfazController implements Initializable {

    @FXML
    private TextField txtContraseñaGenerada;

    @FXML
    private ComponenteController componenteTarea3Controller;

    @FXML
    private void generarContraseña(ActionEvent event) {

        //Se obtiene el texto introducido en cada uno de los campos
        String nombre = componenteTarea3Controller.obtenNombre();
        String apellidos = componenteTarea3Controller.obtenApellidos();
        String dni = componenteTarea3Controller.obtenDni();

        //Se comprueba que ningún campo está vacío
        if (nombre.isEmpty() || apellidos.isEmpty() || dni.isEmpty()) {
            //Mensaje de error en caso de que algún campo esté vacío
            Alert mensaje = new Alert(Alert.AlertType.ERROR);
            mensaje.setTitle("Campos vacíos");
            mensaje.setContentText("Debe rellenar todos los campos");
            mensaje.show();
        } else {
            //Se obtiene el primer caracter del nombre
            String segmentoNombre = nombre.substring(0, 1).toUpperCase();

            //Se obtienen los 3 primeros caracteres del apellido
            String segmentoApellidos = apellidos.substring(0, 3).toUpperCase();

            //Se obtienen los ultimos 4 caracteres del DNI
            int lengthDni = dni.length();
            String segmentoDni = dni.substring(lengthDni - 4, lengthDni).toUpperCase();

            //Se conforma la contraseña con los 3 segmentos
            String contraseña = segmentoNombre + segmentoApellidos + segmentoDni;

            //Se muestra la contraseña en el campo "txtContraseñaGenerada" de la interfaz
            txtContraseñaGenerada.setText(contraseña);
        }
    }

    @FXML
    private void nuevosDatos(ActionEvent event) {
        //Se limpia el campo de la contraseña
        txtContraseñaGenerada.setText("");
        //Se limpian los campos del componente
        componenteTarea3Controller.limpiarCampos();
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
