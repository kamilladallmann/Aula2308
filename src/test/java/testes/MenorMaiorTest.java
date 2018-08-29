/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.MenorMaior;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamil
 */
public class MenorMaiorTest {
    
    @Test
    public void testeMenorValor(){
        double[] v = {8,7,5,2,3};
        MenorMaior m = new MenorMaior();
        double res = m.getMenor(v);
        assertEquals(2.0, res, 0.01);
    }
    
    @Test
    public void testeMaiorValor(){
        double[] v = {8,7,5,2,3};
        MenorMaior m = new MenorMaior();
        double res = m.getMaior(v);
        assertEquals(8, res, 0.01);
    }
    
    
}
