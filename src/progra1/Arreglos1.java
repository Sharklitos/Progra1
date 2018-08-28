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
        System.out.println("Ingrese un tamano para las filas de los arreglos: ");
        int tam = leer.nextInt();
        System.out.println("Ingrese un tamano para las columnas de los arreglos");
        int tam1 = leer.nextInt();
        int arreglo1[][] = new int[tam][tam1];
        int arreglo2[][] = new int[tam][tam1];
        int arreglo3[][] = new int[tam][tam1];
        for(int f = 0; f<tam; f++){
            for(int c = 0; c<tam1; c++){
                System.out.println("Ingrese un valor para el primer arreglo: ");
                arreglo1[f][c] = leer.nextInt();
                
            }
        }
        for(int f = 0; f<tam; f++){
            for(int c = 0; c<tam1; c++){
                System.out.println("Ingrese un valor para el segundo arreglo: ");
                arreglo2[f][c] = leer.nextInt();
            }
        }
        System.out.println("imprimiendo tabla 1: ");
        for(int x = 0; x<tam; x++){
            for(int y = 0; y<tam1; y++){
              
                System.out.print(arreglo1[x][y]);
                
            }
            System.out.println("");
        }
        System.out.println("imprimiendo tabla 2: ");
         for(int x = 0; x<tam; x++){
            for(int y = 0; y<tam1; y++){
              
                System.out.print("|" + arreglo2[x][y]);
                System.out.print(" | ");
                
            }
            System.out.println("");
        }
         System.out.println("Imprimiendo suma: ");
              for(int x = 0; x<tam; x++){
                  for(int y = 0; y<tam1;y++){
                      arreglo3[x][y] = arreglo1[x][y] + arreglo2[x][y];
                      System.out.print(arreglo3[x][y]);
                  }
                  System.out.println("");
              }
    
}
}
