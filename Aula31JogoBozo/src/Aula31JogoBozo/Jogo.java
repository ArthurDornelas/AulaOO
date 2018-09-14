/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula31JogoBozo;

import Aula31JogoBozo.Jogador;
import java.util.ArrayList;
import java.util.Arrays;
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
    private int pontFinal = 0;
    
    public Jogo(int numJogadores) {
        this.numJogadores = numJogadores;
    }
    
    public void Jogadores(){
        
        System.out.println("Digite o nome dos Jogadores:");
        for(int i = 0 ; i<numJogadores ; i++)
        {
            jogadores.add ( new Jogador(scan.nextLine())); 
        }
        
    }
    
    
    public void iniciarJogo(){
        
        System.out.println("-------------------- JOGO BOZO ---------------------");
        
        for(int i=0; i<10 ; i++){
        
          for(Jogador jogador: jogadores)
          {
              System.out.println("Vez do jogador: " + jogador.getNome());
              int j=0;
              while(  j < 3 ){
                  
                  if(j==0) {
                        System.out.println("Os seus dados sao:");
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
        int i = 0;
        int iFinal = 0;
        for(Jogador jogador: jogadores){
            if(jogador.calculaPontoTotal() > pontFinal){
                pontFinal = jogador.calculaPontoTotal();
                iFinal++;
            }
        }
        
        for(Jogador jogador: jogadores){
            if( i == iFinal)
                System.out.println("O Jogador " + jogador.getNome() + " ganhou!");
            else
                i++;
        }
        
    }    
    
}