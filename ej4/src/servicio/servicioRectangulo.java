/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioRectangulo {
    Scanner leer = new Scanner (System.in);
    
    public Rectangulo crearRectangulo () {
        System.out.println("ingrese la medida de la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("ingrese la medida de la altura del rectangulo");
        int altura = leer.nextInt();
        return new Rectangulo (base, altura);
        
    }
    
public int superficie (int base,int altura) {
    int superficie = base * altura;
    return superficie;
    
}
public int perimetro (int base,int altura) {
    int superficie = (base + altura)*2;
    return superficie;
    
}
public void dibujo (Rectangulo rec) {
        for (int i = 0; i < rec.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println();
        //centro
        for (int i = 0; i < rec.getAltura() - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < rec.getBase() - 2; j++) {
                System.out.print(" ");

            }
            System.out.println("*");
        }

        //linea inf
        for (int i = 0; i < rec.getBase(); i++) {
            System.out.print("*");
        }
    
    }
}



