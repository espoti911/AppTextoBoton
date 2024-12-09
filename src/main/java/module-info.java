module es.ieslosmontecillos.apptextoboton {
    requires es.ieslosmontecillos.componentes_gonzalezfrancisco;
    requires javafx.fxml;
    requires javafx.controls;


    opens es.ieslosmontecillos.apptextoboton to javafx.fxml;
    exports es.ieslosmontecillos.apptextoboton;
}