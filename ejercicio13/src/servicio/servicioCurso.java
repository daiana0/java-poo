/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioCurso {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Curso cargarAlumnos () {
        
        char alumnos[] = new char[5];
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese el nombre del alumno: ");
            alumnos[i] = leer.nextChar();
            
        }
            
        }
    }
}
