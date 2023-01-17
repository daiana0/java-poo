/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import Entidad.Puntos;
import Servicio.ServicioPunto;

/**
 *
 * @author Dai
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPunto sp = new ServicioPunto ();
        Puntos p1p2 = sp.crearPuntos();
        System.out.println("la distancia entre el punto 1 y 2 sera: " +sp.calcularDistancia(p1p2));
    }
    
}

