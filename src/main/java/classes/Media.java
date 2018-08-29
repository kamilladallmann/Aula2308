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
public class Media {
    
    public double getMedia(double[] v){
        
        double soma = 0;
        int qtd = v.length;
        
        for (int i = 0; i < v.length; i++){
            soma = soma + v[i];
        }
        
        double med = soma / qtd; 
        
        return med;        
    }
    
}
