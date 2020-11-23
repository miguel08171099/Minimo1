package edu.upc.dsa;
import edu.upc.dsa.models.Informe;
import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.Laboratorio;

import java.util.List;
import java.util.Queue;

public interface Covid19Manager {

    // Funciones que diga el enunciado +
    //              añadir y eliminar cosas (para ayudar al test) +
    //                                                  Liberar recursos

    public boolean AñadirPersona(String idPersona, String nombre, String apellidos, int edad, String salud);
    public void ExtraerYEnviarMuestra(String idMuestra, String idClinico, String idPersona, String fecha, String idLaboratorio);
    public Informe ProcesarMuestra();
    public List<Informe> ObtenerMuestrasProcesadasPersona(String idPersona);

    public void liberarRecursos();

}
