module com.luvienze.flowpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.flowpanelayout to javafx.fxml;
    exports com.luvienze.flowpanelayout;
}