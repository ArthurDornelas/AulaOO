/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula31JogoBozo;

import Aula31JogoBozo.Dado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Jogador {
    
    private String nome;
    Tabuleiro tabuleiro = new Tabuleiro();
    private int numDados = 5;
    private int jogada;
    Dado []dados = new Dado[numDados];
    Scanner scan = new Scanner(System.in);
    

    public Jogador(String nome) {
        this.nome = nome;
        
    }
    
    public void lancaDados(){
        
        for(int i = 0 ; i<numDados ; i++){
            int n = dados[i].rolar();
            dados[i].exibirFace(n);
        }
    }
    
    public void escolheDado(int dado){
        
        int n = dados[dado-1].rolar();
        dados[dado-1].exibirFace(n);
        
    }
    
    public void escolhePosicao(){
        
        tabuleiro.exibeTabuleiro();
        System.out.println("Qual jogada voce quer fazer?");
        System.out.println("0-AS  1-DUQUE  2-TERNO  3-QUADRA  4-QUINA  5-SENA  6-FU  7-SEGUIDA  8-QUADRADA  9-GENERAL");        
        jogada = scan.nextInt();
        
    }

    public void calculaPontos(){
        tabuleiro.calcularPontuacao(jogada, dados);
    }

    
}