module com.luvienze.datepickercontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.datepickercontrol to javafx.fxml;
    exports com.luvienze.datepickercontrol;
}