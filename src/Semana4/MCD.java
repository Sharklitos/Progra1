/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;
import java.util.Scanner;
/**
 
 * @author Sharklitos
 */
public class MCD {
    public static void main(String args[]){
        System.out.println("*** P R O G R A M A  C A L C U L O  MCD ***");
        System.out.println("Calcula el Maximo comun divisor de 2 numeros");
        
        Scanner leer = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("Ingrese numero 1: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        numero2 = leer.nextInt();
        
        int dividendo = Math.max(numero1, numero2);
        int divisor = Math.min(numero1, numero2);
        
        int residuo = 0;
        
        do{
            residuo = dividendo % divisor;
            dividendo = divisor;
            divisor = residuo;
            
            
        }while(residuo != 0);
        System.out.printf("El maximo comun divisor de %d y %d es %d \n", numero1,numero2,dividendo);
        
    }
}
