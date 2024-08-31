module com.luvienze.treeviewcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.treeviewcontrol to javafx.fxml;
    exports com.luvienze.treeviewcontrol;
}