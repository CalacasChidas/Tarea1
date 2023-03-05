package com.example.tarea1;

//Imports para usar el JavaFX

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

//Clase controlador
public class HelloController implements Initializable {
    //Funciones de creador de personas
    //Valores a utilizar para la calculadora
    int contadorPersonas = 0;
    String nameper1 = "";
    String nameper2 = "";
    String nameper3 = "";
    String nameper4 = "";

    int edad1 = 0;
    int edad2 = 0;
    int edad3 = 0;
    int edad4 = 0;

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

    //Text fields para getters
    @FXML
    private TextField nombre;

    @FXML
    private Spinner<Integer> ageSpinner;
    SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 110, 1);
    //Función para el botón de crear persona

    //Iniciador de la creación de personas
    @FXML
    void crearPersona(MouseEvent event) {
        while (contadorPersonas != 5) {
            if (nombre.getText() == null || nombre.getText().trim().isEmpty()) {
                //Verificador de entrada de texto del nombre
                resultado.setText("Debe ingresar su nombre!");
                break;
            }
            if (provincia.getText() == null || provincia.getText().trim().isEmpty()) {
                //Verificador de entrada de texto de la provincia
                resultado.setText("Debe ingresar su provincia!");
                break;
            }
            if (contadorPersonas == 0) {
                //Creador de la primera persona
                Persona persona1 = new Persona(nombre.getText(), provincia.getText(), ageSpinner.getValue());
                nameper1 = persona1.getNombre();
                edad1 = persona1.getEdad();
                personasCreadasCont.setText("1");
                System.out.println("Persona 1: ");
                persona1.showPersona();
                contadorPersonas++;
                break;
            }
            if (contadorPersonas == 1) {
                //Creador de la segunda persona
                Persona persona2 = new Persona(nombre.getText(), provincia.getText(), ageSpinner.getValue());
                personasCreadasCont.setText("2");
                nameper2 = persona2.getNombre();
                edad2 = persona2.getEdad();
                contadorPersonas++;
                System.out.println("Persona 2: ");
                persona2.showPersona();
                break;
            }
            if (contadorPersonas == 2) {
                //Creador de la tercera persona
                Persona persona3 = new Persona(nombre.getText(), provincia.getText(), ageSpinner.getValue());
                personasCreadasCont.setText("3");
                nameper3 = persona3.getNombre();
                edad3 = persona3.getEdad();
                contadorPersonas++;
                System.out.println("Persona 3: ");
                persona3.showPersona();
                break;
            }
            if (contadorPersonas == 3) {
                //Creador de la cuarta y última persona
                Persona persona4 = new Persona(nombre.getText(), provincia.getText(), ageSpinner.getValue());
                personasCreadasCont.setText("4");
                nameper4 = persona4.getNombre();
                edad4 = persona4.getEdad();
                contadorPersonas++;
                System.out.println("Persona 4:");
                persona4.showPersona();
                break;
            }
            if (contadorPersonas == 4) {
                //Evita que se creen más de 4 personas
                resultado.setText("Cantidad máxima de personas alcanzada!");
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
    //------------------------------------------------------------------------------
    //Funciones para la calculadora de edades

    int dato1 = 0; //Este es el primer dato que va a usar la calculadora
    int dato2 = 0;//Este es el segundo dato que usa

    //Etos son los setters para los datos que usa la calculadora

    //Dropdown list de la primera persona
    @FXML
    void persona11(ActionEvent event) {
        if (nameper1 == "") {
            nombrePersona1.setText("Persona no creada aún");
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        } else {
            nombrePersona1.setText(nameper1);
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        }
    }

    @FXML
    void persona12(ActionEvent event) {
        if (nameper2 == "") {
            nombrePersona1.setText("Persona no creada aún");
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        } else {
            nombrePersona1.setText(nameper2);
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        }
    }

    @FXML
    void persona13(ActionEvent event) {
        if (nameper3 == "") {
            nombrePersona1.setText("Persona no creada aún");
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        } else {
            nombrePersona1.setText(nameper3);
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        }
    }

    @FXML
    void persona14(ActionEvent event) {
        if (nameper4 == "") {
            nombrePersona1.setText("Persona no creada aún");
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        } else {
            nombrePersona1.setText(nameper4);
            dato1 = edad1;
            System.out.println("Dato 1: " + dato1);
        }
    }

    //Dropdown list de la segunda persona
    @FXML
    void persona21(ActionEvent event) {
        if (nameper1 == "") {
            nombrePersona2.setText("Persona no creada aún");
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        } else {
            nombrePersona2.setText(nameper1);
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        }
    }

    @FXML
    void persona22(ActionEvent event) {
        if (nameper2 == "") {
            nombrePersona2.setText("Persona no creada aún");
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        } else {
            nombrePersona2.setText(nameper2);
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        }
    }

    @FXML
    void persona23(ActionEvent event) {
        if (nameper3 == "") {
            nombrePersona2.setText("Persona no creada aún");
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        } else {
            nombrePersona2.setText(nameper3);
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        }
    }

    @FXML
    void persona24(ActionEvent event) {
        if (nameper4 == "") {
            nombrePersona2.setText("Persona no creada aún");
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        } else {
            nombrePersona2.setText(nameper4);
            dato2 = edad1;
            System.out.println("Dato 2: " + dato2);
        }
    }

    //Funciones para las operaciones de edad
    @FXML
    void divi(MouseEvent event) {
        if (dato1 == 0 & dato2 != 0) {
            dato1 = 1;
            resultado.setText(Integer.toString(dato1 / dato2));
        }
        if (dato2 == 0 & dato1 != 0) {
            dato2 = 1;
            resultado.setText(Integer.toString(dato1 / dato2));
        } else {
            resultado.setText(Integer.toString(dato1 / dato2));
        }
    }

    @FXML
    void multi(MouseEvent event) {
        if (dato1 == 0 & dato2 != 0) {
            dato1 = 1;
            resultado.setText(Integer.toString(dato1 * dato2));
        }
        if (dato2 == 0 & dato1 != 0) {
            dato2 = 1;
            resultado.setText(Integer.toString(dato1 * dato2));
        } else {
            resultado.setText(Integer.toString(dato1 * dato2));
        }
    }

    @FXML
    void resta(MouseEvent event) {
        resultado.setText(Integer.toString(dato1 - dato2));
    }

    @FXML
    void suma(MouseEvent event) {
        resultado.setText(Integer.toString(dato1 + dato2));
    }

    //Iniciador de los valores para el spinner de la edad
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ageSpinner.setValueFactory(svf);
    }
}
