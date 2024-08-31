package com.luvienze.firstapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Label;


public class HelloApplication extends Application {

    @Override
    public void init() throws Exception{
        System.out.println("Before the App starts");
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
    }

    @Override
    public void start(Stage stage) {
        //It turns down the window, not close the application.
        //Platform.setImplicitExit(false);
        //First, create a layout
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20,20,20,20));
        root.setSpacing(20);
        Label text = new Label("");
        Button button = new Button("Click Me!");
        Button button1 = new Button("Exit Explicitly");
        button.setOnAction(e -> text.setText("Welcome to JavaFX"));
        button1.setOnAction(e -> Platform.exit());
        //Ables to listen events added in method, it is observable
        root.getChildren().addAll(text,button,button1);
        Scene scene = new Scene(root,350,300);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.show();
    }

//    @Override
//    public void stop(){
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Closing the Application");
//    }

    public static void main(String[] args) {
        launch();

    }
}