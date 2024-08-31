module com.luvienze.readonlyprops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.readonlyprops to javafx.fxml;
    exports com.luvienze.readonlyprops;
}