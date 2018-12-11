/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_24_09_2018;
import java.util.ArrayList;
/**
 *
 * @author ice
 */
public class Aula_24_09_2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList();
        animais.add(new Cachorro());
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        gato1.setNome("Gatinho");
        gato2.setNome("Gatinho");
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        for(int i=0; i<animais.size(); i++){
            animais.get(i).emitirSom();
        }
        System.out.println(gato1.equals(gato2));
    }
    
}
