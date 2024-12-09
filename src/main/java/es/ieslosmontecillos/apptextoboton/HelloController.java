package es.ieslosmontecillos.apptextoboton;

import es.ieslosmontecillos.componentes_gonzalezfrancisco.CampoTextoBoton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable
{

    @FXML
    private CampoTextoBoton campoTextoboton2;
    @FXML
    private CampoTextoBoton campoTextoboton1;
    @FXML
    private Label txtResult;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        campoTextoboton1.setOnAction(e -> {
            txtResult.setText("Se ha grabado: " + campoTextoboton1.getText());
        });

        campoTextoboton2.setOnAction(e -> {
            txtResult.setText("Se ha grabado: " + campoTextoboton2.getText());
        });
    }
}