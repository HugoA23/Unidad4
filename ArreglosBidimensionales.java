/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensionales;

/**
 *
 * @author hugos
 */
public class ArreglosBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]numeros=new int[4][5];
        int numero = 1;
        //Guardando Informacion en Arreglo
        for (int i = 0; i < 4; i++) { //Control de Filas
            for (int j = 0; j < 5; j++) { //Control de Columnas
                numeros[i][j] = numero;
                numero++;
            }
            
        }
        //Leyendo Infromacion en Arreglo Unidimensional
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + " ");
               
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
