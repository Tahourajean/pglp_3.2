package uvsq.fr;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EmployeTest 
{
    @Test
    public void calculSalaire() {
        Employe emp =new Employe();
        int nb_anciennete=2;
        double expResult = 1540.0;
        double result = emp.calculSalaire(nb_anciennete);
        assertEquals(expResult, result, 1540.0);
        
    }
}
