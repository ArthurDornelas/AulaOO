/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

/**
 *
 * @author ice
 */
public class Jogador {
    
    private String nome;
    private int pontuacao;
    int dados[] = new int [5];

    public Jogador(String nome) {
        this.nome = nome;
    }
    
    public void marcaDados(int numSorteado , int numDado){
        dados[numDado] = numSorteado;
    }
    
    
    
}
