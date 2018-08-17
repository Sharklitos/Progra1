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
public class EjemploWhile {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
        double Numero = 0;
        int Contador = 0;
        double Promedio = 0;
        double Pi = 0;
        double suma = 0;
        int ContarPar = 0;
        while(true){
            System.out.println("\n\n Ingrese un numero: ");
            Numero = leer.nextDouble();
             if(Numero < 0){
                break;
            }
             
          
            Contador = Contador + 1;  
           
            suma+=Numero;
           
            Promedio = suma/Contador; 
            
            if(Numero%2 == 0){
                ContarPar++;
                
            }
           
            
        }
        System.out.println("Se han ingresado " + Contador + " valores");
        System.out.println("El promedio de los numeros ingresados es: " + Promedio);
        System.out.println("Se han igresado " + ContarPar + " numeros paraes");
        System.out.println("La suma de todos los valores es: " + suma);
    }
}
