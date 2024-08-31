module com.luvienze.checkboxcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.checkboxcontrol to javafx.fxml;
    exports com.luvienze.checkboxcontrol;
}