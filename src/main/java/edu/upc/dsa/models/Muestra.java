package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Muestra {
    String idMuestra;
    String idClinico;
    String idPersona;
    String fecha;
    String idLaboratorio;


    public Muestra(){
        this.idMuestra = RandomUtils.getId();
    }
    public Muestra( String idClinico, String idPersona, String fecha) {
        this();
        this.setIdClinico(idClinico);
        this.setIdPersona(idPersona);
        this.setFecha(fecha);
    }

    public String getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(String idMuestra) {
        this.idMuestra = idMuestra;
    }

    public String getIdClinico() {
        return idClinico;
    }

    public void setIdClinico(String idClinico) {
        this.idClinico = idClinico;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(String idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
}
