module com.luvienze.hyperlinkcontrol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.luvienze.hyperlinkcontrol to javafx.fxml;
    exports com.luvienze.hyperlinkcontrol;
}