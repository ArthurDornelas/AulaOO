/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula31jogobozo;

import java.util.Random;

/**
 *
 * @author ice
 */
public class Dado {
    
    private int numFaces = 6;
    private int faces[] = {1,2,3,4,5,6};
    private int dados[] = new int [5];
    
    public int rolar(){
        Random rand = new Random();
        int n = rand.nextInt(numFaces) + 1;
        
        
    }
    
    public int calcularPontuacao(int face, int numRepeticoes){
        
        
      return n;
    }
    
}
