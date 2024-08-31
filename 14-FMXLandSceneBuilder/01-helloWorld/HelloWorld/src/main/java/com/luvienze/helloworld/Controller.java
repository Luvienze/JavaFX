package com.luvienze.helloworld;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Label count_lbl;
    public  int count;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        count = 0;
        count_lbl.setText("Count: " + count);
    }

    @FXML
    public void onIncrement(){
        count++;
        count_lbl.setText("Count: " + count);

    }


}
