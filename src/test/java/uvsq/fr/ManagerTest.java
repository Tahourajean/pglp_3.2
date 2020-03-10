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
        Manager manager =new Manager();
        int nbPers=2;
        double expResult = 1540.0;
        double result = Manager.calculSalaire(nbPers);
        assertEquals(expResult, result, 1700.0);
        
    }
}

