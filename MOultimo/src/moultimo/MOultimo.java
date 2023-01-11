/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moultimo;
import Entidad.persona;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class MOultimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        persona p1 = new persona();
        System.out.println("ingrese su nombre");
        
        p1.setNombre(leer.nextLine());
        p1.setApellido("aguero");
        System.out.println(p1.getApellido());
        System.out.println("ingrese su nacionalidad");
        p1.setNacionalidad(leer.nextLine());
        
        
        
    }
    
}
