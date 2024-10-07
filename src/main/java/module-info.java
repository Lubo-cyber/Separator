module com.example.separator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.separator to javafx.fxml;
    exports com.example.separator;
}