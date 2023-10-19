/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4declaracionarray;

import java.util.Arrays;

/**
 *
 * @author labcca
 */
public class U4DeclaracionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] vocales =new char[5];
        System.out.println("vocales");
        
        vocales[0]= 'a';
        vocales[1]= 'e';
        vocales[2]= 'i';
        vocales[3]= 'o';
        vocales[4]= 'u';
        
        System.out.println(Arrays.toString(vocales));
        System.out.println("***********************");
        
        double[] precios =new double[10];
        System.out.println("precios");
        
        precios[0]= 12.3;
        precios[1]= 14.5;
        precios[2]= 20.6;
        precios[3]= 20.6;
        precios[4]= 20.6;
        precios[5]= 20.6;
        precios[6]= 20.6;
        precios[7]= 20.6;
        precios[8]= 20.6;
        precios[9]= 20.6;
        
        System.out.println(Arrays.toString(precios));
        System.out.println("**********************");
        String[] favoritos=new String[11];
        System.out.println("Favoritos");
        
        favoritos[0]= "nadar";
        favoritos[1]= "caminar";
        favoritos[2]= "dormir";
        favoritos[3]= "correr";
        favoritos[4]= "cocinar";
        favoritos[5]= "Batman";
        favoritos[6]= "Spider-Man";
        favoritos[7]= "Leer";
        favoritos[8]= "Videojuegos";
        favoritos[9]= "RE8";
        favoritos[10]= "GoW";
        
        System.out.println(Arrays.toString(favoritos));
        // TODO code application logic here
    }
    
}
