/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import Entidad.Curso;
import Servicio.ServicioCurso;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioCurso sc = new ServicioCurso ();
        
        
        Curso c = sc.crearCurso();
        
        System.out.println("ganancia" +sc.calcularGananciaSemanal(c));
        
        
    }
    
    
}
