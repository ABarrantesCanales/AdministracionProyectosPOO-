/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ali
 */
public class JefeIT {
    
    public JefeIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getProyectos method, of class Jefe.
     */
    @Test
    public void testGetProyectos() {
        System.out.println("getProyectos");
        Jefe instance = null;
        ArrayList<Proyecto> expResult = null;
        ArrayList<Proyecto> result = instance.getProyectos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheck method, of class Jefe.
     */
    @Test
    public void testGetCheck() {
        System.out.println("getCheck");
        Jefe instance = null;
        boolean expResult = false;
        boolean result = instance.getCheck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadeProyecto method, of class Jefe.
     */
    @Test
    public void testAnadeProyecto() {
        System.out.println("anadeProyecto");
        Proyecto proyecto = null;
        Jefe instance = null;
        boolean expResult = false;
        boolean result = instance.anadeProyecto(proyecto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProyecto method, of class Jefe.
     */
    @Test
    public void testGetProyecto() {
        System.out.println("getProyecto");
        String nombre = "";
        Jefe instance = null;
        Proyecto expResult = null;
        Proyecto result = instance.getProyecto(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
