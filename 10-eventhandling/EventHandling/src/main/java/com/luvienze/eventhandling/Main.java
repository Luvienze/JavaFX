package com.luvienze.eventhandling;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage)  {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label("Click the button");
        Button button = new Button("Button me!");
        root.getChildren().addAll(label,button);

        //event handling
        //button.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> label.setText("Thank you for clicking the button!"));
        //button.addEventHandler(KeyEvent.KEY_PRESSED, mouseEvent -> label.setText("Thank you for clicking the button!"));

        //consume events
        //button.addEventFilter(MouseEvent.MOUSE_CLICKED,mouseEvent -> label.setText("Thank you for clicking the button!"));
        //root.addEventFilter(MouseEvent.MOUSE_CLICKED, Event::consume);
        //root.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent -> System.out.println("Event at the root"));
        //stage.setOnShowing(windowEvent -> System.out.println("Stage is shown"));
        Scene scene = new Scene(root,350,300);
        scene.setOnMouseMoved(mouseEvent -> label.setText("X: " + mouseEvent.getX() + " | Y: " + mouseEvent.getY()));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
