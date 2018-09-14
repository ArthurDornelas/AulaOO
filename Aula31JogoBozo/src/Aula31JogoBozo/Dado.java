/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula31JogoBozo;

import java.util.Random;

/**
 *
 * @author ice
 */
public class Dado {
    
    private int numFaces = 6;
    private int faces[] = {1,2,3,4,5,6};
    private int faceAtual;
    
    public int rolar(){
        
        Random rand = new Random();
        faceAtual = rand.nextInt(numFaces) + 1;
        return faceAtual;
        
    }
    
    public void exibirFace(int n){
        System.out.println(n + "  ");
    }
    
    public int getFace(){
        return faceAtual;
    }
    
}
