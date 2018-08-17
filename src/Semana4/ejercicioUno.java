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
public class ejercicioUno {
    
    public static void main(String args[]){
        
        Scanner leer = new Scanner(System.in);
        
        // variables contadoras para el ciclo
        int x=0;
    
        int pares= 0;
        
       int multiplo3=0;
       
       int primos= 0;
        
       // inicio del ciclo con maximo de 20 repeticiones
       
        while(x<1 ){
            
            //Salida de pantalla para ingresar numeros
            
            System.out.println("Ingresar un numero: " );
            
        int numeroIngresado= leer.nextInt();
        
               int residuo= numeroIngresado%2;
                           
               int multiplo =numeroIngresado%3;
               
                int divisionPrimo= multiplo+residuo ; 
                
            x++;
            
            if(residuo== 0){
                
                pares++;
                
            }if(multiplo == 0){
                
                multiplo3++;
                
                
                
            }if(residuo == 1 && multiplo ==2 || residuo == 2 && multiplo ==1 || residuo ==1 && multiplo==1){
                
                primos++;
                
            }
            
            if(numeroIngresado == 2){
                
                primos++;
                
            }else if(numeroIngresado == 3){
                
                primos++;
                
            }else if(numeroIngresado == 1){
                
                --primos;
                
            }
            
            
            
            
        }
        System.out.println("numeros pares: " + pares);
        System.out.println("numeros multiplos de tres: " + multiplo3);
        System.out.println("numeros primos: "+ primos);
        
        
        
    }
    
}
