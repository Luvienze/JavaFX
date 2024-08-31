module com.luvienze.eventhandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.eventhandling to javafx.fxml;
    exports com.luvienze.eventhandling;
}