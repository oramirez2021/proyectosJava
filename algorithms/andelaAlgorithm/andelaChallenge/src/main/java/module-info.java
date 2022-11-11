module com.example.andelachallenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.andelachallenge to javafx.fxml;
    exports com.example.andelachallenge;
}