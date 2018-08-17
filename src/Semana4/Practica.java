/*
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
public class Practica {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = leer.next();
        String revez   = palabra;
        int L = palabra.length();
        int z = L;
         for(int x = 0;  x < L; x++){
             char guebo = palabra.charAt(z-1);
             z--;
             
             System.out.println(guebo + guebo);
         }
         }
            
    
}
