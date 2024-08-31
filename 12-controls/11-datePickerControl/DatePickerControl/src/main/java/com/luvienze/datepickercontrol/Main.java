package com.luvienze.datepickercontrol;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage)  {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        Label date = new Label("Date:");
        DatePicker datePicker = new DatePicker();
        datePicker.setEditable(false);
        datePicker.setOnAction(actionEvent -> date.setText(datePicker.getValue().toString()));
        root.getChildren().addAll(date,datePicker);

        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("DatePicker Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
