/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import Entidad.Movil;
import Servicio.ServicioMovil;

/**
 *
 * @author Dai
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioMovil sm = new ServicioMovil();
        
        Movil obj1 = sm.cargarCelular();
        sm.ingresarCodigo(obj1);
    }
    
}
