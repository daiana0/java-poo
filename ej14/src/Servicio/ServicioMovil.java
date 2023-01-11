/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class ServicioMovil {
    Scanner leer = new Scanner(System.in);
    
    public Movil cargarCelular() {
        System.out.print("ingrese marca: ");
        String marca = leer.next();
        System.out.print("ingrese precio en $: ");
        Double precio = leer.nextDouble();
        System.out.print("ingrese modelo: ");
        String modelo = leer.next();
        System.out.print("ingrese memoria Ram en Gb: ");
        int ram = leer.nextInt();
        System.out.print("ingrese almacenamiento en Gb: ");
        int almacenamiento = leer.nextInt();
        
        return new Movil(marca, precio, modelo, ram, almacenamiento, null);

    }

    public void ingresarCodigo(Movil obj){
        System.out.println("ingrese codigo: ");
        int[] array = new int[7];
        for (int i = 0; i < 7; i++) {
            int codigo = leer.nextInt();
            array[i] = codigo;
            
        }
        System.out.println("codigo" +Arrays.toString(array) );
        obj.setCodigo(array);
    }
    
}
