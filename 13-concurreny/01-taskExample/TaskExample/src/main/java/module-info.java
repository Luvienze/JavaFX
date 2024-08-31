module com.luvienze.taskexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.taskexample to javafx.fxml;
    exports com.luvienze.taskexample;
}