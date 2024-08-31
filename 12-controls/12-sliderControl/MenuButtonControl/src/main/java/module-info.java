module com.luvienze.menubuttoncontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.menubuttoncontrol to javafx.fxml;
    exports com.luvienze.menubuttoncontrol;
}