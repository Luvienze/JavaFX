package com.luvienze.observablecollections;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        ObservableList<String> list = FXCollections.observableArrayList("One","Two","Three");
        ListView<String> items = new ListView<>();
        TextField field = new TextField();
        field.setMaxWidth(200);
        Button button = new Button();
        items.setItems(list);
        button.setOnAction(actionEvent -> {
            if(!field.textProperty().get().isEmpty()){
                list.add(field.getText());
            }
        });
        root.getChildren().addAll(items,field,button);
        Scene scene = new Scene(root,350,300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
