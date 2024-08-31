package com.luvienze.togglebuttoncontrol;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
/*    Boolean isLightOn;

    @Override
    public void init(){
        isLightOn = false;

    }
*/
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Label label = new Label("Your Selection is: ");
        ToggleButton spring = new ToggleButton("Spring");
        ToggleButton summer = new ToggleButton("Summer");
        ToggleButton fall = new ToggleButton("Fall");
        ToggleButton winter = new ToggleButton("Winter");
        ToggleGroup seasons = new ToggleGroup();
        seasons.getToggles().addAll(spring,summer,fall,winter);

        HBox seasonLayout = new HBox();
        seasonLayout.setAlignment(Pos.CENTER);
        seasonLayout.setSpacing(5);
        seasonLayout.getChildren().addAll(spring,summer,fall,winter);
        root.getChildren().addAll(label,seasonLayout);

        seasons.selectedToggleProperty().addListener((observableValue, toggle, t1) -> {
            label.setText("Your Selection is: " + ((Labeled)t1).getText() );
        });
/*
        Rectangle rectangle = new Rectangle(200,100, Color.RED);
        ToggleButton light = new ToggleButton("OFF");
        root.getChildren().addAll(rectangle,light);
        light.setOnAction(actionEvent -> {
            isLightOn = !isLightOn;
            if(isLightOn){
                rectangle.setFill(Color.GREEN);
                light.setText("ON");
            }
            else{
                rectangle.setFill(Color.RED);
                light.setText("OFF");
            }
        });
*/
        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("ToggleButton Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
