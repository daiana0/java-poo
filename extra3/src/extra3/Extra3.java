/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import Entidad.Raices;
import java.util.Scanner;


/**
 *
 * @author Dai
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Raices rr = new Raices();
     Scanner sc = new Scanner(System.in);
		
        System.out.println("Ingrese el valor de a");
	double a = Double.parseDouble(sc.nextLine());
		
	System.out.println("Ingrese el valor de b");
	double b = Double.parseDouble(sc.nextLine());
		
	System.out.println("Ingrese el valor de c");
	double c = Double.parseDouble(sc.nextLine());
		
	Raices r = new Raices(a, b, c);
		
	r.calcular();
        
       
        
        
    
    
    
    }
    
}
