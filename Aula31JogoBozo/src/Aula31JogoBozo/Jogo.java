/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula31JogoBozo;

import Aula31JogoBozo.Jogador;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Jogo {
    
    private int numJogadores;
    private ArrayList <Jogador> jogadores = new ArrayList();
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    
    public Jogo(int numJogadores) {
        this.numJogadores = numJogadores;
    }
    
    public void Jogadores(){
        
        for(int i = 0 ; i<numJogadores ; i++)
        {
            jogadores.add ( new Jogador(scan.nextLine())); 
        }
        
    }
    
    
    public void iniciarJogo(){
        
        for(int i=0; i<10 ; i++){
        
          for(Jogador jogador: jogadores)
          {
              int j=0;
              while(  j < 3 ){
                  
                  if(j==0) {
                        jogador.lancaDados();
                        j++;
                        jogador.escolhePosicao();
                  }  
                 
                  System.out.println("Quantos dados e qual voce quer jogar novamente?");
                  int numDados = scan.nextInt();
                  
                  if(numDados != 0){
                     
                     for(int k = 0 ; k<numDados ; k++){ 
                        
                        int trocaDado = scan.nextInt();
                        jogador.escolheDado(trocaDado);
                     
                     } 
                    j++;    
                  }
                  else 
                      j = 3;
             }
             jogador.calculaPontos();
              
              
              
              
             
          }    
        
        }
        
        
    }    
    
    
    
}