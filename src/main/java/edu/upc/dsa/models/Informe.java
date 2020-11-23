package edu.upc.dsa.models;

public class Informe {
    Muestra muestra;
    String resultado;
    String comentario;

    public Informe(Muestra muestra, String resultado, String comentario) {
        this.muestra = muestra;
        this.resultado = resultado;
        this.comentario = comentario;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
