package com.luvienze.binding;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage)  {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label("Welcome");
        TextField field = new TextField();
        TextField field1 = new TextField();
        Button button = new Button("Bind Label To Field");
        root.getChildren().addAll(label,field,button);

        //bidirectional binding
        //field1.textProperty().bindBidirectional(field.textProperty());

        //if something is binded, you cannot set, you can change
        //label.textProperty().bind(field.textProperty());
        //label.setText("Hello");

        button.setOnAction(actionEvent -> label.textProperty().bind(field.textProperty()));

        field.setMaxWidth(200);
        //field.textProperty().addListener((obs, oldVal, newVal) -> label.setText(newVal));
        //with binding api
        //label.textProperty().bind(field.textProperty());

        Scene scene = new Scene(root,350,300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
