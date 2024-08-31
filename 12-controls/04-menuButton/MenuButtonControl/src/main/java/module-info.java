module com.luvienze.menubuttoncontrol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.luvienze.menubuttoncontrol to javafx.fxml;
    exports com.luvienze.menubuttoncontrol;
}