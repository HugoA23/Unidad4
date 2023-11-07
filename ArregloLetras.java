/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloletras;

/**
 *
 * @author hugos
 */
public class ArregloLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [][] letras = new char [3][5];        
        char  letra1 = 'a';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                letras[i][j] = letra1;
                letra1++;
            }
        }
 
        for (int i = 0; i < 3; i++) {           
            for (int j = 0; j < 5; j++) {        
                System.out.print(letras[i][j]+" , ");
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
