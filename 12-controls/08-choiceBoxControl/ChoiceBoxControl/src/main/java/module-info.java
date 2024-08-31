module com.luvienze.choiceboxcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.choiceboxcontrol to javafx.fxml;
    exports com.luvienze.choiceboxcontrol;
}