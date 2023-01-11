/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;
import java.util.Arrays;
/**
 *
 * @author Dai
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = (int) 0.5;
        // TODO code application logic here
        int [] arregloA = new int [50];
        int [] arregloB = new int [20];
        
    llenarA(arregloA);
    mostrarA(arregloA);
    ordenarA(arregloA);
    mostrarA(arregloA);
    llenarB(arregloA, arregloB);
    mostrarB(arregloB);
    }
    
    
    public static void llenarA (int[] array){
        for (int i = 0; i < 50; i++) {
            array [i] = (int)(Math.random()*10);
            
        }
    }
    
    public static void mostrarA (int [] array) {
        System.out.println("el arreglo A sera:");
        for (int i = 0; i < 50; i++) {
            System.out.print(array [i]+ ", ");
        }
        System.out.println("");
    }
    
    public static void ordenarA (int [] array) {
        Arrays.sort(array);
        
    }
    
    public static void llenarB (int [] array, int [] array2) {
        
        for (int i = 0; i < 10; i++) {
            array2[i]=array [i];          
        }
    Arrays.fill(array2, 10, 20,  (int) 0.5 );
    
    }
    
    public static void mostrarB (int [] array){
        System.out.println("el arreglo B sera: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(array [i] + ", ");  
        }
        System.out.println("");
    }
} 
