/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.Media;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamil
 */
public class MediaTest {
    
   @Test
    public void testeMedia(){
        double[] v = {1,2,3,4,5,6};
        Media m = new Media();
        double res = m.getMedia(v);
        assertEquals(3.5, res, 0.01);
    }

    
}
