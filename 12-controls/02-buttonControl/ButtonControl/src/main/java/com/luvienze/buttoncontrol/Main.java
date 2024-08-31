package com.luvienze.buttoncontrol;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Button button = new Button("Click Me!");
        Button other = new Button("Other");
        Rectangle rectangle = new Rectangle(20,20, Color.CYAN);
        other.setGraphic(rectangle);

        button.setCancelButton(true);
        button.setOnAction(actionEvent -> {
            System.out.println("Quitting Program");
            Platform.exit();
        });

        root.getChildren().addAll(other,button);
        Scene scene = new Scene(root,500,450);
        stage.setTitle("Button Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
