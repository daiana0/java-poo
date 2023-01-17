/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class ServicioPunto {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        System.out.println("ingrese los valores 'x e y' del punto 1 :");
        int x1 = leer.nextInt();
        int y1 = leer.nextInt();
        System.out.println("ingrese los valores 'x e y' del punto 2 :");
        int x2 = leer.nextInt();
        int y2 = leer.nextInt();
        
        return new Puntos (x1, y1, x2, y2);
        
        
    }
    
    public double calcularDistancia (Puntos pp){
       double x1x2 = Math.pow ((pp.getX2()-pp.getX1()) , 2);
       double y1y2 = Math.pow ((pp.getY2()-pp.getY1()), 2);
       double xy = x1x2 + y1y2;
       double distancia = Math.sqrt(xy);
       
       return distancia;
    }
}
