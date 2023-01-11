/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.servicios;
import ej2.Entidades.circunferencia;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioCircunferencia {
    Scanner leer = new Scanner (System.in);
    
    public circunferencia crearCircunferencia () {
            System.out.print("ingrese el radio de la circunferencia: ");
            double radio = leer.nextDouble();
            
            return new circunferencia(radio);

      }
    public void Area (circunferencia cir){
        System.out.println("el area de circunferencia es: " +(3.14 * (cir. getRadio()* cir. getRadio()))); 
        
    }

    public void Perimetro (circunferencia cir) {
    System.out.println("el perimetro de circunferencia es: " +(2*3.14 * cir.getRadio())); 
     
    }

}