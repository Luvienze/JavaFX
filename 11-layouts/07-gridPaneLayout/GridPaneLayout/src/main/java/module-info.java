module com.luvienze.gridpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.gridpanelayout to javafx.fxml;
    exports com.luvienze.gridpanelayout;
}