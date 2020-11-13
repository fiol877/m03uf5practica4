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
public class CuentaCorrienteACreditoPlatinumTest {
    
    public CuentaCorrienteACreditoPlatinumTest() {
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
     * Test of abona method, of class CuentaCorrienteACreditoPlatinum.
     */
    @Test
    public void testAbona() {
        CuentaCorritenteImpl conta = new CuentaCorrienteACreditoPlatinum("asdsad", 1000.0);
        conta.abona(110.0);
        double expected = 890;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    @Test
    public void testAbonaDescubert() {
        CuentaCorritenteImpl conta = new CuentaCorrienteACreditoPlatinum("asdsad", 1000.0);
        conta.abona(6000.0);
        double expected = -5000;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testAbonaErrorSaldo() {
        CuentaCorritenteImpl conta = new CuentaCorrienteACreditoPlatinum("asdsad", 1000.0);
        conta.abona(6001.0);
        double expected = -4000;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
}
