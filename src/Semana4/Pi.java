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
public class Pi {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de terminos: ");
        int  Num = leer.nextInt();
        double z = 0;
        
        for(double x = 0; x<=Num-1; x++){
            z = ((4/((4*x)+1))) + x;
            z = ((4/((4*x)+3))) - x;
            System.out.println("Numero" + (x+1)+ "pi = " + z);
        }
    }
    
}
