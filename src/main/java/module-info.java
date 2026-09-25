module ni.edu.uam.proyectoconexionbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports com.desarrollo.proyectoconexionbdg3.controllers to javafx.fxml;
    opens com.desarrollo.proyectoconexionbdg3.controllers to javafx.fxml;
    opens ni.edu.uam.proyectoconexionbd to javafx.fxml;
    exports ni.edu.uam.proyectoconexionbd;
}