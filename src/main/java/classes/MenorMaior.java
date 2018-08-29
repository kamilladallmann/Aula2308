/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author kamil
 */
public class MenorMaior {
    
    public double getMenor(double[] v){
        
        double menor = v[0];
        
        for (int i = 0; i < v.length; i++){
            if(v[i] <= menor)
                menor = v[i];            
        }
        
        return menor;
    }
    
    public double getMaior(double[] v){
        
        double maior = v[0];
        
        for (int i = 0; i < v.length; i++){
            if(v[i] >= maior)
                maior = v[i];
        }
        
        return maior;
    }
    
}
