module com.example.ahhar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires de.jensd.fx.glyphs.fontawesome;
    requires org.xerial.sqlitejdbc;

    opens com.example.ahhar to javafx.fxml;


    exports com.example.ahhar.Controller;
    exports com.example.ahhar.Models;
    exports com.example.ahhar.Views;
    exports com.example.ahhar;
}