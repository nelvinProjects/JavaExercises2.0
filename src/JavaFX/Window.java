package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import javax.xml.soap.Text;

public class Window extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Label into = new Label("Sign Up for Java Fun!!");
        Label nameLabel = new Label("Enter Name: ");
        TextField name = new TextField();
        Button signUp = new Button("Sign Up!!!");

        HBox h = new HBox(2);
        h.getChildren().addAll(nameLabel, name);

        VBox v = new VBox(10);
        v.getChildren().add(into);
        v.getChildren().add(h);
        v.getChildren().add(checkBoxes());
        v.getChildren().add(signUp);

        buttonAction(signUp, v, name);

        Scene scene = new Scene(v, 500, 500);
        scene.getStylesheets().add(Window.class
                .getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.setTitle("None Yet");
        primaryStage.getIcons().add(new Image("JavaFX\\ninja.png"));
        primaryStage.show();
    }

    public void buttonAction(Button b, VBox v, TextField name){
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label newLabel = new Label(name.getText());
                v.getChildren().add(newLabel);
            }
        });
    }

    public HBox checkBoxes(){
        HBox h = new HBox(3);
        CheckBox cb1 = new CheckBox("Why Java?");
        CheckBox cb2 = new CheckBox("Why OOP?");
        CheckBox cb3 = new CheckBox("Why JavaFX?");
        CheckBox cb4 = new CheckBox("Why CSS?");
        h.getChildren().addAll(cb1,cb2,cb3,cb4);
       return h;
    }
}
