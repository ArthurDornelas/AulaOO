/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aula31JogoBozo;

import java.util.Arrays;
/**
 *
 * @author ice
 */
public class Tabuleiro {
    
    private int pontPosicao [] = {1 , 2 , 3 , 4 , 5 , 6 , 20 , 30 , 40 , 50};
    private int tabuleiro[] = new int[10];
    private int pontoTotal = 0;
    
    public Tabuleiro() {
        
        for(int i=0 ; i< tabuleiro.length ; i++){
            tabuleiro[i]= 0;
        }
        
    }
    
    public void exibeTabuleiro(){
        
        
        System.out.println(tabuleiro[0] + "  |  " + tabuleiro[3] + "  |  " + tabuleiro[6]);
        System.out.println(" __  __  __ " );
        System.out.println(tabuleiro[1] + "  |  " + tabuleiro[4] + "  |  " + tabuleiro[7]);
        System.out.println(" __  __  __ " );
        System.out.println(tabuleiro[2] + "  |  " + tabuleiro[5] + "  |  " + tabuleiro[8]);
        System.out.println(" __  __  __ " );
        System.out.println( "  |  " + tabuleiro[9] + "  |  ");
    }
    
    
    
    public void calcularPontuacao(int posicao, Dado[] dados){
        
        if(posicao == 0 && tabuleiro[0]==0){
           int n=0;
            for(int i=0 ; i < dados.length ; i++){
               if(dados[i].getFace() == 1){
                   tabuleiro[posicao] += pontPosicao[posicao];
                   n++;
               }    
            }
            if (n>0)
                exibeTabuleiro();
            else
                System.out.println("Voce nao pontuou!");
                  
        }
        
        else if(posicao == 1 && tabuleiro[1]==0){
            int n=0;
            for(int i=0 ; i < dados.length ; i++){
               if(dados[i].getFace() == 2){
                   tabuleiro[posicao] += pontPosicao[posicao];
                   n++;
               }    
            }
            if (n>0)
                exibeTabuleiro();
            else
                System.out.println("Voce nao pontuou!");
                  
        }
        
        else if(posicao == 2 && tabuleiro[2]==0){
           int n=0;
            for(int i=0 ; i < dados.length ; i++){
               if(dados[i].getFace() == 3){
                   tabuleiro[posicao] += pontPosicao[posicao];
                   n++;
               }    
            }
            if (n>0)
                exibeTabuleiro();
            else
                System.out.println("Voce nao pontuou!");
                  
        }
        
        else if(posicao == 3 && tabuleiro[3]==0){
            int n=0;
            for(int i=0 ; i < dados.length ; i++){
               if(dados[i].getFace() == 4){
                   tabuleiro[posicao] += pontPosicao[posicao];
                   n++;
               }    
            }
            if (n>0)
                exibeTabuleiro();
            else
                System.out.println("Voce nao pontuou!");
                  
        }
        
        else if(posicao == 4 && tabuleiro[4]==0){
            int n=0;
            for(int i=0 ; i < dados.length ; i++){
               if(dados[i].getFace() == 5){
                   tabuleiro[posicao] += pontPosicao[posicao];
                   n++;
               }    
            }
            if (n>0)
                exibeTabuleiro();
            else
                System.out.println("Voce nao pontuou!");
                  
        }
        
        else if(posicao == 5 && tabuleiro[5]==0){
            int n=0;
            for(int i=0 ; i < dados.length ; i++){
               if(dados[i].getFace() == 6){
                   tabuleiro[posicao] += pontPosicao[posicao];
                   n++;
               }    
            }
            if (n>0)
                exibeTabuleiro();
            else
                System.out.println("Voce nao pontuou!");
                  
        }
        
        else if(posicao == 6 && tabuleiro[6]==0){
            int primNum = 0, segNum = 0, j=0, numDoPrim = 0, numDoSeg = 0;
            for(int i=0 ; i < dados.length ; i++){
               if(i==0){
                 primNum = dados[i].getFace();
                 numDoPrim++;
               }  
               else if(dados[i].getFace() != primNum && j==0){
                 segNum = dados[i].getFace();
                 numDoSeg++;
                 j++;
               }
               else if(dados[i].getFace() == primNum)
                   numDoPrim++;
               else if(dados[i].getFace() == segNum)
                   numDoSeg++;
            }
            if((numDoPrim == 2 && numDoSeg == 3) || (numDoPrim == 3 && numDoSeg == 2) ){
                tabuleiro[posicao] += pontPosicao[posicao];
                exibeTabuleiro();
            }
            else
                System.out.println("Voce nao pontuou!");
            
        }
        
        
        else if(posicao == 7 && tabuleiro[7]==0){
            int n = 0; 
            int ordem[] = new int[5];
            for(int i=0 ; i < dados.length ; i++){
                ordem[i]=dados[i].getFace();
                for(int j=0 ; j<dados.length; j++){
                    if(i!=j && dados[i].getFace() == dados[j].getFace())
                        n++;
               }
               
            Arrays.sort(ordem);
               
            }
            if(n == 0){
                if(ordem[0]==2){
                   tabuleiro[posicao] += pontPosicao[posicao];
                   exibeTabuleiro();
                }
                else if(ordem[0]==1){
                    int k=0;
                    for(int i=1 ; i<ordem.length ; i++){
                        if(ordem[i] != i++)
                            k++;
                    }
                    if(k==0){
                        tabuleiro[posicao] += pontPosicao[posicao];
                        exibeTabuleiro();
                    }
                    else
                        System.out.println("Voce nao pontuou!");
                }    
                else
                    System.out.println("Voce nao pontuou!");
            }    
            else
                System.out.println("Voce nao pontuou!");
             
        }
        
        
        else if(posicao == 8 && tabuleiro[8]==0){
            int n = 0 , primNum = dados[0].getFace(); 
            for(int i=1 ; i < dados.length ; i++){
                if(dados[i].getFace() == primNum ){
                   n++;
                }    
            }
            if(n == 4)
                tabuleiro[posicao] += pontPosicao[posicao];
            else
                System.out.println("Voce nao pontuou!");
        }
        
        
        else if(posicao == 9 && tabuleiro[9]==0){
            int n = 0 , primNum = dados[0].getFace(); 
            for(int i=1 ; i < dados.length ; i++){
                if(dados[i].getFace() == primNum ){
                   n++;
                }    
            }
            if(n == 5)
                tabuleiro[posicao] += pontPosicao[posicao];
            else
                System.out.println("Voce nao pontuou!");
        }
        
        
    }

    public int calculaPontoPorJogador() {
        for(int i = 0 ; i<tabuleiro.length ; i++){
            pontoTotal += tabuleiro[i];
        }
        return pontoTotal;
    }

 
}
