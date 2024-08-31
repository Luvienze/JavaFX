module com.luvienze.borderpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.borderpanelayout to javafx.fxml;
    exports com.luvienze.borderpanelayout;
}