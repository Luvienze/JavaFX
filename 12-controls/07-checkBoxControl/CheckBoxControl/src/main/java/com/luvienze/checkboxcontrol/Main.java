package com.luvienze.checkboxcontrol;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Label answer;
    CheckBox checkBox;

    @Override
    public void init(){
        answer = new Label("Your answer: None");
        checkBox = new CheckBox("Choice");
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label question = new Label("Are you in favor?");

        root.getChildren().addAll(answer,question,checkBox);
        checkBox.setAllowIndeterminate(true);
        checkBox.selectedProperty().addListener(this::changed);
        checkBox.indeterminateProperty().addListener(this::changed);

        Scene scene = new Scene(root,500,450);
        stage.setTitle("CheckBox Control Example");
        stage.setScene(scene);
        stage.show();

    }

    public void changed(ObservableValue<? extends Boolean>observableValue, Boolean oldVal, Boolean newVal){
        String choice = null;
        if(checkBox.isIndeterminate()){
            choice = "Neutral";
        } else if (checkBox.isSelected()) {
            choice = "Agree";
        }
        else{
            choice = "Disagree";
        }

        answer.setText("Your Answer: " + choice);
    }

    public static void main(String[] args) {
        launch();
    }
}
