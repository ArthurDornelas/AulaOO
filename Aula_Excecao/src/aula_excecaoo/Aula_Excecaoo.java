/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_excecaoo;

/**
 *
 * @author ice
 */
public class Aula_Excecaoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Divisão: ");
        float res;
        res = Calculadora.divisao(5, 0);
        System.out.println("Resultado: "+res);        
        
        Calculadora.percorreVetor(0);
    }
    
}
