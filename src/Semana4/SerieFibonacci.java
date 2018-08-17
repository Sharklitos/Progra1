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
public class SerieFibonacci {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero entero y mayor que 1: ");
        int Num = leer.nextInt();
        int c  = 1;
        int v = 1;
        int z = 0;
        System.out.print(c + "\n" );
        for(z = 2; z <= Num; z++){
            System.out.println(v + "\n" );
            v = c + v;
            c = v - c;
                    
            
            
            
            
            
            
        }
        
    }
}
