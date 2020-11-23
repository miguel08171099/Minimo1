package edu.upc.dsa.models;

public class Laboratorio {
    String idLaboratio;
    String nombre;

    public Laboratorio(String idLaboratio, String nombre) {
        this.idLaboratio = idLaboratio;
        this.nombre = nombre;
    }
    public String getIdLaboratio() {
        return idLaboratio;
    }

    public void setIdLaboratio(String idLaboratio) {
        this.idLaboratio = idLaboratio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
