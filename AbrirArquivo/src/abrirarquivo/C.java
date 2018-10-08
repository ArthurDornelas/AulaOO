/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarquivo;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
/**
 *
 * @author ice
 */
public class C {
    
    public void m4() throws FileNotFoundException
    {
    File arq = new File("AlgumTexto.txt");
    FileInputStream fi = new FileInputStream(arq);
    }

}
