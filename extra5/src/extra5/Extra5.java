/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import Entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Mes mm = new Mes();

        rellenarArray(mm);
        llenarMesSecreto(mm);
        String resp;
        do {
            System.out.println("ingrese un mes");
            resp = leer.next();
            if (resp.equals(mm.getMesSecreto())) {
                System.out.println("acertaste el mes secreto");
            } else {
                System.out.println("no has acertado, vuelve a intentarlo");
            }

        } while (!resp.equals(mm.getMesSecreto()));
        
    }
    

    public static void rellenarArray(Mes mm) {
        String[] mes = new String[12];

        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";

        mm.setMes(mes);
    }

    public static void llenarMesSecreto(Mes mm) {
        int num = (int) (Math.random() * 12);
        System.out.println("num: " + num);
        switch (num) {
            case 1:
                mm.setMesSecreto("enero");
                break;
            case 2:
                mm.setMesSecreto("febrero");
                break;
            case 3:
                mm.setMesSecreto("marzo");
                break;
            case 4:
                mm.setMesSecreto("abril");
                break;
            case 5:
                mm.setMesSecreto("mayo");
                break;
            case 6:
                mm.setMesSecreto("junio");
                break;
            case 7:
                mm.setMesSecreto("julio");
                break;
            case 8:
                mm.setMesSecreto("agosto");
                break;
            case 9:
                mm.setMesSecreto("septiembre");
                break;
            case 10:
                mm.setMesSecreto("octubre");
                break;
            case 11:
                mm.setMesSecreto("noviembre");
                break;
            case 12:
                mm.setMesSecreto("diciembre");
                break;

        }
    }
}
