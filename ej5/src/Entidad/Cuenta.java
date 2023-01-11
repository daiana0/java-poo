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
public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private double saldoActual;
    private double interes;

    public Cuenta(int numeroCuenta, int DNI, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = DNI;
        this.saldoActual = saldoActual;
       
    }

    public Cuenta() {
    }
    

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return dni;
    }

    public void setDNI(int DNI) {
        this.dni = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
    
    
    
}
