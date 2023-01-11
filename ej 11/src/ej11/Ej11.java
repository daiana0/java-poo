/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Date fechaActual = new Date();
         System.out.println(" la fecha actual es: " +fechaActual.toString());
         
         
        System.out.println("ingrese el año: ");
        int anio = leer.nextInt();
        System.out.println("ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("ingrese el dia: ");
        int dia = leer.nextInt();
       
        Date fecha = new Date(anio-1900, mes-1, dia);     
        System.out.println("la fecha  es: " +fecha.toString());
               
        int años = fechaActual.getYear() - fecha.getYear() ;
        System.out.println("la diferencia de años es: " +años);
    }
    
    
}
