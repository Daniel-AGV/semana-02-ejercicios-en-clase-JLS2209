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
public class EvaluarProgresion {
    public static void main(String[] args) {
        // Declaracion
        int n1, n2, n3;
        Scanner scan = new Scanner(System.in);
        // Entrada
        System.out.print("Ingrese el primer número entero de la progresión: ");
        n1 = scan.nextInt();
        System.out.print("Ingrese el segundo número entero de la progresión: ");
        n2 = scan.nextInt();
        System.out.print("Ingrese el tercer número entero de la progresión: ");
        n3 = scan.nextInt();
        
        // Salida
        if (2*n2 == n1 + n3) {
            System.out.printf("\nLos números [%d; %d; %d] están en progresión aritmética\n", n1, n2, n3);
        } else {
            System.out.printf("\nLos números NO están en progresión aritmética\n", n1, n2, n3);
        }
              
    }
}
