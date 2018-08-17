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
public class Ejercicio1 {
    public static void main(String [] args){
       Scanner leer=new Scanner(System.in); 
        
        System.out.println("Ingrese un numero: ");
        int n=leer.nextInt();
        int multi=0;
        int multi2=0;
        
        for(int inicio=1;inicio<=n;inicio++){
            
            
            for(int inicio2=1;inicio2<=n;inicio2++){
                
                multi=inicio2*inicio;
                System.out.print(multi);
                System.out.print("\t");
                
            }
            
            
            
            System.out.print("\n");
            
            
        }
    
        
        
        
    }
    
    
}
