package com.decroly.apppersonasfx;

import com.decroly.apppersonasfx.model.Persona;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonasController implements Initializable {
    private Persona pp;
    private ObservableList<Persona> personas = FXCollections.observableArrayList();

    @FXML
    private AnchorPane mainView;

    @FXML
    private AnchorPane formView;

    //Campos de texto del formulario
    @FXML
    private TextField dniTextF;
    @FXML
    private TextField nombreTextF;
    @FXML
    private TextField apellidosTextF;
    @FXML
    private TextField emailTextF;
    @FXML
    private TextField telefonoTextF;
    @FXML
    private TextField edadTextF;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        //Codigo que queremos o necesitamos que se ejecute al principio
        this.mainView.setVisible(true);
        this.formView.setVisible(false);
        this.clearFieldTexts();


    }



    @FXML
    public void onSalirButtonClick(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    public void onBuscarButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onListadoButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onInsertButtonClick(ActionEvent actionEvent) {
        this.mainView.setVisible(false);
        this.formView.setVisible(true);
    }

    public void onGuardarFormClick(ActionEvent actionEvent) {
    }

    public void onCancelFormClick(ActionEvent actionEvent) {
        this.formView.setVisible(false);
        this.mainView.setVisible(true);

        this.clearFieldTexts();

    }

    private void clearFieldTexts() {
        this.dniTextF.clear();
        this.nombreTextF.clear();
        this.apellidosTextF.clear();
        this.emailTextF.clear();
        this.telefonoTextF.clear();
        this.edadTextF.clear();
    }
}
