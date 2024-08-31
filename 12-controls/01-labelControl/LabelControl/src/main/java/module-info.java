module com.luvienze.labelcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.labelcontrol to javafx.fxml;
    exports com.luvienze.labelcontrol;
}