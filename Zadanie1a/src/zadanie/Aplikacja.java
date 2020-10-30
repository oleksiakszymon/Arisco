package zadanie;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplikacja extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Aplikacja.class.getResource("Template.fxml"));
        Parent layout = fxmlLoader.load();

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
}
