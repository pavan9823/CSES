module com.example.cses {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cses to javafx.fxml;
    exports com.example.cses;
}