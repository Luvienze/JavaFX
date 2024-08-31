module com.luvienze.stackpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.stackpane to javafx.fxml;
    exports com.luvienze.stackpane;
}