/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectofactura;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author marti
 */
public class ArtigoFacturaTest {
    
    public ArtigoFacturaTest() {
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
     * Test of getPrezoUnitario method, of class ArtigoFactura.
     */
  

    /**
     * Test of obterPrezoTotal method, of class ArtigoFactura.
     */
    @Test
    public void testObterPrezoTotal() {
        System.out.println("obterPrezoTotal");
        ArtigoFactura instance = new ArtigoFactura ("MP14", "Rato inalambrico", 20,10);
        double expResult = 200.0;
        double result = instance.obterPrezoTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
