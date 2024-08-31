module com.luvienze.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.firstapp to javafx.fxml;
    exports com.luvienze.firstapp;
}