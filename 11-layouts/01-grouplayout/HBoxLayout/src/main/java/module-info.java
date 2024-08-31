module com.luvienze.hboxlayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.hboxlayout to javafx.fxml;
    exports com.luvienze.hboxlayout;
}