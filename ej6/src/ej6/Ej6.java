/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import Entindad.cafetera;
import Servicio.servicioCafetera;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioCafetera sc = new servicioCafetera ();
        Scanner leer = new Scanner (System.in);
        cafetera cn = sc.crearCafetera();
        
        sc.servirTaza(cn);
        
        sc.vaciarCafetera(cn);
        sc.agregarCafe(cn);
        
        
    }
    
}
