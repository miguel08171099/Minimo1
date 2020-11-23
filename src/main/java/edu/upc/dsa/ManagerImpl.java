package edu.upc.dsa;
import edu.upc.dsa.models.Objeto;
import java.util.*;
import org.apache.log4j.Logger;

public class ManagerImpl implements Manager {
    // Singleton(I): private static
    private static ManagerImpl instance;
    // Definir estructuras (listas, colas, hashmaps, ...) necesarias
    protected List<Objeto> objetos;
    protected HashMap<String, Objeto> hashMap;
    final static Logger logger = Logger.getLogger(ManagerImpl.class);

    // Singleton(II): private constructor
    private ManagerImpl() {
        this.objetos = new LinkedList<>();
        this.hashMap = new HashMap<>();

    }
    // Singleton(III): public static getInstance
    public static ManagerImpl getInstance() {
        if (instance==null) instance = new ManagerImpl();
        return instance;
    }

// IMPLEMENTACION DE LAS FUNCIONES DE LA INTERFICIE

    public List<Objeto> listarObjetosPorAlgo(){
        List<Objeto> objetosOrdenados = objetos;
        Collections.sort(objetosOrdenados);
        return objetosOrdenados;
    }

    @Override
    public String añadirObjeto(String nombre, double precio) {
        logger.info("nuevo objeto " + nombre);
        Objeto p = new Objeto(nombre, precio);
        this.objetos.add(p);
        logger.info("añadido nuevo objeto " + p.getId());
        return p.getId();
    }

    @Override
    public void liberarRecursos() {
        this.objetos.clear();
        this.hashMap.clear();
    }

}