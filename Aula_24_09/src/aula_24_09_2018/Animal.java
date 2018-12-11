/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_24_09_2018;

/**
 *
 * @author ice
 */
public abstract class Animal {
    String nome;
    int idade;
    
    
    
    public abstract void emitirSom();
    
    public void setNome(String nome1){
        this.nome = nome1;
    }
    
    public String toString(){
        return this.nome;
    }
    
    public boolean equals(Animal a){
        return this.nome.equals(a.nome);
    }
}
