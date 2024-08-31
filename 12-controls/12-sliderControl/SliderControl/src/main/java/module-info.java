module com.luvienze.slidercontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.slidercontrol to javafx.fxml;
    exports com.luvienze.slidercontrol;
}