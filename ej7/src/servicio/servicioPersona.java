/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author Dai
 */
public class servicioPersona {    
    
    public Persona crearPersona () {
            Scanner leer = new Scanner (System.in);
    Scanner leer2 = new Scanner (System.in);
        System.out.print("ingrese su nombre: ");
        String nombre = leer.nextLine();
       
        System.out.print("ingrese su edad: ");
        int edad = leer.nextInt();
       
        System.out.print("ingrese su peso: ");
        float peso = leer.nextFloat();
       
        System.out.print("ingrese su altura: ");
        float altura = leer.nextFloat();
       
        System.out.println("ingrese su sexo: 'H' hombre, 'M' mujer, 'O'otro: ");
        String sexo = leer2.nextLine();
        
        switch (sexo) {
            case "H":
                System.out.println("Hombre");
                break;
            case "M":
                System.out.println("Mujer");
                break;
            case "O":
                System.out.println("Otro");
                break;
            default:
                System.out.println("escriba otra letra");
        }
       return new Persona (nombre, edad, peso, altura, sexo);
        //return m;
    }
    public int calcularIMC (Persona pp){
        double IMC = pp.getPeso()/(pp.getAltura()*pp.getAltura());
        System.out.println("el indice de masa corporal es de: " +IMC);
        if (IMC<20) {
            return -1;
            
        }else if (IMC >= 20 && IMC<=25) {
            return 0;
        }else{
            return 1;
        }
                
            
        }
     //me retorna cual es el mayor de edad como true
    public boolean esMayorDeEdad(Persona pp) {
     
       return pp.getEdad()>=18;
    }

    
}
    


    

