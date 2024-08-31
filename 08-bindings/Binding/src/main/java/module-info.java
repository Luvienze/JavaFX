module com.luvienze.binding {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.binding to javafx.fxml;
    exports com.luvienze.binding;
}