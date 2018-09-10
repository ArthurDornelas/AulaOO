/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula31JogoBozo;

/**
 *
 * @author ice
 */
public class Tabuleiro {
    
    private int pontPosicao [] = {1 , 2 , 3 , 4 , 5 , 6 , 20 , 30 , 40 , 50};
    private int tabuleiro[] = new int[10];
    
    
    public Tabuleiro() {
        
        for(int i=0 ; i< tabuleiro.length ; i++){
            tabuleiro[i]= -1;
        }
        
    }
    
    public void exibeTabuleiro(){
        
        
        System.out.println(tabuleiro[0] + "  |  " + tabuleiro[3] + "  |  " + tabuleiro[6]);
        System.out.println(" __  __  __ " );
        System.out.println(tabuleiro[1] + "  |  " + tabuleiro[4] + "  |  " + tabuleiro[7]);
        System.out.println(" __  __  __ " );
        System.out.println( "  |  " + tabuleiro[8] + "  |  ");
    }
    
    
    
    public void calcularPontuacao(int posicao, Dado []dados){
        
        
        
        
        
        
    }
    
}
