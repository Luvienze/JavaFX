package com.luvienze.hyperlinkcontrol;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        HBox linksLayout = new HBox();
        linksLayout.setAlignment(Pos.CENTER);
        Hyperlink link1 = new Hyperlink("Google");
        Hyperlink link2 = new Hyperlink("Youtube");
        
        WebView webView = new WebView();
        root.setCenter(webView);
        link1.setOnAction(actionEvent -> webView.getEngine().load("https://www.google.com"));
        link2.setOnAction(actionEvent -> webView.getEngine().load("https://youtube.com"));
        linksLayout.getChildren().addAll(link1,link2);
        root.setTop(linksLayout);
        Scene scene = new Scene(root,500,450);
        stage.setTitle("HyperLink Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
