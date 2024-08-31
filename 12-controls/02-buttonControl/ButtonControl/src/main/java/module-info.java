module com.luvienze.buttoncontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.buttoncontrol to javafx.fxml;
    exports com.luvienze.buttoncontrol;
}