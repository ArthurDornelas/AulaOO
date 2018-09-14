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
    private int jogada;
    //Dado []dados = new Dado[5];
    private ArrayList <Dado> dados = new ArrayList();
    Scanner scan = new Scanner(System.in);
    

    public Jogador(String nome) {
        this.nome = nome;
        for(int i = 0 ; i<5 ; i++)
        {
            dados.add(new Dado()); 
        }
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void lancaDados(){
        
        for(Dado dado : dados){
            dado.rolar();
            dado.exibirFace();
        }
    }
    
    public void escolheDado(int dadoMudar){
        
        int i = 0;
        for(Dado dado : dados){
            if(i == dadoMudar){
               dado.rolar();
                System.out.println("Sua Face Nova e:");
               dado.exibirFace();
            }
             i++;
        }    
        
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
    
    public int calculaPontoTotal(){
        return tabuleiro.calculaPontoPorJogador();
    }
    
}