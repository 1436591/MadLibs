module com.example.madlibs {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.madlibs to javafx.fxml;
    exports com.example.madlibs;
}