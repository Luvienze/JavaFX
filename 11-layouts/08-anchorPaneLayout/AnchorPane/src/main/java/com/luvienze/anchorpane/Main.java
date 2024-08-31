package com.luvienze.anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){

        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root,500,450);

        Button bottomRight = new Button("Bottom Right");
        Button topLeft = new Button("Top Left");

        AnchorPane.setBottomAnchor(bottomRight,10.0);
        AnchorPane.setRightAnchor(bottomRight,10.0);

        AnchorPane.setTopAnchor(topLeft,20.0);
        AnchorPane.setLeftAnchor(topLeft, 50.0);

        root.getChildren().addAll(bottomRight,topLeft);

        stage.setTitle("AnchorPane Layout Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
