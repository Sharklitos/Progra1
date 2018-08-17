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
public class EjercicioDos {
    public static void main(String args[]){
        System.out.println("***C A L C U L A R   I S R***");
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre del empleado: ");
        String Nombre = leer.nextLine();
        System.out.println("Ingrese el sueldo: ");
        double sueldoIngresado=leer.nextDouble();
        double IRS= sueldoIngresado*0.15;
        
        if(sueldoIngresado >0 && sueldoIngresado <= 152557.15){
            System.out.println("El empleado "+ Nombre +" No tiene impuesto sobre venta");
            
            
        }else if(sueldoIngresado >152557.15 && sueldoIngresado <=232622.61){
                 
        System.out.println("El Empleado "+Nombre+ " tiene un impuesto sobre venta del 15% y es: "+ IRS);

        
        
                }else if(sueldoIngresado > 232622.6 && sueldoIngresado <=540982.82){
                    System.out.println("El Empleado "+Nombre+ " tiene un impuesto sobre venta del 20% y es: "+ IRS);
                    
                }else if(sueldoIngresado >540982.82){
                    
                    System.out.println("El Empleado "+Nombre+ " tiene un impuesto sobre venta del 25% y es: "+ IRS);
                    
                }
        
        
        
        
        
    }
    
    
    
    
}
