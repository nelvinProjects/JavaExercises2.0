package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox v = new VBox(10);

        Scene scene = new Scene(v, 500, 500);
        scene.getStylesheets().add(Window.class
                .getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.setTitle("None Yet");
        primaryStage.getIcons().add(new Image("JavaFX\\ninja.png"));
        primaryStage.show();
    }
}
