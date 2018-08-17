   
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;
import java.util.Scanner;
/**
 *
 * @author Sharklitos
 */
public class Palindromo {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = "";
        String palabra1 = "";
        palabra = leer.next();
        
        int length = palabra.length();
        char C = palabra.charAt(length-1);
        for(int i = 0; i < length; length--){
            palabra1 = palabra1 + palabra.charAt(length-1);
            
        }
        if(palabra.equals(palabra1)){
            System.out.println("La palabra es PALINDROMA");
        }else if(palabra != palabra1){
            System.out.println("Esta palabra no es PALINDROMA");
        }
            
    }
}
