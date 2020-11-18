/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bernat.fiol.m03uf05practica4.entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernat
 */
public class CuentaCorrienteACreditoGoldTest {
    
    private CuentaCorritenteImpl conta;
    
    public CuentaCorrienteACreditoGoldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        conta = new CuentaCorrienteACreditoGold("asdsad", 1000.0);
    }
    
    @After
    public void tearDown() {
        conta = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoGold.
     */
    
    @Test
    public void testAbona() {
        conta.abona(400);
        double expected = 600;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    @Test
    public void testAbonaDescubert() {
        conta.abona(4000.0);
        double expected = -3000;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testAbonaErrorSaldo() {
        conta.abona(4001.0);
        double expected = -3000;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
}
