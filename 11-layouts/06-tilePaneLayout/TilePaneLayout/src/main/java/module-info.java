module com.luvienze.tilepanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.tilepanelayout to javafx.fxml;
    exports com.luvienze.tilepanelayout;
}