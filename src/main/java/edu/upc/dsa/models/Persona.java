package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Persona{
    // Variables objeto
    String idPersona;
    String nombre;
    String apellidos;
    int edad;
    String salud;

    public Persona(String idPersona, String nombre, String apellidos, int edad, String salud) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salud = salud;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }


}