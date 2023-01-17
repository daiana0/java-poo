/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class ServicioNif {
    Scanner leer = new Scanner(System.in);
    
    public String[][] crearVector(){
        String[][] vector = new String [23][2];
        
        for (int i = 0; i < 23; i++) {
            String aux = String.valueOf(i);
            vector [i][0]=aux;
           
        }
        
        vector[0][1] = "T"; 
        vector[1][1] = "R";
        vector[2][1] = "W";
        vector[3][1] = "A";
        vector[4][1] = "G";
        vector[5][1] = "M";
        vector[6][1] = "Y";
        vector[7][1] = "F";
        vector[8][1] = "P";
        vector[9][1] = "D";
        vector[10] [1]= "X";
        vector[11][1] = "B";
        vector[12][1] = "N";
        vector[13][1] = "J";
        vector[14][1] = "Z";
        vector[15][1] = "S";
        vector[16][1] = "Q";
        vector[17][1] = "V";
        vector[18] [1]= "H";
        vector[19][1] = "L";
        vector[20][1] = "C";
        vector[21] [1]= "K";
        vector[22][1] = "E";
        return vector;
    }
    public Nif crearNif(){
        String[][] vector = crearVector();
        String letra = "";
        
        System.out.println("ingrese su numero de Dni, sin puntos");
        String dniS = leer.nextLine();
        
        int dni= Integer.parseInt(dniS); 
        String x = String.valueOf(dni%23);
        
        for (int i = 0; i < 23; i++) {
            if (x.equals(vector[i][0])) {
                letra = vector[i][1];
                break;
                
            }
            
        }
        return new Nif(dniS, letra);
    }
    
    public void mostrar(Nif nn){
        System.out.println("su nif es:");
        System.out.println(nn.getDni()+"-"+nn.getNif());
    }
}
