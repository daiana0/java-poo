/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioCadena {

    Scanner leer = new Scanner(System.in);
    int contadorVocal = 0;

    public Cadena crearCadena() {
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        int longitudFrase = frase.length();
        return new Cadena(frase, longitudFrase);
    }

    public int mostrarVocales(Cadena objetoCadena) {

        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++) {
            if ((objetoCadena.getFrase().charAt(i) == 'a') || (objetoCadena.getFrase().charAt(i) == 'e')
                    || (objetoCadena.getFrase().charAt(i) == 'i') || (objetoCadena.getFrase().charAt(i) == 'o')
                    || (objetoCadena.getFrase().charAt(i) == 'u')) {
                contadorVocal++;
            }
        }
        return contadorVocal;
    }

    public void invertirClase(Cadena objetoCadena) {
        String frase = objetoCadena.getFrase();
        String fraseInvertida = "";

        for (int i = objetoCadena.getLongitudFrase() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.substring(i, i + 1);
        }
        System.out.println("la frase invertida es: " + fraseInvertida);
    }

    public void vecesRepetido(Cadena objetoCadena, String letra) {
        String frase = objetoCadena.getFrase();
        int contLetra = 0;

        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                contLetra++;
            }
        }
        System.out.println("la letra " + letra.toUpperCase() + " se repite: " + contLetra);
    }

    public void compararLongitud(Cadena objetoCadena) {
        String frase = objetoCadena.getFrase();
        System.out.println("ingrese una nueva frase");
        String fraseNueva = leer.nextLine();

        if (objetoCadena.getLongitudFrase() > fraseNueva.length()) {
            System.out.println("la frase nueva ingresada es menor a la frase principal ");
        } else if (objetoCadena.getLongitudFrase() == fraseNueva.length()) {
            System.out.println("la frase nueva ingresada es igual a la principal");
        } else {
            System.out.println("la frase nueva ingresada es mayor a la principal ");
        }
    }

    public void unirFrase(Cadena objetoCadena) {
        System.out.println("ingrese una nueva frase");
        String fraseNueva = leer.nextLine();

        String fraseUnida = objetoCadena.getFrase().concat(fraseNueva);
        System.out.println("la frase unida sera: " + fraseUnida);
    }

    public void reemplazar(Cadena objetoCadena) {
        System.out.println("ingrese una letra:");
        String letraCambiante = leer.nextLine();
        String letra = "a";
        String frase = objetoCadena.getFrase();
        String aux = "";

        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++) {
            if (frase.substring(i, i + 1).equals("a")) {
                aux = aux.concat(letraCambiante);
            } else {
                aux = aux.concat(frase.substring(i, i + 1));
            }

        }
        System.out.println("la frase modificada es: " + aux);
    }
    public void contiene (Cadena objetoCadena) {
        System.out.println("ingrese la letra que desea buscar:");
        String letra = leer.nextLine();
        String frase= objetoCadena.getFrase();
        boolean bandera = false;
        
        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++) {
            if (frase.substring(i, i+1).equals(letra)){
                bandera=true;
                break;
            }
        }
        System.out.println("contiene la letra "+letra+"?:" +bandera);
        
    }
}

