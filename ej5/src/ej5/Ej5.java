/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import Entidad.Cuenta;
import java.util.Scanner;
import servicio.servicioCuenta;

/**
 *
 * @author Dai
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cuenta numeroCuenta = new Cuenta();
        Scanner leer = new Scanner (System.in);
         servicioCuenta sc = new servicioCuenta();
        
         Cuenta cuentaBancaria = sc.crearCuenta();
        
       int opcion=0;
        do {  
        
        System.out.println("ingrese una opcion: ");
        System.out.println("opcion 1: ingresar saldo");
        System.out.println("opcion 2: retirar saldo");
        System.out.println("opcion 3: extraccion rapida");
        System.out.println("opcion 4: consultar saldo");
        System.out.println("opcion 5: consultar datos");
        System.out.println("opcion 6: mostrar menu");
        
        
        opcion = leer.nextInt();
        
      
        switch (opcion) {
            case 1:
                sc.ingresarSaldo(cuentaBancaria);
                System.out.println("nuevo saldo: " + cuentaBancaria.getSaldoActual());
                break;
            case 2:
                sc.retirarSaldo(cuentaBancaria);
                System.out.println("nuevo saldo: " + cuentaBancaria.getSaldoActual());
                break;
            case 3:
                sc.extraccionRapida(cuentaBancaria);
                break;
            case 4:
                sc.consultarSaldo(cuentaBancaria);
                System.out.println("el saldo actual es: " + cuentaBancaria.getSaldoActual());
                break;
            case 5:
                sc.consultarDatos(cuentaBancaria);
                break;
            case 6:
                System.out.println("está seguro que desea salir del programa (S/N)?");
                Scanner leer2 = new Scanner(System.in);
                String rpta = leer2.nextLine();
                if ("s".equals(rpta)) {
                System.out.println("Saliendo, hasta la proxima");
                } else {
                    opcion=opcion+1;
                System.out.println("elija otra opcion" +opcion);
                } 
                break;
            default:
                System.out.println("ingrese otro num");
        }
    
} while (opcion != 6);
}
}

