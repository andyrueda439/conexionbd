package ni.edu.uam.proyectoconexionbd;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/ni/edu/uam/proyectoconexionbd/principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 240);
        stage.setTitle("Prueba de conexión de base de datos");
        stage.setScene(scene);
        stage.show();
    }
}