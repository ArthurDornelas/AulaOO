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
public class Shop {
    
    private Cachorro dog;
    private int num;

    public Shop(int n) {
        this.num = n;
    }
    
    public void venda(Cachorro dog){
         dog = null;
         num--;
    }
    
    public void compra(Cachorro dog){
       this.dog = dog;
        num++;
    }
    
    public void imprimiNum(){
        System.out.println("Nessa loja tem: " + num + " cachorros");
    }
    
    
}
