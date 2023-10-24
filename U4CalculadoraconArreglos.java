
package u4calculadoraconarreglos;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class U4CalculadoraconArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion;
                
        //Declarar arreglo
        double[] elementos={20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3}; 
        
        do{
        System.out.println("Aqui hay 7 numeros:");
        System.out.println("20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3");

        System.out.println("Que quieres hacer?");
        System.out.println("1) Suma");
        System.out.println("2) Multiplicacion");
        System.out.println("3) Salir");
        
            System.out.print("Escoje el numero de opcion: ");
        opcion = sc.nextInt();
        
       
        switch(opcion){
            case 1:
                double suma = 20.5+ 40.6+ 78.4+ 94.7+ 55.3+ 22.6+ 84.3;
                System.out.println("La suma es: "+suma);
                break;
            case 2:
                double multip = 20.5* 40.6* 78.4* 94.7* 55.3* 22.6* 84.3;
                System.out.println("La multiplicacion es: "+multip);
                break;

            default:
                System.out.println("Adios.");
                break;
           
        }
         }while(opcion !=3);    
         
        // TODO code application logic here
    }
    
}
