/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduardovasconcelos
 */
public class exemploDivisaoTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of divisao method, of class exemploDivisao.
     */
    @Test
    public void testDivisao() {
        System.out.println("divisao");
        int a = 2;
        int b = 1;
        int expResult = 2;
        int result = exemploDivisao.divisao(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDivisaoErro() {
        System.out.println("divisao");
        int a = 2;
        int b = 2;
        int expResult = 2;
        int result = exemploDivisao.divisao(a, b);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of soma method, of class exemploDivisao.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = exemploDivisao.soma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of soma method, of class exemploDivisao.
     */
    
    
    
}
