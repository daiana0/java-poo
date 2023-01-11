/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

import Entidad.Persona;
import Servicio.servicioPersona;

/**
 *
 * @author Dai
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioPersona sp = new servicioPersona();
       
        Persona objP = sp.crearPersona();
        System.out.println("su edad: " +sp.calcularEdad(objP));
        System.out.println("es menor que la edad ingresada): " +sp.menorQue(objP, 0));
        
        Persona objP2 = sp.crearPersona();
        sp.mostrarPersona(objP2);
    }
    
}
