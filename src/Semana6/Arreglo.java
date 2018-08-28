/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;
import java.util.Scanner;
/**
 *
 * @author Sharklitos
 */
public class Arreglo {
    public static void main(String[]args){
        System.out.println("Ingrese el tamano de los arreglos: ");
        Scanner lea = new Scanner(System.in);
        int cantidad = lea.nextInt();
        int cadena[] = new int[cantidad];
        
        
     
        System.out.println("Posiciones para el arreglo 1: ");
            for(int y=0;y<cadena.length; y++){
                System.out.println("Ingrese una cantidad para la posicion " + y);
                cadena[y]=lea.nextInt();
            }
   
            
        System.out.println("Posiciones para el arreglo 2: ");
        
        int cadena2[] = new int[cantidad];
         for(int x=0;x<cadena2.length; x++){
                System.out.println("Ingrese una cantidad para la posicion " + x);
                cadena2[x]=lea.nextInt();
            }
         System.out.println("Los valores del primer arreglo que no estan en el segundo son: ");
           for(int x = 0; x < cadena.length; x++){
                int z = 0;
               for(int y = 0; y < cadena.length; y++){
                   
                   if(cadena[x] != cadena2[y]){
                   
                   z++;
                   
                   
               }
                   
                  
                
                
           }
              if(z == cadena.length){
                  System.out.println(cadena[x]);
              }
                   
        }
           
           
     
        
}
}
    

