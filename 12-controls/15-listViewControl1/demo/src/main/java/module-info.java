module com.luvienze.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.demo to javafx.fxml;
    exports com.luvienze.demo;
}