module com.luvienze.anchorpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.anchorpane to javafx.fxml;
    exports com.luvienze.anchorpane;
}