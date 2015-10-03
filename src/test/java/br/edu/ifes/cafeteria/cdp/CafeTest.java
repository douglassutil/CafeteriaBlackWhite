/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.cdp;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michelle
 */
public class CafeTest {
    
    public CafeTest() {
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
     * Test of getPreco method, of class Cafe.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Cafe instance = null;
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class Cafe.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        double preco = 0.0;
        Cafe instance = null;
        instance.setPreco(preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstIngrediente method, of class Cafe.
     */
    @Test
    public void testGetLstIngrediente() {
        System.out.println("getLstIngrediente");
        Cafe instance = null;
        ArrayList<Ingrediente> expResult = null;
        ArrayList<Ingrediente> result = instance.getLstIngrediente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstIngrediente method, of class Cafe.
     */
    @Test
    public void testSetLstIngrediente() {
        System.out.println("setLstIngrediente");
        ArrayList<Ingrediente> lstIngrediente = null;
        Cafe instance = null;
        instance.setLstIngrediente(lstIngrediente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ImprimirIngrediente method, of class Cafe.
     */
    @Test
    public void testImprimirIngrediente() {
        System.out.println("ImprimirIngrediente");
        Cafe instance = null;
        instance.ImprimirIngrediente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
