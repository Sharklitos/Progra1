/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1;
import java.util.Scanner;
/**
 *
 * @author Sharklitos
 */
public class EjercicioEnClase2 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int salir = 0;
        
        do{
            System.out.println("1.Alreves");
            System.out.println("2.Cuadrado Perfecto");
            System.out.println("3.Salir");
            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();
            salir = salir + 1;
            
            
                    
                    
        switch(opcion){
            case 1:   
        System.out.println("Ingrese una palabra: ");
        
        String palabra = leer.next();
        String alreves = ""+palabra;
        for(int )
            case 2:
           System.out.print("Ingrese un numero: ");
           int numero = leer.nextInt();
           int multi = 0, cont = 1;
           while(multi < numero){
               multi = cont * cont;
               cont++;
                       
           }
           
           
                
            case 3:
                System.out.println("Se escogieron" + salir + "opciones");       
                
    }
}while(opcion != 3);
        }
}
    
