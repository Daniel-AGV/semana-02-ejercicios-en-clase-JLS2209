/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LN6377-A0607
 */
public class DescuentoJoyeria {
    public static void main(String[] args) {
        // Declaracion
        double montoCompra;
        final double DESCUENTO = 0.10;
        Scanner scan = new Scanner(System.in);

        // Entrada
        System.out.println("Ingrese el monto de compra:");
        montoCompra = scan.nextDouble();
        
        // Proceso        
        if (montoCompra >= 2500) {
            System.out.println("Aplica un descuento de S/. " + montoCompra*DESCUENTO);
            montoCompra = montoCompra * (1 - DESCUENTO);
        } else {
            System.out.println("No aplica descuento");
        }
        
        // Salida
        System.out.println("El monto a pagar es: S/. " + montoCompra);
    }
}
