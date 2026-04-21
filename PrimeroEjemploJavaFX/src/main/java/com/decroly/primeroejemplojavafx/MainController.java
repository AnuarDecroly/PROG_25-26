package com.decroly.primeroejemplojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Producto;

public class MainController {

    private Producto producto;

    @FXML
    private Label welcomeText;

    @FXML
    private Button button1Hbox;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Esta es nuestra primera APP JavaFX");
    }
}
