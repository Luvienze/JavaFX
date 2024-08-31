module mavenfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.luvienze.mavenfx to javafx.fxml;
    exports com.luvienze.mavenfx;
}