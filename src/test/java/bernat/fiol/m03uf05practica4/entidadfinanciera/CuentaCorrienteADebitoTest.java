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
public class CuentaCorrienteADebitoTest {
    
    public CuentaCorrienteADebitoTest() {
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
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    public void testAbona() {
        CuentaCorritenteImpl conta = new CuentaCorrienteADebito("asdsad", 1000.0);
        conta.abona(999.0);
        double expected = 1.0;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    
    @Test(expected = UnsupportedOperationException.class)
    public void testAbonaError() {
        CuentaCorritenteImpl conta = new CuentaCorrienteADebito("asdsad", 1000.0);
        conta.abona(-999.0);
        double expected = 1.0;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testAbonaErrorSuperior() {
        CuentaCorritenteImpl conta = new CuentaCorrienteADebito("asdsad", 1000.0);
        conta.abona(1999.0);
        double expected = 1.0;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    @Test
    public void testIngresa() {
        CuentaCorritenteImpl conta = new CuentaCorrienteADebito("asdsad", 1000.0);
        conta.ingresa(100.0);
        double expected = 1100.0;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIngresaError() {
        CuentaCorritenteImpl conta = new CuentaCorrienteADebito("asdsad", 1000.0);
        conta.ingresa(-100.0);
        double expected = 1100.0;
        
        assertEquals(expected, conta.getSaldo(), 2);
    }
    
}
