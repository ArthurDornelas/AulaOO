/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_08_10_2018;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 *
 * @author ice
 */
public class C {
    
    
    public static void m4() throws FileNotFoundException{
        File arq = new File("Qualquer Coisa.txt");
        FileInputStream fi = new FileInputStream(arq);
    }
    
    
}
