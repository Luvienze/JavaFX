package com.luvienze.tabpanecontrol;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        TabPane pane = new TabPane();
        Tab one = new Tab("One");
        Tab two = new Tab("Two");
        VBox contentOne = new VBox();
        contentOne.setAlignment(Pos.CENTER);
        contentOne.getChildren().addAll(new Label("Content for Tab One"));
        VBox contentTwo = new VBox();
        contentTwo.setAlignment(Pos.CENTER);
        contentTwo.getChildren().addAll(new Button("Content Two"));

        one.setContent(contentOne);
        two.setContent(contentTwo);
        pane.getTabs().addAll(one,two);
        root.setCenter(pane);

        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("TabPane Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
