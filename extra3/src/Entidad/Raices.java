/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    Scanner leer = new Scanner(System.in);
    
 public double getDiscriminante(){
     return Math.pow(b,2)-(4*a*c);
    }
 
 public boolean tieneRaices(){
     return getDiscriminante()>0;
 }
 
 public boolean tieneRaiz(){
     return getDiscriminante()==0;
 }
 public void obtenerRaices(){
    double x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
    double x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
    
     System.out.println("solucion x1:");
     System.out.println(x1);
     System.out.println("solucion x2:");
     System.out.println(x2);
 }
 
 public void obtenerRaiz(){
     double x=(-b)/(2*a);
     
     System.out.println("unica solucion");
     System.out.println(x);
     
 }
 public void calcular(){
     if (tieneRaices()) {
         obtenerRaices();
     } else if (tieneRaiz()){
         obtenerRaiz();
     }else {
         System.out.println("no tiene soluciones");
         
     }
 }
}
