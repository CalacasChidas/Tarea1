package com.example.tarea1;

public class Persona {
    int edad;
    String nombre;
    String provincia;

    public Persona(String nombre, String provincia, int edad) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.edad = edad;
    }
    public void showPersona(){
        System.out.println(getNombre());
        System.out.println(getEdad());
        System.out.println(getProvincia());
        System.out.println("------------------------");
    }
    //Getter para la edad
    public int getEdad() {
        return edad;
    }
    //Getter para el nombre
    public String getNombre() {
        return nombre;
    }
    //Getter para la provincia
    public String getProvincia() {
        return provincia;
    }
    //Setter para la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    ///Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Setter para la provincia
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
