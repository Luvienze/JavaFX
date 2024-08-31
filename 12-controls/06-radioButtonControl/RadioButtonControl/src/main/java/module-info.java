module com.luvienze.radiobuttoncontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.radiobuttoncontrol to javafx.fxml;
    exports com.luvienze.radiobuttoncontrol;
}