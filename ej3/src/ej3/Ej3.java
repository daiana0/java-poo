/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Entidad.operacion;
import servicio.servicioOperaciones;

/**
 *
 * @author Dai
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioOperaciones so = new servicioOperaciones();
        operacion op = so.crearOperaciones();
        
       // so.crearOperaciones();
        
        System.out.println("la suma de los dos numeros es: " +so.suma(op.getNum1(),op.getNum2()));
        System.out.println("la resta de los dos numeros es: " +so.resta(op.getNum1(), op.getNum2()));
        System.out.println("la multiplicacion de los dos numeros es: " +so.multiplicacion(op.getNum1(),op.getNum2()));
        System.out.println("la division de los dos numeros es: " +so.division(op.getNum1(),op.getNum2()));
    }
    
}
