/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula31JogoBozo;

import Aula31JogoBozo.Jogador;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Jogo {
    
    private int numJogadores;
    Jogador jogadores[] = new Jogador[numJogadores];
    int ordemJogadas[] = new int [numJogadores];
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    
    public Jogo(int numJogadores) {
        this.numJogadores = numJogadores;
    }
    
    public void Jogadores(){
        
        for(int i=0 ; i < jogadores.length ; i++)
        {
            jogadores[i] = new Jogador(scan.nextLine());
        }
    }
    
    public void ordemJogadas(){
        
        for(int i=0 ; i < ordemJogadas.length ; i++)
        {
            Random rand = new Random();
            int n = rand.nextInt(numJogadores-1) + 0;
            
            ordemJogadas[i] = n;
        }
        
    }
     
    
    
    
    
    public void iniciarJogo(){
        
        for(int i=0 ; i < ordemJogadas.length ; i++)
        {
            int n = rand.nextInt(6) + 1;
            jogadores[ordemJogadas[i]];
            
        }    
        
    }    
    
    
    
}