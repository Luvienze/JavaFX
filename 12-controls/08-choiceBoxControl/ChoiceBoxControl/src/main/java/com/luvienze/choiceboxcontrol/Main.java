package com.luvienze.choiceboxcontrol;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        Label label = new Label("Your Direction:");

        ChoiceBox<String> directions = new ChoiceBox<>();
        ObservableList<String> directionList = FXCollections.observableArrayList("North","South","East","West");
        directions.getItems().addAll(directionList);
        //directions.getSelectionModel().select(0);
        directions.getSelectionModel().selectLast();
        directions.getSelectionModel().selectedItemProperty().addListener(observable -> label.setText("Your Direction: " + directions.getSelectionModel().getSelectedItem()));

        root.getChildren().addAll(label,directions);
        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("ChoiceBox Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
