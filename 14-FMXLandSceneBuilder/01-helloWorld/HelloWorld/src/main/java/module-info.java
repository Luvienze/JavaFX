module com.luvienze.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.helloworld to javafx.fxml;
    exports com.luvienze.helloworld;
}