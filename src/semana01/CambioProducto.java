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
public class CambioProducto {
    public static void main(String[] args) {
        // Declaracion
        double precioProducto;
        int numeroDia;
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Ingrese el precio del producto:");
        precioProducto = scan.nextDouble();
        System.out.println("Ingrese el número del día (Lunes = 1, Martes = 2, ...):");
        numeroDia = scan.nextInt();
        
        // Condiciones
        boolean cond1 = (numeroDia == 1 && precioProducto >= 50 && precioProducto <= 80);
        boolean cond2 = (numeroDia != 3 && numeroDia != 4 && precioProducto >= 120);
        
        // Salida
        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("\nIngrese un valor válido para el número de día.");
        } else {
            if (cond1 || cond2) {
                System.out.println("\nEl cambio de producto PROCEDE.");
            } else {
                System.out.println("\nEl cambio de producto NO PROCEDE.");
            }
            
        }
              
    }
}
