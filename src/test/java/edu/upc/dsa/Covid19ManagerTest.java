package edu.upc.dsa;
import edu.upc.dsa.models.Persona;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Covid19ManagerTest {
    Covid19ManagerImpl Manager;
    @Before
    public void setUp() throws Exception{
        // Inicializar instancia y añadir objetos necesarios para hacer los tests
        this.Manager = Covid19ManagerImpl.getInstance();
        //Crear objetos
        this.Manager.AñadirPersona("1", "Mickey", "Mouse", 20, "A");
        this.Manager.AñadirPersona("2", "Donald", "Duck", 25, "C");
    }
    @After
    public void tearDown(){
        this.Manager.liberarRecursos();
    }

    @Test
    public void nuevaPersonaTest(){
        int numeroPersonas = this.Manager.contenedorPersonas.size();
        Assert.assertEquals(2, numeroPersonas);
        this.Manager.AñadirPersona("3", "Miguel", "Marin", 20, "A");
        numeroPersonas = this.Manager.contenedorPersonas.size();
        Assert.assertEquals(3, numeroPersonas);
    }

    @Test
    public void procesarMuestraTest(){

    }



}