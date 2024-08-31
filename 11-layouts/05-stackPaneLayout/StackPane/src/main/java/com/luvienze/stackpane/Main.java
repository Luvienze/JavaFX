package com.luvienze.stackpane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        StackPane pane = new StackPane();
        Rectangle rectangle = new Rectangle(300,250);
        rectangle.setFill(Color.LAVENDER);
        Label label = new Label("A Rectangle");
        StackPane.setAlignment(label, Pos.TOP_LEFT);
        pane.getChildren().addAll(label,rectangle);

        Scene scene = new Scene(pane,400,350);
        stage.setTitle("StackPane Layout Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
