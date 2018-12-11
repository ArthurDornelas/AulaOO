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
public class Gato extends Animal{
    
    public Gato(){
        this.nome = "Gatinho";
        this.idade = 5;
    }
    
    public void emitirSom(){
        System.out.println("Miau!");
    }
    
    
}
