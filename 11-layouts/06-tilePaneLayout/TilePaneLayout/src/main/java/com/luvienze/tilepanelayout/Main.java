package com.luvienze.tilepanelayout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        TilePane tileCenter = createTilePane(Pos.CENTER);
        TilePane tileLeft = createTilePane((Pos.BOTTOM_LEFT));
        HBox root = new HBox(10,tileCenter,tileLeft);

        //Set each individual's positions 
        Button button1 = new Button("Button1");
        TilePane.setAlignment(button1, Pos.BOTTOM_RIGHT);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("TilePane Layout Example");
        stage.show();
    }

    public TilePane createTilePane(Pos tileAlignment){
        Button[] buttons = new Button[]{
                new Button("Tiles"),
                new Button("are"),
                new Button("aligned"),
                new Button("at"),
                new Button("Tiles"),
                new Button(tileAlignment.toString())
        };
        TilePane pane = new TilePane(5,5,buttons);
        pane.setTileAlignment(tileAlignment);
        pane.setPrefColumns(3);
        return pane;
    }

    public static void main(String[] args) {
        launch();
    }
}
