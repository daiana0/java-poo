/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;
import ej2.Entidades.circunferencia;
import ej2.servicios.servicioCircunferencia;

/**
 *
 * @author Dai
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    servicioCircunferencia sc= new servicioCircunferencia ();
    circunferencia cir = sc.crearCircunferencia();
    
    
    sc.Area(cir);
    sc.Perimetro(cir);
            
    }    
    
    
}
