module com.example.laba11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laba11 to javafx.fxml;
    exports com.example.laba11;
}