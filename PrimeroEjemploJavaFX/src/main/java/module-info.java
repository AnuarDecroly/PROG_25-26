module com.decroly.primeroejemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.decroly.primeroejemplojavafx to javafx.fxml;
    exports com.decroly.primeroejemplojavafx;
}