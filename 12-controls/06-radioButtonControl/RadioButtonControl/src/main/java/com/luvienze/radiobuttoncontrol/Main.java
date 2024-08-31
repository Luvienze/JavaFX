package com.luvienze.radiobuttoncontrol;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Label userSelection;
    @Override
    public void init(){
        userSelection = new Label("Your Selection: None");
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(5);

        RadioButton spring = new RadioButton("Spring");
        RadioButton summer = new RadioButton("Summer");
        RadioButton fall = new RadioButton("Fall");
        RadioButton winter = new RadioButton("Winter");
        ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(spring,summer,fall,winter);
        group.selectedToggleProperty().addListener(this::changed);
        root.getChildren().addAll(userSelection,spring,summer,fall,winter);

        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("RadioButton Control Example");
        stage.show();

    }

    public void changed(ObservableValue<? extends Toggle>observableValue,Toggle oldBtb, Toggle newBtn){
        String selectedLabel = "None";
        if(newBtn != null){
            selectedLabel = ((Labeled)newBtn).getText();
        }

        userSelection.setText("Your Selection: " + selectedLabel);
    }

    public static void main(String[] args) {
        launch();
    }
}
