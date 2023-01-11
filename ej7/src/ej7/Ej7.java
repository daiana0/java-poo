/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import Entidad.Persona;
import servicio.servicioPersona;
import Entidad.Contadores;

/**
 *
 * @author Dai
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int respuesta;
        boolean bandera;

        //crear personas   
        servicioPersona sp = new servicioPersona();
        Contadores cont = new Contadores(0, 0, 0, 0, 0);

        Persona p1 = sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4 = sp.crearPersona();

        //p1
        System.out.println("datos " + p1.getNombre());
        respuesta = sp.calcularIMC(p1);
        calculoPeso(respuesta, cont);
        bandera = sp.esMayorDeEdad(p1);
        calculoEdad(bandera, cont);
        System.out.println("");
        //p2
        System.out.println("datos " + p2.getNombre());
        respuesta = sp.calcularIMC(p2);
        calculoPeso(respuesta, cont);
        bandera = sp.esMayorDeEdad(p2);
        calculoEdad(bandera, cont);
        System.out.println("");
        //p3
        System.out.println("datos " + p3.getNombre());
        respuesta = sp.calcularIMC(p3);
        calculoPeso(respuesta, cont);
        bandera = sp.esMayorDeEdad(p3);
        calculoEdad(bandera, cont);
        System.out.println("");
        //p4
        System.out.println("datos " + p4.getNombre());
        respuesta = sp.calcularIMC(p4);
        calculoPeso(respuesta, cont);
        bandera = sp.esMayorDeEdad(p4);
        calculoEdad(bandera, cont);
        System.out.println("");
//mostrar datos
        System.out.println("Personas por debajo de su peso ideal: " + cont.getContDebajoPeso());
        System.out.println("Personas con peso ideal: " + cont.getContIdeal());
        System.out.println("Personas con sobrepeso: " + cont.getContSobrepeso());
        System.out.println("Personas mayores de edad: " + cont.getContMayores());
        System.out.println("Personas menores de edad: " + cont.getContMenores());
    }
        
public static void calculoPeso(int resp, Contadores cont) {
        switch (resp) {
            case -1:
                System.out.println("-Por debajo de su peso ideal.");
                cont.setContDebajoPeso(cont.getContDebajoPeso() + 1);
                break;
            case 0:
                System.out.println("-Peso ideal.");
                cont.setContIdeal(cont.getContIdeal() + 1);
                break;
            case 1:
                System.out.println("-Sobrepeso.");
                cont.setContSobrepeso(cont.getContSobrepeso() + 1);
                break;
        }
    }

    public static void calculoEdad(boolean bandera, Contadores cont) {
        if (bandera) {
            System.out.println("-Mayor de edad.");
            cont.setContMayores(cont.getContMayores() + 1);
        } else {
            System.out.println("-Menor de edad.");
            cont.setContMenores(cont.getContMenores() + 1);
        }
    }
}
