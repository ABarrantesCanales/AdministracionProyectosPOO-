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
public class DepartamentoIT {
    
    public DepartamentoIT() {
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
     * Test of getProyectos method, of class Departamento.
     */
    @Test
    public void testGetProyectos() {
        System.out.println("getProyectos");
        Departamento instance = null;
        ArrayList<Proyecto> expResult = null;
        ArrayList<Proyecto> result = instance.getProyectos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProyecto method, of class Departamento.
     */
    @Test
    public void testAddProyecto() {
        System.out.println("addProyecto");
        Proyecto p = null;
        Departamento instance = null;
        instance.addProyecto(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpleados method, of class Departamento.
     */
    @Test
    public void testGetEmpleados() {
        System.out.println("getEmpleados");
        Departamento instance = null;
        ArrayList<Empleado> expResult = null;
        ArrayList<Empleado> result = instance.getEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmpleado method, of class Departamento.
     */
    @Test
    public void testAddEmpleado() {
        System.out.println("addEmpleado");
        Empleado e = null;
        Departamento instance = null;
        boolean expResult = false;
        boolean result = instance.addEmpleado(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreDepartamento method, of class Departamento.
     */
    @Test
    public void testGetNombreDepartamento() {
        System.out.println("getNombreDepartamento");
        Departamento instance = null;
        String expResult = "";
        String result = instance.getNombreDepartamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreDepartamento method, of class Departamento.
     */
    @Test
    public void testSetNombreDepartamento() {
        System.out.println("setNombreDepartamento");
        String nombreDepartamento = "";
        Departamento instance = null;
        instance.setNombreDepartamento(nombreDepartamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
