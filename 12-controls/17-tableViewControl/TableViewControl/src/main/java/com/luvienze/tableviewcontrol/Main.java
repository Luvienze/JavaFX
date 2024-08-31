package com.luvienze.tableviewcontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();

        TableView<User> usersTable = new TableView<>(UserUtility.getUsersList());
        usersTable.getColumns().addAll(
                UserUtility.getFirstNameColumn(),
                UserUtility.getLastNameColumn(),
                UserUtility.getBirthDateColumn(),
                UserUtility.getDeleteUserColumn()
        );
        usersTable.setEditable(true);
        root.getChildren().addAll(usersTable);


        Scene scene = new Scene(root,500,450);
        stage.setTitle("TableView Control Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
