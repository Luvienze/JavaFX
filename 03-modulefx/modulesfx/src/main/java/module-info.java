module com.luvienze.modulesfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.luvienze.modulesfx to javafx.fxml;
    exports org.luvienze.modulesfx;
}