package com.luvienze.readonlyprops;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Constant constant = new Constant(100);
        constant.changeConstant();
        System.out.println(constant.getReadOnlyNumber().get());
    }

    public static void main(String[] args) {
        launch();
    }
}
