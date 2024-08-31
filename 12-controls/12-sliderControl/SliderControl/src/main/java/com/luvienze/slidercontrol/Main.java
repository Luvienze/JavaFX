package com.luvienze.slidercontrol;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        Slider red = new Slider(0,255,0);
        Slider green = new Slider(0,255,0);
        Slider blue = new Slider(0,255,0);
        Slider[] sliders = {red,green,blue};
        for(Slider slider:sliders){
            slider.setShowTickMarks(true);
            slider.setBlockIncrement(5);
            slider.valueProperty().addListener(o ->{
                int redColor = (int)red.getValue();
                int greenColor =(int)green.getValue();
                int blueColor = (int) blue.getValue();
                root.setStyle("-fx-background-color: rgb("+ redColor + "," + greenColor +","+ blueColor + ");");
            });
        }
        root.getChildren().addAll(red,green,blue);
        Scene scene = new Scene(root,500,450);
        stage.setTitle("Slider Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
