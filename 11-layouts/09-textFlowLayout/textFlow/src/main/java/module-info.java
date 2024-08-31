module com.luvienze.textflow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.textflow to javafx.fxml;
    exports com.luvienze.textflow;
}