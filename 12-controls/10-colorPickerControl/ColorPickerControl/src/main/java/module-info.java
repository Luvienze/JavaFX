module com.luvienze.colorpickercontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.colorpickercontrol to javafx.fxml;
    exports com.luvienze.colorpickercontrol;
}