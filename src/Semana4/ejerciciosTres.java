/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSemana3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ejerciciosTres {
     public static void main(String args[]){
         System.out.println("***Programa para sacar factoriales***");
         Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese un numero: ");
         int numeroIngresado = leer.nextInt();
         int factorial =1;
         int numeroIngresadoG= numeroIngresado;
         if(numeroIngresado ==0){
             System.out.println("No hay factorial de 0");
             
         }else{while(numeroIngresado >=1){
               
               factorial= numeroIngresado*factorial;
               numeroIngresado--;
               
               
           }
         System.out.println("El factorial de " + numeroIngresadoG+ " es: " + factorial);
         }
         
         
         
         
         
         
         
             
         
         
         
         
     }
    
    
    
}
