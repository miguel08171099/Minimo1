package edu.upc.dsa;

import edu.upc.dsa.models.Objeto;

import java.util.List;

public interface Manager {

    // Funciones que diga el enunciado +
    //              añadir y eliminar cosas (para ayudar al test) +
    //                                                  Liberar recursos

    public List<Objeto> listarObjetosPorAlgo();
    public String añadirObjeto(String nombre, double precio);
    public void liberarRecursos();

}
