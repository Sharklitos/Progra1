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
public class Arreglos1 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamano para los arreglos: ");
        int tam = leer.nextInt();
        int arreglo1[][] = new int[tam][2];
        int arreglo2[][] = new int[tam][2];
        int arreglo3[] = new int[tam];
        int arreglo4[] = new int[tam];
        int arreglo5[] = new int[tam];
        for(int x = 0; x<tam; x++){
            for(int y = 0; x<2; x++){
                System.out.println("Ingrese un valor para el primer arreglo: ");
                arreglo1[x][y] = leer.nextInt();
            }
        }
        for(int x = 0; x<tam; x++){
            for(int y = 0; x<2; x++){
                System.out.println("Ingrese un valor para el segundo arreglo: ");
                arreglo2[x][y] = leer.nextInt();
            }
        }
        for(int x = 0; x<tam; x++){
            
        
    }
        
           
        
    
    
}
