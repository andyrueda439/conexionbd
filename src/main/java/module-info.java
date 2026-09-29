module ni.edu.uam.proyectoconexionbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports ni.edu.uam.proyectoconexionbd.controller;
    opens ni.edu.uam.proyectoconexionbd.controller to javafx.fxml;

    exports ni.edu.uam.proyectoconexionbd;
}