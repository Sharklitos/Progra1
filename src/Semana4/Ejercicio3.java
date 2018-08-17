

package EjerciciosSemana4;

import java.util.Scanner;


public class Ejercicio3 {
    
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero para estimar el valor de pi: ");
        int rep=leer.nextInt();
        double pi=0;
      
        for(double i=1 ; i<=rep ; i++){
            
            if(i % 2 == 0)
            pi= pi -(4/((i*2)-1));
                    else
                pi= pi +(4/((i*2)-1));
            
        
          
            
        }
            System.out.println("El valor estimado de pi seria: "+pi);
            
            
       
        
        
        
        
        
    }
    
}
