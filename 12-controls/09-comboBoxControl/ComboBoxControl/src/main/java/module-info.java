module com.luvienze.comboboxcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.comboboxcontrol to javafx.fxml;
    exports com.luvienze.comboboxcontrol;
}