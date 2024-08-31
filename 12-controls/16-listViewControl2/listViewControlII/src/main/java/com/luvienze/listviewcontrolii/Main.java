package com.luvienze.listviewcontrolii;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        ListView<Task> taskListView = new ListView<>();
        ObservableList<Task> tasks = FXCollections.observableArrayList(
                new Task("Create Java Project"),
                new Task("Create Bug Report"),
                new Task("Commit changes to repo")
        );

        taskListView.setCellFactory(taskListView1 -> new CustomTaskCell());
        taskListView.getItems().addAll(tasks);
        root.getChildren().addAll(taskListView);
        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("ListView Control Example2");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
