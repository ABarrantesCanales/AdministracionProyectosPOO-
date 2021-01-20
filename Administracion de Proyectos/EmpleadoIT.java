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
public class EmpleadoIT {
    
    public EmpleadoIT() {
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
     * Test of addProyecto method, of class Empleado.
     */
    @Test
    public void testAddProyecto() {
        System.out.println("addProyecto");
        Proyecto p = null;
        Empleado instance = null;
        instance.addProyecto(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProyecto method, of class Empleado.
     */
    @Test
    public void testBuscarProyecto() {
        System.out.println("buscarProyecto");
        String pro = "";
        Empleado instance = null;
        Proyecto expResult = null;
        Proyecto result = instance.buscarProyecto(pro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTarea method, of class Empleado.
     */
    @Test
    public void testAddTarea() {
        System.out.println("addTarea");
        Tarea t = null;
        Empleado instance = null;
        instance.addTarea(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTarea method, of class Empleado.
     */
    @Test
    public void testBuscarTarea() {
        System.out.println("buscarTarea");
        String tarea = "";
        Empleado instance = null;
        Tarea expResult = null;
        Tarea result = instance.buscarTarea(tarea);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProyectos method, of class Empleado.
     */
    @Test
    public void testGetProyectos() {
        System.out.println("getProyectos");
        Empleado instance = null;
        ArrayList<Proyecto> expResult = null;
        ArrayList<Proyecto> result = instance.getProyectos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTareas method, of class Empleado.
     */
    @Test
    public void testGetTareas() {
        System.out.println("getTareas");
        Empleado instance = null;
        ArrayList<Tarea> expResult = null;
        ArrayList<Tarea> result = instance.getTareas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartamento method, of class Empleado.
     */
    @Test
    public void testGetDepartamento() {
        System.out.println("getDepartamento");
        Empleado instance = null;
        Departamento expResult = null;
        Departamento result = instance.getDepartamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartamento method, of class Empleado.
     */
    @Test
    public void testSetDepartamento() {
        System.out.println("setDepartamento");
        Departamento departamento = null;
        Empleado instance = null;
        instance.setDepartamento(departamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
