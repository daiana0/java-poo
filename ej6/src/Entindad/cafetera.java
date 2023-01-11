/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entindad;

/**
 *
 * @author Dai
 */
public class cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public cafetera() {
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
}
