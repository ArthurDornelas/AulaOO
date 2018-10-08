/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula31JogoBozo;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class JogoBozo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de Jogadores:");
        int numJogadores = scan.nextInt(); 
        
        Jogo jogo = new Jogo(numJogadores);
        jogo.Jogadores();
        jogo.iniciarJogo();
        
    }
    
}
