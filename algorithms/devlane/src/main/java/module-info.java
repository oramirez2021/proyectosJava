module com.example.devlane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devlane to javafx.fxml;
    exports com.example.devlane;
}