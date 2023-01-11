/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import Entidad.Cadena;
import java.util.Scanner;
import servicio.servicioCadena;

/**
 *
 * @author Dai
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioCadena sc = new servicioCadena();
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);

        Cadena objetoCadena = sc.crearCadena();
        
        int op;
        do {
            System.out.println("****** MENU *******");
            System.out.println("1- Mostrar Vocales");
            System.out.println("2- Invertir Frase");
            System.out.println("3- Veces Repetido");
            System.out.println("4- Comparar Longitud");
            System.out.println("5- Unir Frases");
            System.out.println("6- Reemplazar letras A");
            System.out.println("7- Contiene");
            System.out.println("0- SALIR");
            System.out.println("Ingrese una opcion: ");
            op = leer2.nextInt();
            String letra;
            switch (op) {
                case 1:
                    System.out.println("la cantidad de vocales es: " + sc.mostrarVocales(objetoCadena));
                    break;
                case 2:
                    sc.invertirClase(objetoCadena);
                    break;
                case 3:
                    System.out.println("ingrese una letra para ver cuantas veces se repite");
                    letra = leer.nextLine();
                    sc.vecesRepetido(objetoCadena, letra);
                    break;
                case 4:
                    sc.compararLongitud(objetoCadena);
                    break;
                case 5:
                    sc.unirFrase(objetoCadena);
                    break;
                case 6:
                    sc.reemplazar(objetoCadena);
                    break;
                case 7:
                    sc.contiene(objetoCadena);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, vuelva a intentar.");
            }
        } while (op != 0);
        //si repito el sp.mostra.. me va a contar dos veces por estar en la lines 28 y 29, y estar el
        //contador inicializado fuera del metodo.

    }
}
