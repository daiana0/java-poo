/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Dai
 */
public class Ahorcado {
    private String [] palabra;
    private int letrasEncontradas;
    private int maxJugadasPermitidas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int maxJugadasPermitidas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.maxJugadasPermitidas = maxJugadasPermitidas;
    }

    public Ahorcado(int cantJugadas, String[] vector, int cantLetras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getMaxJugadasPermitidas() {
        return maxJugadasPermitidas;
    }

    public void setMaxJugadasPermitidas(int maxJugadasPermitidas) {
        this.maxJugadasPermitidas = maxJugadasPermitidas;
    }
    
}

    

