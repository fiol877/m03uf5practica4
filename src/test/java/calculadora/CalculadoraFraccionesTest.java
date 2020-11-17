package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Bernat
 */
public class CalculadoraFraccionesTest {
    
    private CalculadoraFracciones instance;
    
    public CalculadoraFraccionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando test . . .");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("We done bois!");
    }
    
    @Before
    public void setUp() {
        Fraccion f1 = new Fraccion(3, 4);
        Fraccion f2 = new Fraccion(6, 10);
        instance = new CalculadoraFracciones(f1, f2);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testSum() {
        assertEquals(new Fraccion(27,20), instance.sum());
    }

    @Test
    public void testResta() {
        assertEquals(new Fraccion(3,20), instance.resta());
    }
    
    @Test 
    public void testProducte(){
        assertEquals(new Fraccion(9,20), instance.producto());
    }
    
    @Test
    public void testDivision(){
        assertEquals(new Fraccion(5,4), instance.division());
    }
    
}
