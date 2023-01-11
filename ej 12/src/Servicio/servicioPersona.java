/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioPersona {
    
    public Persona crearPersona () {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("ingrese su fecha de nacimiento (Y/M/D): ");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        
        Date nacimiento = new Date (anio-1900, mes-1, dia);
        return new Persona(nombre, nacimiento);
        
        }
    
    public int calcularEdad (Persona objP) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear()- objP.getFechaNac().getYear();
        return edad;
        
    }
    
    public boolean menorQue (Persona objP, int edad) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una edad: ");
        int edad2 = leer.nextInt();
        
        if (edad<edad2) {
            return true;
        }else{ 
            return false;
      
    }
        
}
    public void mostrarPersona (Persona objP) {
        System.out.println("Nombre: "+ objP.getNombre());
        System.out.println("fecha de nacimiento: " +objP.getFechaNac());
        
    }

}
