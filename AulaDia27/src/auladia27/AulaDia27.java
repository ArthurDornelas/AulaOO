/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia27;

/**
 *
 * @author ice
 */
public class AulaDia27 {

    
    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro ("Safira", 1 , "HuskySiberiano");
        Cachorro c2 = new Cachorro("DanielPastel" , 45 , "CachorroJavali");
        
        Shop loja1 = new Shop(0);
        loja1.compra(c1);
        loja1.compra(c2);
        
        loja1.imprimiNum();
        loja1.venda(c1);
        loja1.imprimiNum();
        
        
    }
    
}
