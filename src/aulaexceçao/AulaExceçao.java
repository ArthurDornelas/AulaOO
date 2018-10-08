/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaexceçao;

/**
 *
 * @author ice
 */
public class AulaExceçao {

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
