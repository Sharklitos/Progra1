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
public class EjercicioEnClase {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String alumno = leer.next();
        System.out.print("Ingrese el promedio del alumno: ");
        double promedio = leer.nextDouble();
        double descuento = 0;
        double paga = 0;
        if(promedio >= 90 && promedio <= 100){
            paga = 5500 - (5500 * 0.2);
            System.out.println("El alumno: " + alumno);
            System.out.println("Tiene un promedio de: " + promedio);
            System.out.println("Se le aplicara un decuento del 20%");
            System.out.println("El pago total de su colegiatura es:" + paga);
        }else if(promedio >= 80 && promedio < 90){
                  paga = 5500 - (5500 * 0.1);
            System.out.println("El alumno: " + alumno);
            System.out.println("Tiene un promedio de: " + promedio);
            System.out.println("Se le aplicara un decuento del 10%");
            System.out.println("El pago total de su colegiatura es:" + paga);
        }else if(promedio >= 70 && promedio < 80){
                  paga = 5500 - (5500 * 0.05);
            System.out.println("El alumno: " + alumno);
            System.out.println("Tiene un promedio de: " + promedio);
            System.out.println("Se le aplicara un decuento del 5%");
            System.out.println("El pago total de su colegiatura es:" + paga);
        }else if(promedio < 70){
              paga = 5500;
            System.out.println("El alumno: " + alumno);
            System.out.println("Tiene un promedio de: " + promedio);
            System.out.println("No tiene descuento");
            System.out.println("El pago total de su colegiatura es:" + paga);
        }else if(promedio > 100 || promedio < 0){
            System.out.println("Sera pendejo usted, adonde putas a visto un promedio que supere el 100 o vaya mas abajo de el, por eso es un promedo no joda, mejor vayase a repetir primaria semejante cabeza de pija, FUCK!");
            
        }
    }
}
