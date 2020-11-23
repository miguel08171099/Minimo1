package edu.upc.dsa;
import edu.upc.dsa.models.Objeto;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ManagerTest {
    ManagerImpl Manager;
    String idObjeto1;
    String idObjeto2;
    String idObjeto3;
    int Usuario1 = 1;
    int Usuario2 = 2;
    int idPedido = 0;
    List<Objeto> lista1 = new ArrayList<Objeto>();
    List<Objeto> lista2 = new LinkedList<Objeto>();
    @Before
    public void setUp() throws Exception{
        // Inicializar instancia y añadir objetos necesarios para hacer los tests
        this.Manager = ManagerImpl.getInstance();
        //Crear objetos
        idObjeto1=this.Manager.añadirObjeto("cafe", 1.25);
        idObjeto2=this.Manager.añadirObjeto("cortado", 1.50);
        idObjeto3=this.Manager.añadirObjeto("te", 1.00);
    }
    @After
    public void tearDown(){
        this.Manager.liberarRecursos();
    }

//    @Test


}