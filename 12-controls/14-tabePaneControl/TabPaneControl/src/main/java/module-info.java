module com.luvienze.tabpanecontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.tabpanecontrol to javafx.fxml;
    exports com.luvienze.tabpanecontrol;
}