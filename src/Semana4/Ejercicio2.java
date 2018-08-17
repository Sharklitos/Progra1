/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosSemana4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero para el ciclo fibonacci:");
        int repet=leer.nextInt();
        
        int y=1;
        int x=1;
        int fibonacci=0;
        int contador=0;
        
        
        
        do{
            
            contador++;
          
        fibonacci+=x;
        
          int res=fibonacci;
          
          x=res-x;
          
          
           
            System.out.println(fibonacci);
            
            
        }while(contador<repet);
        
        
        
        
    }
}
