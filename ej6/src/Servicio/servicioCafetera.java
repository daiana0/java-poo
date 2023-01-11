/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entindad.cafetera;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioCafetera {
    Scanner leer = new Scanner (System.in);
    Scanner leer2 = new Scanner (System.in);
    
    
    public cafetera crearCafetera () {
         System.out.println("ingrese la cantidad actual: ");
         int capacidadMaxima = leer.nextInt();
         int cantidadActual = capacidadMaxima;
    return new cafetera (cantidadActual, capacidadMaxima);
    }
    
    public void servirTaza (cafetera cn) {
        System.out.println("ingrese tamaño de taza:");
        int tamañoTaza = leer.nextInt();
        if (cn.getCantidadActual()>= tamañoTaza) {
            int cantidadActual= cn.getCantidadActual()-tamañoTaza;
            System.out.println("se lleno correctamente");
            cn.setCantidadActual(cantidadActual);
            System.out.println("la cantidad actual de cafe es: " +cn.getCantidadActual());
        } else {
            int cantidadVacia=tamañoTaza-cn.getCantidadActual();
            int cantLlenado= tamañoTaza - cantidadVacia;
            System.out.println("la taza se lleno con: " +cantLlenado);
            cn.setCantidadActual(0);
            System.out.println("la capacidad actual es de: " +cn.getCantidadActual()+ "ml");
      
        }
    
    }
    public void vaciarCafetera(cafetera cn) {
        System.out.println("está seguro que desea vaciar la cafetera (S/N)?");
        Scanner leer2 = new Scanner(System.in);
        String rpta = leer2.nextLine();
        if ("s".equals(rpta)) {
            System.out.println("vaciando..");
            cn.setCantidadActual(0);
        } else {
            System.out.println("la cafetera no se vacio");

        }
        
              
        
    }
    public void agregarCafe(cafetera cn) {
        System.out.println("ingrese la cantidad de cafe a agregar: ");
        int cantCafe = leer.nextInt();
        if (cn.getCantidadActual() < cn.getCapacidadMaxima()) {
            int restoCafe = cn.getCapacidadMaxima() - cn.getCantidadActual();
            if (restoCafe >= cantCafe) {
                int capacidadActual = cn.getCantidadActual() + cantCafe;
                cn.setCantidadActual(capacidadActual);
            } else {
                System.out.println("supera el limite de capacidad");
            }
        }
    }
}
