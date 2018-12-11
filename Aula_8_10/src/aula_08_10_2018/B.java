/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_08_10_2018;

import java.io.FileNotFoundException;

/**
 *
 * @author ice
 */
public class B {
    
    
    public static void m2() throws FileNotFoundException{
        m3();
        
    }
    
    public static void m3() throws FileNotFoundException, ChegarAtrasadoException{
        C.m4();
        AulaOO aulaOO = new AulaOO();
        aulaOO.chegarAula(20);
    }

    public static void chegarAtrasado(){
        
    }
}
