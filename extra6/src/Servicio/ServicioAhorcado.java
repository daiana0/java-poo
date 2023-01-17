/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class ServicioAhorcado {
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
       
        System.out.println("ingrese una plabra");
        String palabra = leer.next();
        int n = palabra.length();
        String[] vector=new String[n];
             
        for (int i = 0; i < n; i++) {
            vector[i]= palabra.substring(i, i+1);  
        }
        
        System.out.println("ingrese la cantidad de jugadas permitidas:");
        int cantJugadas = leer.nextInt();
        int cantLetras=0;
        
        return new Ahorcado(cantJugadas, vector, cantLetras);
        
    }
    
    public void longitud(Ahorcado aho){
        System.out.println("la longitud de la palabra: " +aho.getPalabra().length);
    }
    
    public boolean buscar (Ahorcado aho, String letra){
        int cont=0;
        for (int i = 0; i < aho.getPalabra().length; i++) {
            if (letra.equals(aho.getPalabra()[i])){
                cont++;
            }
            
        }
        if (cont>0){
            aho.setLetrasEncontradas(aho.getLetrasEncontradas()+cont);
            System.out.println("la letra pertenece a la palabra");
            return true;
        }else{
            System.out.println("la letra no pertenece a la palabra");
            return false;
        }
    }
    
    public void encontradas(Ahorcado a, String letra){
        int intentos = a.getMaxJugadasPermitidas();
        boolean bandera = buscar(a, letra);
        int restantes = a.getPalabra().length - a.getLetrasEncontradas();
        
        if(!bandera){
            intentos--;
            a.setMaxJugadasPermitidas(intentos);
        }
        System.out.println("Letras encontradas: "+a.getLetrasEncontradas());
        System.out.println("Letras restantes: "+restantes);
        
    }
    
    public void intentos(Ahorcado a){
        System.out.println("Numero de intentos restantes: "+a.getMaxJugadasPermitidas());
    }
    
    public void juego(Ahorcado a){
        boolean bandera = false;
        
        do{
            this.longitud(a);
            System.out.println("Ingrese una letra: ");
            String letra = leer.next();
            this.encontradas(a, letra);
            this.intentos(a);
            if(a.getLetrasEncontradas() == a.getPalabra().length){
                System.out.println("USTED ADIVINO LA PALABRA.");
                bandera = true;
                
            }else if(a.getMaxJugadasPermitidas() == 0){
                System.out.println("Usted se quedó sin intentos :( ");
                bandera = true;
            }
            System.out.println("---------------------------------------------");
        }while(!bandera);
    }
}
        
    

