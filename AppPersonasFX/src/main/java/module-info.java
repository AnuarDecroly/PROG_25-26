module com.decroly.apppersonasfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.decroly.apppersonasfx to javafx.fxml;
    exports com.decroly.apppersonasfx;
}