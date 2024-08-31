package com.luvienze.comboboxcontrol;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        ComboBox<HBox> names = new ComboBox<>();
        names.getItems().addAll(
                new HBox(new Line(0,10,20,10),new Label("Patrick")),
                new HBox(new Rectangle(0,0,20,20),new Label("Sam")),
                new HBox(new Circle(20,20,10), new Label("Ken"))
        );

        names.setCellFactory(listView -> new ShapeNameCell());
        names.setButtonCell(new ShapeNameCell());
        root.getChildren().addAll(names);


    /*
        Label label = new Label("Name Selected:");
        ComboBox<String> names = new ComboBox<>();
        names.setPromptText("Select A Name");
        names.setEditable(true);
        ObservableList<String> namesList = FXCollections.observableArrayList("Patrick","Sam","Ken","Sara");
        names.getItems().addAll(namesList);
        names.getSelectionModel().selectedItemProperty().addListener(observable -> label.setText("Name Selected: " + names.getSelectionModel().getSelectedItem()));
        root.getChildren().addAll(label,names);
    */
        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("ComboBox Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
