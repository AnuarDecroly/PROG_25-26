package com.decroly.apppersonasfx;

import com.decroly.apppersonasfx.model.Persona;
import com.decroly.apppersonasfx.model.SQLAccessPersona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PersonasController {
    private Persona pp;
    private ObservableList<Persona> personas = FXCollections.observableArrayList();


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
