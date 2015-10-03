/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.util;

import br.edu.ifes.cafeteria.cdp.Cafe;
import br.edu.ifes.cafeteria.cdp.Ingrediente;
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
public class FabricaCafeCappuccinoTest {
    
    public FabricaCafeCappuccinoTest() {
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
     * Test of addIngrediente method, of class FabricaCafeCappuccino.
     */
    @Test
    public void testAddIngrediente() {
        System.out.println("addIngrediente");
        FabricaCafeCappuccino instance = new FabricaCafeCappuccino();
        ArrayList<Ingrediente> expResult = null;
        ArrayList<Ingrediente> result = instance.addIngrediente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarCafe method, of class FabricaCafeCappuccino.
     */
    @Test
    public void testCriarCafe() {
        System.out.println("criarCafe");
        FabricaCafeCappuccino instance = new FabricaCafeCappuccino();
        Cafe expResult = null;
        Cafe result = instance.criarCafe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
