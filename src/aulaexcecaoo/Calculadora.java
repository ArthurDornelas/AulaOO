/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaexcecaoo;

/**
 *
 * @author ice
 */
public class Calculadora {
    int numero;
    
    public static float divisao(int a, int b){
        float x = 0;
        try{
            x = a/b;
        }catch(Exception e){
            System.out.println("Erro! " + e.getMessage());
        }
        return x;
    }
    
    public static void percorreVetor(int valor){
        
        int []array = new int[2];
        for (int i=0; i<=array.length; i++){
            try{


                array[i] += i+1;
                System.out.println("Dividindo...");
                int x = array[i]/0;
                System.out.println("oi");

                /*for(int i=0; i<array.length; i++){
                    x = array[i]/valor;
                    System.out.println(x);
                }*/
                System.out.println("");
            }catch(ArithmeticException e){
                System.err.println("Erro a "+e.toString());
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.err.println("Erro b "+e.toString());
            }
            catch(Exception e){
                System.err.println("Erro c "+e.toString());
            }
        }
    }
}