module com.luvienze.complexobjects {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.complexobjects to javafx.fxml;
    exports com.luvienze.complexobjects;
}