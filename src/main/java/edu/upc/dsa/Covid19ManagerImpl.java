package edu.upc.dsa;
import edu.upc.dsa.models.*;

import java.util.*;
import org.apache.log4j.Logger;

public class Covid19ManagerImpl implements Covid19Manager {
    // Singleton(I): private static
    private static Covid19ManagerImpl instance;
    // Definir estructuras (listas, colas, hashmaps, ...) necesarias
    protected HashMap<String, Persona> contenedorPersonas;
    protected ArrayList<Laboratorio> laboratorios;
    protected Queue<Muestra> muestrasPendientesProcesar;
    protected List<Informe> listaInformesUsuario;
    final static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);

    // Singleton(II): private constructor
    private Covid19ManagerImpl() {
        this.contenedorPersonas = new HashMap<>();
        this.laboratorios = new ArrayList<>();
        this.muestrasPendientesProcesar = new ArrayDeque<>();
        this.listaInformesUsuario = new LinkedList<>();

    }
    // Singleton(III): public static getInstance
    public static Covid19ManagerImpl getInstance() {
        if (instance==null) instance = new Covid19ManagerImpl();
        return instance;
    }

// IMPLEMENTACION DE LAS FUNCIONES DE LA INTERFICIE


    @Override
    public boolean AñadirPersona(String idPersona, String nombre, String apellidos, int edad, String salud) {
        logger.info("nueva persona " + nombre);
        Persona p = this.contenedorPersonas.get(idPersona);
        if (p == null) {
            new Persona(idPersona, nombre, apellidos, edad, salud);
            this.contenedorPersonas.put(idPersona, p);
        }
        logger.info("añadido nueva persona " + p.getNombre());
        return true;
    }


    @Override
    public void ExtraerYEnviarMuestra(String idMuestra, String idClinico, String idPersona, String fecha, String idLaboratorio) {
        Muestra muestraPendiente = new Muestra();
        muestraPendiente.setIdMuestra(idMuestra);
        muestraPendiente.setIdClinico(idClinico);
        muestraPendiente.setIdPersona(idPersona);
        muestraPendiente.setFecha(fecha);
        muestraPendiente.setIdLaboratorio(idLaboratorio);
        muestrasPendientesProcesar.add(muestraPendiente);

    }

    @Override
    public Informe ProcesarMuestra() {
        String resultado;
        String comentario;
        Informe informe= null;
        Muestra mProcesada = new Muestra();
        mProcesada = muestrasPendientesProcesar.poll();
        if(mProcesada != null) {
            resultado = "positivo";
            comentario = "La muestra" + mProcesada.getIdMuestra() + "ha sido procesada";
            informe = new Informe(mProcesada, resultado, comentario);
        }
        return informe;
    }

    @Override
    public List<Informe> ObtenerMuestrasProcesadasPersona(String idPersona) {
        List<Informe> informesPersona = new LinkedList<>();
            for (int i = 0; i < listaInformesUsuario.size(); i++) {
                Informe inf = listaInformesUsuario.get(i);
                if(inf.getMuestra().getIdPersona() == idPersona)
                    informesPersona.add(inf);
                }
        return informesPersona;
    }

    @Override
    public void liberarRecursos() {
        this.contenedorPersonas.clear();
        this.laboratorios.clear();
        this.muestrasPendientesProcesar.clear();
        this.listaInformesUsuario.clear();
    }

}