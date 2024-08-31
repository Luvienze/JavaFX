module com.luvienze.listviewcontrolii {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.listviewcontrolii to javafx.fxml;
    exports com.luvienze.listviewcontrolii;
}