package dit355124290y;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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

        /*NEST290Y
•	El botón "Generar contraseña", generá una contraseña compuesta por el primer carácter del nombre, 
los tres primeros caracteres de los apellidos y los cuatro últimos caracteres del dni, y la mostrarrá en el campo 
de texto bajo la etiqueta "Contraseña generada". Los caracteres que sean letras de esa contraseña deberán estar en
mayúcula tal y como se observa en la Interfaz propuesta.
         */
        String n = componenteTarea3Controller.obtenNombre();
        String a = componenteTarea3Controller.obtenApellidos();
        String d = componenteTarea3Controller.obtenDni();
        
        if (n.isEmpty() || a.isEmpty() || d.isEmpty()) {
            Alert mensaje = new Alert(Alert.AlertType.ERROR);
            mensaje.setTitle("Campos vacíos");
            mensaje.setContentText("Debe rellenar todos los campos");
            mensaje.show();
        } else {
            String nombre = n.substring(0, 1).toUpperCase();
            
            String apellidos = a.substring(0, 3).toUpperCase();
            
            int lengthDni = d.length();
            String dni = d.substring(lengthDni - 4, lengthDni).toUpperCase();
            
            String contraseña = nombre + apellidos + dni;
            txtContraseñaGenerada.setText(contraseña);
            
        }
        
    }
    
    @FXML
    private void nuevosDatos(ActionEvent event) {
        txtContraseñaGenerada.setText("");
        componenteTarea3Controller.limpiarCampos();
    }
    
    @FXML
    private void salir(ActionEvent event) {
        javafx.application.Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}


/*
•	El botón "Generar contraseña", generá una contraseña compuesta por el primer carácter del nombre, 
los tres primeros caracteres de los apellidos y los cuatro últimos caracteres del dni, y la mostrarrá en el campo 
de texto bajo la etiqueta "Contraseña generada". Los caracteres que sean letras de esa contraseña deberán estar en
mayúcula tal y como se observa en la Interfaz propuesta.
•	El botón "Nuevos datos" limpiará todos los campos texto que se muestran en la imagen "Interfaz propuesta".
•	El botón "Salir" cerrará la aplicación.

 */
