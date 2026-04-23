package com.decroly.primeroejemplojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import model.Producto;

public class MainController {

    private Producto producto;

    @FXML
    private Label welcomeText;

    @FXML
    private Button button1Hbox;

    @FXML
    private TextField myTextField;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Esta es nuestra primera APP JavaFX");
    }

    @FXML
    public void onButton1Click(ActionEvent actionEvent) {
        welcomeText.setText("Soy el boton 1");
    }


    @FXML
    public void OnTextChanged(InputMethodEvent inputMethodEvent) {
        welcomeText.setText("hola");
    }
}
