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
public class TablaPitagorica {
    public static void main(String[]args){
        System.out.print("Ingrese hasta donde desea que llegue la tabla: ");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int n2 = 0;
       
        
        for(int inicio = 1; inicio <= n; inicio++){
            n2++;
            System.out.println("\n");
            for(int inicio2 = 1; inicio2 <=n; inicio2++){
                int M = inicio2 * n2;
                System.out.print(M);
                System.out.print(" ");
            }
            
        }
    }
}
