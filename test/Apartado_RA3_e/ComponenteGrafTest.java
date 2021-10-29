package Apartado_RA3_e;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComponenteGrafTest {
    /**
     * Test of supCircunferencia method, of class ComponenteGraf.
     */
    @Test
    public void testSupCircunferencia() {
        System.out.println("supCircunferencia");
        double r = 0;
        ComponenteGraf instance = new ComponenteGraf();
        double expResult = 0.0;
        double result = instance.supCircunferencia(r);
        assertEquals(expResult, result, 0.1);
    }
}

