/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class ServicioCurso {
    
    
    public String[] cargarAlumnos () {
        Scanner leer = new Scanner(System.in);
        String [] array = new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el nombre: ");
            String nom = leer.nextLine();
            array [i]=nom;
            
        }
        return array;
        
    }
    
    public Curso crearCurso (){
        Scanner leer = new Scanner(System.in);
        
        String[] alumnos;
        System.out.println("ingrese el nombre del curso: ");
        String nombreCurso = leer.nextLine();
        System.out.println("ingrese la cant de hs diarias:");
        double cantHsDia = leer.nextDouble();
        System.out.println("ingrese cantidad de dias semanales:");
        int cantDiaSemana = leer.nextInt();
        System.out.println("turno:");
        String turno = leer.next();
        System.out.println("precio por hs");
        double precioXhs = leer.nextDouble();
        alumnos = cargarAlumnos();
        
        return new Curso (nombreCurso, cantHsDia, cantDiaSemana, turno, precioXhs, alumnos);
    }
    
    public double calcularGananciaSemanal (Curso c){
        double ganancia = c.getCantHsDia()*c.getCantDiaSemana()*5;
        return ganancia;
    }
}
