/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrimero method, of class Metodos.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        String expResult = "1.Presupuesto.xlsx,10";
        String result = Metodos.getPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of CargarDatos method, of class Metodos.
     */
    @Test
    public void testCargarDatos() {
        System.out.println("CargarDatos");
        JTable jTdatos = null;
        Metodos.CargarDatos(jTdatos);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    
    }

    /**
     * Test of sizecola method, of class Metodos.
     */
    @Test
    public void testSizecola() {
        System.out.println("sizecola");
        int expResult = 3;
        int result = Metodos.sizecola();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFirtsCola method, of class Metodos.
     */
    @Test
    public void testDeleteFirtsCola() {
        System.out.println("deleteFirtsCola");
        Metodos.deleteFirtsCola();
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }

    /**
     * Test of Atender method, of class Metodos.
     */
    @Test
    public void testAtender() {
        System.out.println("Atender");
        boolean expResult = true;
        boolean result = Metodos.Atender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
