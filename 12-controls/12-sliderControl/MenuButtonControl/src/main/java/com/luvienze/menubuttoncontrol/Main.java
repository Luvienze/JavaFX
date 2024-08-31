package com.luvienze.menubuttoncontrol;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        MenuBar menu = new MenuBar();
        Menu file = new Menu("File");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(actionEvent -> Platform.exit());
        Menu edit = new Menu("Edit");
        RadioMenuItem option = new RadioMenuItem("Options");
        RadioMenuItem settings = new RadioMenuItem("Settings");
        Menu prefs = new Menu("Preferences");
        MenuItem prefOne = new MenuItem("Pref:One");
        MenuItem prefTwo = new MenuItem("Pref:Two");
        prefs.getItems().addAll(prefOne,prefTwo);
        edit.getItems().addAll(option,settings, new SeparatorMenuItem(),prefs);
        file.getItems().addAll(save,exit);
        menu.getMenus().addAll(file,edit);
        root.setTop(menu);

        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("MenuButton Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
