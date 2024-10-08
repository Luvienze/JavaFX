package com.luvienze.gridpanelayout;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();
        root.setGridLinesVisible(true);
        for(int row=0;row < 3; row++){
            for(int col=0;col < 3; col ++ ){
                Button b = new Button(col + "|" + row);
                root.add(b,col,row);
            }
        }

        ColumnConstraints cc1 = new ColumnConstraints(100);
        cc1.setHalignment(HPos.LEFT);
        ColumnConstraints cc2 = new ColumnConstraints(200);
        cc2.setHalignment(HPos.CENTER);
        ColumnConstraints cc3 = new ColumnConstraints(300);
        cc3.setHalignment(HPos.LEFT);

        RowConstraints rc1 = new RowConstraints(50);
        rc1.setValignment(VPos.TOP);
        RowConstraints rc2 = new RowConstraints(70);
        rc2.setValignment(VPos.CENTER);
        RowConstraints rc3 = new RowConstraints(60);

        root.getColumnConstraints().addAll(cc1,cc2,cc3);
        root.getRowConstraints().addAll(rc1,rc2,rc3);

//        GridPane.setConstraints(b1,0,1);
//        GridPane.setMargin(b,new Insets());
//        root.setGridLinesVisible(true);
//        root.setHgap(10);
//        root.setVgap(10);
//
//        Label label = new Label("First Name:");
//        TextField field = new TextField();
//        Button button = new Button("COMMENT");
//        TextArea area = new TextArea();
//        area.setPromptText("Enter Your Message Here");
//
//        root.addRow(0,label,field,button);
//        root.add(area,0, 1,GridPane.REMAINING,1);
//        root.requestFocus();

//        Button b1 = new Button("One");
//        Button b2 = new Button("Two");
//        Button b3 = new Button("Three");

//        root.addColumn(0,b1,b3);
//        root.addRow(0,b2);

//        root.addRow(0,b1,b2);
//        root.add(b3,0,1);

//        root.add(b1,0,0);
//        root.add(b2,1,0);
//        root.add(b3,0,1);

//        root.getChildren().addAll(b1,b2,b3);
//        GridPane.setConstraints(b1,0,0);
//        GridPane.setConstraints(b2,1,0);
//        GridPane.setConstraints(b3,0,1);

        root.setStyle("-fx-padding: 10;"+"-fx-border-style: solid inside;"+"-fx-border-width: 2;"+"-fx-border-insets: 5;"+"-fx-border-radius: 5;"+"-fx-border-color: blue;");

        Scene scene = new Scene(root);
        stage.setTitle("GridPane Layout Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
