/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class servicioCuenta {
    Scanner leer = new Scanner (System.in);
    
    public Cuenta crearCuenta () {
        System.out.println("ingresar el numero de cuenta: ");
        int numCuenta = leer.nextInt();
        System.out.println("ingrese el numero de DNI: ");
        int dni = leer.nextInt();
        System.out.println("ingrese el saldo actual: ");
        double saldoActual = leer.nextInt();
        
        return new Cuenta(numCuenta, dni, saldoActual); 
        
    }
   
        public void ingresarSaldo (Cuenta cuentaBancaria) {
            
            System.out.println("ingrese deposito: ");
            double deposito = leer.nextInt();
            double nuevoSaldo= cuentaBancaria.getSaldoActual() + deposito;
            
            cuentaBancaria.setSaldoActual(nuevoSaldo);
            
        }
   
        public void retirarSaldo(Cuenta cuentaBancaria) {
        
            System.out.println("ingrese monto a retirar");
            double retiro = leer.nextInt();
            if (retiro <= cuentaBancaria.getSaldoActual()) {
            double nuevoSaldo = cuentaBancaria.getSaldoActual() - retiro;
            cuentaBancaria.setSaldoActual(nuevoSaldo);
            } else {
                cuentaBancaria.setSaldoActual(0);
            }
            
    }
        public void extraccionRapida (Cuenta cuentaBancaria) {
            System.out.println("ingrese monto a extraer");
            double monto = leer.nextInt();
                        
            if  (monto <= (cuentaBancaria.getSaldoActual()*0.2)) {
            double nuevoSaldo = cuentaBancaria.getSaldoActual()-monto;   
            cuentaBancaria.setSaldoActual(nuevoSaldo);
                System.out.println("nuevo saldo: " +nuevoSaldo);
            } else {
                System.out.println("supera al 20% de su saldo");
            }
           
        }
        
        public void consultarSaldo (Cuenta cuentaBancaria) {
            cuentaBancaria.getSaldoActual();
            
            
        }
        public void consultarDatos (Cuenta cuentaBancaria) {
        System.out.println("el numero de cta bancaria es: " +cuentaBancaria.getNumeroCuenta());
        System.out.println("el DNI es: " +cuentaBancaria.getDNI());
        System.out.println("el saldo actual es: " +cuentaBancaria.getSaldoActual());
        }         
        
}
