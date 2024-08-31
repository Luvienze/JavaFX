package org.luvienze.modulesfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Label label = new Label("Hello World");
        root.getChildren().add(label);
        Scene scene = new Scene(root,350,300);
        stage.setTitle("ModulesFX");
        stage.setScene(scene);
        stage.show();
    }


}
