module com.luvienze.props {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luvienze.props to javafx.fxml;
    exports com.luvienze.props;
}