module com.luvienze.observablecollections {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.observablecollections to javafx.fxml;
    exports com.luvienze.observablecollections;
}