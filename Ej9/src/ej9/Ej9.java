/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Matematica ob = new Matematica();
        double num1 =  (Math.random()*10);
        System.out.println(""+num1);
        double num2 =  (Math.random()*10);
        System.out.println(""+num2);
        ob.setNum1(num1);
        ob.setNum2(num2);
        
        System.out.println("el mayor numero es: " +ob.devolverMayor());  
        System.out.println("la potencia del mayor numero sera: " +ob.calcularPotencia());
        System.out.println("la raiz cuadrada del menor es: " +ob.calculaRaiz());
    }
    
}
