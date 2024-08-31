package com.luvienze.textflow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage stage){
        TextFlow root = new TextFlow();
        Text heading = new Text("Lorem Ipsum");
        heading.setFill(Color.BLUE);
        heading.setFont(Font.font("Arial", FontWeight.BOLD,18));
        Text paragraph = new Text("\nLorem Ipsum is dummy text of the printing and typesetting industry. " +
                "\nLorem Ipsum has been the industry's standard dummy text ever since 1500s. " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        root.setLineSpacing(5);
        root.setTextAlignment(TextAlignment.CENTER);
        root.prefWidth(100);
        root.getChildren().addAll(heading,paragraph);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("TextFlow Layout Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
