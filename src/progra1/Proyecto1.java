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
public class Proyecto1 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        double EfectivoGuardado = 0;
        double AzucarVenta = 30;
        double AvenaVenta = 25;
        double TrigoVenta = 32;
        double MaizVenta = 20;
        
        double AzucarCompra = 25;
        double AvenaCompraB = 20;
        double AvenaCompraC = 22;
        double TrigoCompra = 32;
        double MaizCompra = 18;
                
        do{
         System.out.println("Caja Registradora");
         System.out.println("1. Abrir Caja");
         System.out.println("2. Ventas");   
         System.out.println("3. Compras");
         System.out.println("4. Reportes");
         System.out.println("5. Cierre De Caja");
         System.out.println("6. Salir del sistema");
         
         System.out.print("Elija una opcion: ");
         opcion = leer.nextInt();
         
         switch(opcion){
             case 1:
                 System.out.println("Ingrese el efectivo que desea guardar: ");
                 EfectivoGuardado = leer.nextDouble();
             break;
             
             case 2:
                System.out.println("Ingrese el tipo de cliente: ");
                String TipoCliente = leer.next();
                int ProductoComprado = 0;
                int QuiereSalir = 0;
                int Kilo = 0;
                if(TipoCliente.equals("A")){
                    do{
                        System.out.println("1. Azucar" + AzucarVenta + "lps." );
                        System.out.println("2. Avena" + AvenaVenta + "lps.");
                        System.out.println("3. Trigo" + TrigoCompra + "lps.");
                        System.out.println("4. Maiz" + MaizCompra + "lps.");
                        System.out.println("5. Volver al menu principal");
                        ProductoComprado = leer.nextInt();
                        if(ProductoComprado == 5){
                            break;
                        } switch(ProductoComprado){
                            case 1:
                                System.out.println("Cuantos kilogramos de este producto desea UTEH");
                        Kilo = leer.nextInt();
                        
                        System.out.println("Quere comprar otro producto");
                        System.out.println("1 = Si");
                        System.out.println("2 = No");
                        QuiereSalir = leer.nextInt();
                                
                        }
                        
                        
                    }while(QuiereSalir != 2);
                }
                   
         }
        }while(opcion != 6);
    }
}
