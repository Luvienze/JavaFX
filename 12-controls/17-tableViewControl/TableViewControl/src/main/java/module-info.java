module com.luvienze.tableviewcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.tableviewcontrol to javafx.fxml;
    exports com.luvienze.tableviewcontrol;
}