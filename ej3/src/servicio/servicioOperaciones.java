/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.operacion;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioOperaciones {
    Scanner leer = new Scanner (System.in);
    
    public operacion crearOperaciones () {
        System.out.println("ingrese el valor de num 1" );
        int num1  = leer.nextInt();
        System.out.println("ingrese el valor de num 2");
        int num2 = leer.nextInt();
        
        
        return new operacion (num1,num2);
             
    }
   
    
     public int suma (int num1,int num2){
        int suma = num1 + num2;
        return suma;
        
     }   
     
        public int resta (int num1,int num2){
        int resta = num2 - num1;
        return resta;
        
     }
        public int multiplicacion (int num1,int num2){
            int multiplicacion=0;
            if (num1!=0 && num2!=0) {
            multiplicacion = num1 * num2;
            } else {
                System.out.println("ingrese un numero distnto a cero");
            }
        return multiplicacion;
        
    }

    public int division(int num1, int num2) {
        int division = 1;
        if (num1 != 0 && num2 != 0) {
            division = num2 / num1;
            if (num1 == 0 && num2 == 0) {
                System.out.println("el resultado sera 0");
            }
        }
        return division;
    }
    
}
