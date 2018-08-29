/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in ditor.
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Mediana {
    
    public double getMediana(double[] v){
        
        
        
        if (v.length % 2 != 0){
            int num = v.length;
            int x = num / 2;
            double mid = v[x];
          
           return mid; 
           
        }
        
        if (v.length % 2 == 0){
            int num = v.length; 
            int x = num / 2;
            double parte1 = v[x-1];
            double parte2 = v[x];
            
            double mid = (parte1 + parte2)/2;
                   
           return mid;
        }
        
        return 0;
        
        
    }
    
}
