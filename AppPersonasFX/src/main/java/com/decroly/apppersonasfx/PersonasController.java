package com.decroly.apppersonasfx;

import com.decroly.apppersonasfx.model.Persona;
import com.decroly.apppersonasfx.model.SQLAccessPersona;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PersonasController implements Initializable {
    private Persona pp;
    private ObservableList<Persona> personas = FXCollections.observableArrayList();
    private boolean isNewPerson =  false;

    @FXML
    private AnchorPane root;

    @FXML
    private String [] estadosLabel= {"Se ha creado el registro correctamente",
            "Error al crear el registro",
            "Se ha producido una excepción","Se ha actualizado el registro correctamente"};

    //Variables para poner el boton enable
    private boolean isDniValido = false, isNombreValido = false, isApellidosValido = false,
    isEmailValido = false, isTelefonoValido = false, isEdadValido = false;

    //Paneles
    @FXML
    private AnchorPane mainView;
    @FXML
    private AnchorPane formView;
    @FXML
    private AnchorPane listView;

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

    //Label
    @FXML
    private Label infoLabel;

    @FXML
    private Label labelFormTitle;

    //Buttons
    @FXML
    private Button guardarFormButton;

    @FXML
    private Button editarListViewButton;

    @FXML
    private Button eliminarListViewButton;

    @FXML
    private ListView<Persona> personasListView;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        //Codigo que queremos o necesitamos que se ejecute al principio
        this.selectPanelVisible(0);

        //Limpio los campos de las cajas de texto
        this.clearFieldTexts();

        //Deshabilito los botones necesarios
        this.guardarFormButton.setDisable(true);
        this.editarListViewButton.setDisable(true);
        this.eliminarListViewButton.setDisable(true);

        //Insertar listerners a las propiedades de focus textsfields
        this.dniTextF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!this.validateDni(dniTextF.getText())){
                    this.dniTextF.setText("");
                    this.dniTextF.getStyleClass().remove("my-validated-text");
                    this.dniTextF.getStyleClass().add("my-error-text");

                    this.dniTextF.setPromptText("Debe ingresar un dni correcto");
                    this.isDniValido = false;


                }
                else{
                    this.dniTextF.getStyleClass().remove("my-error-text");
                    this.dniTextF.getStyleClass().add("my-validated-text");
                    this.isDniValido = true;
                }
                this.guardarFormButton.setDisable(!this.isValidoFormulario());
            }
        });

        this.nombreTextF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!this.validateName(nombreTextF.getText())){
                    this.nombreTextF.setText("");
                    this.nombreTextF.getStyleClass().remove("my-validated-text");
                    this.nombreTextF.getStyleClass().add("my-error-text");
                    this.nombreTextF.setPromptText("El nombre debe de tener al menos 3 caracteres");
                    this.isNombreValido = false;
                }
                else{
                    this.nombreTextF.getStyleClass().remove("my-error-text");
                    this.nombreTextF.getStyleClass().add("my-validated-text");
                    this.isNombreValido = true;
                }
                this.guardarFormButton.setDisable(!this.isValidoFormulario());
            }
        });

        this.apellidosTextF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!this.validateName(apellidosTextF.getText())){
                    this.apellidosTextF.setText("");
                    this.apellidosTextF.getStyleClass().remove("my-validated-text");
                    this.apellidosTextF.getStyleClass().add("my-error-text");
                    this.apellidosTextF.setPromptText("El apellido debe de tener al menos 3 caracteres");
                    this.isApellidosValido = false;
                }
                else{
                    this.apellidosTextF.getStyleClass().remove("my-error-text");
                    this.apellidosTextF.getStyleClass().add("my-validated-text");
                    this.isApellidosValido = true;

                }
                this.guardarFormButton.setDisable(!this.isValidoFormulario());
            }
        });

        this.emailTextF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!this.validateEmail(emailTextF.getText())){
                    this.emailTextF.setText("");
                    this.emailTextF.getStyleClass().remove("my-validated-text");
                    this.emailTextF.getStyleClass().add("my-error-text");
                    this.emailTextF.setPromptText("Ingresa un email valido");
                    this.isEmailValido = false;
                }
                else{
                    this.emailTextF.getStyleClass().remove("my-error-text");
                    this.emailTextF.getStyleClass().add("my-validated-text");
                    this.isEmailValido = true;
                }
                this.guardarFormButton.setDisable(!this.isValidoFormulario());
            }

        });

        this.edadTextF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!this.validateAge(edadTextF.getText())){
                    this.edadTextF.setText("");
                    this.edadTextF.getStyleClass().remove("my-validated-text");
                    this.edadTextF.getStyleClass().add("my-error-text");
                    this.edadTextF.setPromptText("La edad debe ser un numero entre 1 y 150");
                    this.isEdadValido = false;
                }
                else{
                    this.edadTextF.getStyleClass().remove("my-error-text");
                    this.edadTextF.getStyleClass().add("my-validated-text");
                    this.isEdadValido = true;
                }
                this.guardarFormButton.setDisable(!this.isValidoFormulario());
            }
        });

        this.telefonoTextF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!this.validatePhone(telefonoTextF.getText())){
                    this.telefonoTextF.setText("");
                    this.telefonoTextF.getStyleClass().remove("my-validated-text");
                    this.telefonoTextF.getStyleClass().add("my-error-text");
                    this.telefonoTextF.setPromptText("El telefono debe tener 9 digitos");
                    this.isTelefonoValido = false;
                }
                else{
                    this.telefonoTextF.getStyleClass().remove("my-error-text");
                    this.telefonoTextF.getStyleClass().add("my-validated-text");
                    this.isTelefonoValido = true;
                }
                this.guardarFormButton.setDisable(!this.isValidoFormulario());
            }
        });

        //Para hacer un filtro de busqueda rapido
        this.nombreTextF.textProperty().addListener((observable, oldValue, newValue) -> {
            List<Persona> personas = SQLAccessPersona.
                    getpersonasByNameContains(this.nombreTextF.getText());

            //Pintamos el numero de elementos que encontramos
            this.infoLabel.setText(personas.size() + " personas encontrados");
            //Lo comento para que no sea vea, ya que es una prueba.
            this.infoLabel.setVisible(true);
        });

        //Añadir listener a la propiedad de elemento seleccionado de la lista
        this.personasListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            this.pp = newValue;
            if(newValue != null){
                this.editarListViewButton.setDisable(false);
                this.eliminarListViewButton.setDisable(false);


            }else{
                this.editarListViewButton.setDisable(true);
                this.eliminarListViewButton.setDisable(true);
            }
        });
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
        this.loadPersonInListView();
        this.selectPanelVisible(2);
    }

    @FXML
    public void onInsertButtonClick(ActionEvent actionEvent) {
        this.isNewPerson = true;
        this.configureFormView();
        this.selectPanelVisible(1);
    }

    public void onGuardarFormClick(ActionEvent actionEvent) {
        //Guardar en el formulario, insertar en el SQL
        this.pp = Persona.builder()
                .dni(this.dniTextF.getText())
                .name(this.nombreTextF.getText())
                .surname(this.apellidosTextF.getText())
                .email(this.emailTextF.getText())
                .age(Integer.parseInt(this.edadTextF.getText()))
                .phone(this.telefonoTextF.getText())
                .build();

        if(this.isNewPerson){
            try {
                if (SQLAccessPersona.createPersona(pp)) {
                    this.clearFieldTexts();
                    this.infoLabel.setText(this.estadosLabel[0]);
                    this.infoLabel.setVisible(true);
                } else {
                    this.infoLabel.setText(this.estadosLabel[1]);
                    this.infoLabel.setVisible(true);
                }
            }catch(Exception e){
                this.infoLabel.setText(this.estadosLabel[2]);
                this.infoLabel.setVisible(true);
            }
            this.guardarFormButton.setDisable(true);
        }else{
            try{
                if (SQLAccessPersona.updatePersona(this.pp)) {
                    this.clearFieldTexts();
                    this.infoLabel.setText(this.estadosLabel[4]);
                    this.infoLabel.setVisible(true);
                } else {
                    this.infoLabel.setText(this.estadosLabel[1]);
                    this.infoLabel.setVisible(true);
                }
            } catch (Exception e) {
                this.infoLabel.setText(this.estadosLabel[2]);
                this.infoLabel.setVisible(true);
            }
        }
    }

    public void onCancelFormClick(ActionEvent actionEvent) {
        this.formView.setVisible(false);
        this.mainView.setVisible(true);
        this.clearFieldTexts();
        this.guardarFormButton.setDisable(true);
    }

    //Eventos botones ListView
    public void onEditarListViewButtonClick(ActionEvent actionEvent) {
        if(this.pp != null){
            // Cargar datos en el formulario y configurar que estamos en editar
            this.isNewPerson = false;
            this.configureFormView();
            this.selectPanelVisible(1);

        }
    }

    public void onEliminarListViewButtonClick(ActionEvent actionEvent) {
        if(this.pp != null){
            SQLAccessPersona.deletePersonaByDNI(this.pp.getDni());
            this.loadPersonInListView();
        }
    }

    public void onCancelListViewButtonClick(ActionEvent actionEvent) {
        this.selectPanelVisible(0);

    }

    // Metodos validaciones y auxiliares
    public boolean isValidoFormulario(){
        return (isDniValido && isNombreValido && isApellidosValido
        && isEmailValido && isEdadValido && isTelefonoValido);
    }

    public void loadPersonInListView(){

        //Limpiar los datos anteriores de la ObservableList
        this.personas.clear();
        //Llamar a SQL y traer todas las personas
        List<Persona> misPersonas = SQLAccessPersona.getAllpersonas();
        //Cargo en el OnservableList los datos
        this.personas.addAll(misPersonas);
        //Defino en el ListView los elementos (el Observable List)
        this.personasListView.setItems(this.personas);
    }

    private void clearFieldTexts() {
        this.dniTextF.clear();
        this.nombreTextF.clear();
        this.apellidosTextF.clear();
        this.emailTextF.clear();
        this.telefonoTextF.clear();
        this.edadTextF.clear();

        this.dniTextF.setPromptText("12345678Z");
        this.nombreTextF.setPromptText("Pedro");
        this.apellidosTextF.setPromptText("Picapiedra Marmol");
        this.emailTextF.setPromptText("ppm@gmail.com");
        this.telefonoTextF.setPromptText("123789444");
        this.edadTextF.setPromptText("33");

        this.dniTextF.getStyleClass().remove("my-validated-text");
        this.dniTextF.getStyleClass().remove("my-error-text");

        this.nombreTextF.getStyleClass().remove("my-validated-text");
        this.nombreTextF.getStyleClass().remove("my-error-text");

        this.apellidosTextF.getStyleClass().remove("my-validated-text");
        this.apellidosTextF.getStyleClass().remove("my-error-text");

        this.emailTextF.getStyleClass().remove("my-validated-text");
        this.emailTextF.getStyleClass().remove("my-error-text");

        this.telefonoTextF.getStyleClass().remove("my-validated-text");
        this.telefonoTextF.getStyleClass().remove("my-error-text");

        this.edadTextF.getStyleClass().remove("my-validated-text");
        this.edadTextF.getStyleClass().remove("my-error-text");

        this.infoLabel.setVisible(false);
    }

    private boolean validateDni(String dni){
        return dni.matches("[0-9]{7,8}[A-Z a-z]");
    }

    private boolean validateAge(String age){
        return age.matches("[0-9]{1,3}");
    }

    private boolean validateEmail(String email){
        String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(emailPattern);
    }

    private boolean validatePhone(String phone){
        return phone.matches("[6-9]{1}[0-9]{8}");
    }

    private boolean validateName(String name){
        return (name.length() > 3 && name.matches("[A-Z]{1}[a-z]{2,25}"));
    }

    private void selectPanelVisible(int panel){
        switch (panel){
            case 0: //panel principal
                this.mainView.setVisible(true);
                this.listView.setVisible(false);
                this.formView.setVisible(false);
                break;

            case 1: //panel formulario
                this.mainView.setVisible(false);
                this.listView.setVisible(false);
                this.formView.setVisible(true);
                break;

            case 2: //panel formulario
                this.mainView.setVisible(false);
                this.listView.setVisible(true);
                this.formView.setVisible(false);
                break;

            case 3: //panel formulario
                this.mainView.setVisible(false);
                this.listView.setVisible(false);
                this.formView.setVisible(false);
                break;

            default:
                this.mainView.setVisible(true);
                this.listView.setVisible(false);
                this.formView.setVisible(false);

        }
    }

    private void configureFormView(){
        if(isNewPerson){
            this.labelFormTitle.setText("Insertar nueva Persona");
        }
        else{
            this.labelFormTitle.setText("Actualizar Persona");
            if(pp != null){
                this.dniTextF.setText(pp.getDni());
                this.nombreTextF.setText(pp.getName());
                this.apellidosTextF.setText(pp.getSurname());
                this.emailTextF.setText(pp.getEmail());
                this.edadTextF.setText(String.valueOf(pp.getAge()));
                this.telefonoTextF.setText(String.valueOf(pp.getPhone()));
            }

        }
    }


}
