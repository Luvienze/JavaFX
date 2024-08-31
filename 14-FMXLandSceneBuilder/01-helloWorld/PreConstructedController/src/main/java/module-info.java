module com.luvienze.preconstructedcontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.preconstructedcontroller to javafx.fxml;
    exports com.luvienze.preconstructedcontroller;
}