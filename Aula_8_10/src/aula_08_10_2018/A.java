/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_08_10_2018;

/**
 *
 * @author ice
 */
public class A {
    
    public static void m1(){
        try{
            B.m2();
        }catch(Exception e){
            System.out.println("Erro");
        }
        
    }

    
}
