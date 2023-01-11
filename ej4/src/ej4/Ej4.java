/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Entidad.Rectangulo;
import servicio.servicioRectangulo;

/**
 *
 * @author Dai
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioRectangulo sr = new servicioRectangulo ();
        Rectangulo rec = sr.crearRectangulo();
        
        System.out.println("la superficie del rectangulo es: " +sr.superficie(rec.getBase(), (rec.getAltura())));
        System.out.println("el perimetro del rectangulo es: " +sr.perimetro(rec.getBase(), (rec.getAltura())));
    
        sr.dibujo(rec);
}

}