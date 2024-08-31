module com.luvienze.togglebuttoncontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.togglebuttoncontrol to javafx.fxml;
    exports com.luvienze.togglebuttoncontrol;
}