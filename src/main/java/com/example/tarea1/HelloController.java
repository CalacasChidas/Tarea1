package com.example.tarea1;

//Imports para usar el JavaFX
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//Clase controlador
public class HelloController {

    //Contador de personas creadas
    int contadorPersonas = 0;
    //Labels
    @FXML
    private Label personasCreadasCont;

    @FXML
    private Label nombrePersona1;

    @FXML
    private Label nombrePersona2;

    @FXML
    private Label provincia;

    //Label que cambia al seleccionar una provincia y funciona como entrada de texto
    @FXML
    private Label resultado;

    //Text fields para getters de texto
    @FXML
    private TextField nombre;

    @FXML
    private TextField edad;
    //Función para el botón de crear persona
    @FXML
    void crearPersona(MouseEvent event) {
        while (contadorPersonas != 5) {
            if (nombre.getText() == null || nombre.getText().trim().isEmpty()) {
                //Verificador de entrada de texto del nombre
                resultado.setText("Debe ingresar su nombre!");
                break;
            }
            if (edad.getText() == null || edad.getText().trim().isEmpty()) {
                //Verificador de entrada de texto de la edad
                resultado.setText("Debe ingresar su edad!");
                break;
            }
            if (provincia.getText()==null || provincia.getText().trim().isEmpty()) {
                //Verificador de entrada de texto de la provincia
                resultado.setText("Debe ingresar su provincia!");
                break;
            }
            if (contadorPersonas == 0) {
                //Creador de la primera persona
                Persona persona1 = new Persona(nombre.getText(), provincia.getText(), Integer.parseInt(edad.getText()));
                personasCreadasCont.setText("1");
                persona1.showPersona();
                contadorPersonas++;
                break;
            }
            if (contadorPersonas == 1) {
                //Creador de la segunda persona
                Persona persona2 = new Persona(nombre.getText(), provincia.getText(), Integer.parseInt(edad.getText()));
                personasCreadasCont.setText("2");
                contadorPersonas++;
                persona2.showPersona();
                break;
            }
            if (contadorPersonas == 2) {
                //Creador de la tercera persona
                Persona persona3 = new Persona(nombre.getText(), provincia.getText(), Integer.parseInt(edad.getText()));
                personasCreadasCont.setText("3");
                contadorPersonas++;
                persona3.showPersona();
                break;
            }
            if (contadorPersonas == 3) {
                //Creador de la cuarta y última persona
                Persona persona4 = new Persona(nombre.getText(), provincia.getText(), Integer.parseInt(edad.getText()));
                personasCreadasCont.setText("4");
                contadorPersonas++;
                persona4.showPersona();
                break;
            }
            if (contadorPersonas == 4){
                //Evita que se creen más de 4 personas
                resultado.setText("Cantidad máxima de personas alcanzadas");
                break;
            }
        }
    }
//Estos son los setters de la provincia con la dropdown list, funcionan como setter de texto para el label "provincia"
    @FXML
    void alaj(ActionEvent event) {
        provincia.setText("Alajuela");
    }

    @FXML
    void cartago(ActionEvent event) {
        provincia.setText("Cartago");
    }

    @FXML
    void flor(ActionEvent event) {
        provincia.setText("Heredia");
    }

    @FXML
    void guana(ActionEvent event) {
        provincia.setText("Guanacaste");
    }

    @FXML
    void mimon(ActionEvent event) {
        provincia.setText("Limón");
    }

    @FXML
    void sand(ActionEvent event) {
        provincia.setText("Puntarenas");
    }

    @FXML
    void sj(ActionEvent event) {
        provincia.setText("San José");
    }

    //Funciones para las operaciones de edad
    @FXML
    void divi(MouseEvent event) {

    }
    @FXML
    void multi(MouseEvent event) {

    }
    @FXML
    void resta(MouseEvent event) {

    }
    @FXML
    void suma(MouseEvent event) {

    }

}