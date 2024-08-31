package com.luvienze.flowpanelayout;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
        //flowPane.setOrientation(Orientation.HORIZONTAL);
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setColumnHalignment(HPos.RIGHT);
        //flowPane.setRowValignment(VPos.BOTTOM);
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        TextArea textArea = new TextArea();
        flowPane.getChildren().addAll(button1,button2,button3,textArea,button4,button5,button6);
        Scene scene = new Scene(flowPane,350,300);
        stage.setScene(scene);
        stage.setTitle("FlowPane Layout Example");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
