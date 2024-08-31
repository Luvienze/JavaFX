module com.luvienze.grouplayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.grouplayout to javafx.fxml;
    exports com.luvienze.grouplayout;
}