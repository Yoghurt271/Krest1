module com.example.krest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.krest to javafx.fxml;
    exports com.example.krest;
}