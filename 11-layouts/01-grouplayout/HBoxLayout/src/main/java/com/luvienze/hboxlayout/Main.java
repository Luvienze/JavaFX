package com.luvienze.hboxlayout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setFillHeight(false);
        Label label = new Label("Hello World");
        TextArea textArea = new TextArea();
        HBox.setHgrow(textArea, Priority.ALWAYS);
        HBox.setMargin(textArea,new Insets(0,10,0,10));
        hBox.getChildren().addAll(label,textArea);
        Scene scene = new Scene(hBox,350,300);
        stage.setScene(scene);
        stage.setTitle("HBox Layout Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
