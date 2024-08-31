package com.luvienze.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage)  {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        Label selected = new Label();
        Button selectFirst = new Button("Select First");
        ListView<String> list = new ListView<>();
        ObservableList<String> names = FXCollections.observableArrayList("Patrick","Sam","Ken","Sara");
        //list.getSelectionModel().selectedItemProperty().addListener(observable -> selected.setText(list.getSelectionModel().getSelectedItem()));
        list.getSelectionModel().selectedItemProperty().addListener((observableValue, olVal, newVal) -> selected.setText(newVal) );
        selectFirst.setOnAction(actionEvent -> list.getSelectionModel().selectFirst());
        //list.setOrientation(Orientation.HORIZONTAL);
        //list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        list.getItems().addAll(names);
        root.getChildren().addAll(selected,list,selectFirst);

        Scene scene = new Scene(root,500,250);
        stage.setScene(scene);
        stage.setTitle("ListView Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
