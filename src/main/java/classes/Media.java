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
    
    public int acimaMedia(double[] v){
        
        Media m = new Media();
        double res = m.getMedia(v);
        int maior = 0;
        
        for(int i = 0; i < v.length; i++){
            
            if (v[i] > res){
                maior++;
            }                    
        }
        
        return maior;        
    }
    
    public int abaixoMedia(double[] v){
        
        Media m = new Media();
        double res = m.getMedia(v);
        int menor = 0;
        
        for(int i = 0; i < v.length; i++){
            
            if (v[i] < res){
                menor++;
            }                    
        }
        
        return menor;        
    }
    
}
