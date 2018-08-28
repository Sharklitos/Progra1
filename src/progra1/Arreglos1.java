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
        int arreglo3[] = new int[tam];
        int arreglo4[] = new int[tam];
        int arreglo5[] = new int[tam];
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
        for(int x = 0; x<tam; x++){
            for(int y = 0; y<tam1; y++){
                arreglo3[x] += arreglo1[x][y];
                
            }
        }
        for(int x = 0; x<tam; x++){
            for(int y = 0; y<tam1; y++){
                arreglo4[x] += arreglo2[x][y];
                
            }
        }
        for(int x = 0; x<tam;x++){
            System.out.println(arreglo3[x]);
        }
         for(int x = 0; x<tam;x++){
            System.out.println(arreglo4[x]);
        }
         
         for(int x=0; x<tam; x++){
             arreglo5[x] = arreglo3[x] * arreglo4[x];
             System.out.println(arreglo5[x]);
    }
        
           
        
    
    
}
}
