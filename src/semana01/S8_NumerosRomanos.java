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
public class S8_NumerosRomanos {
    public static void main(String[] args) {
        // Declaracion
        int numero; 
        String decenas, unidades;
        Scanner scan = new Scanner(System.in);

        // Entrada
        System.out.println("Ingrese un número entero entre 1 y 50: ");
        numero = scan.nextInt();
        
        // Proceso y Salida
        if (numero < 1 || numero > 50) {
            System.out.println("Debe ingresar un número entre 1 y 50");
        } else {
            decenas = switch (numero / 10) {
                case 0 -> "";
                case 1 -> "X";
                case 2 -> "XX";
                case 3 -> "XXX";
                case 4 -> "XL";
                case 5 -> "L";            
                default -> "Error";                
            };
        
            unidades = switch (numero % 10) {
                case 0 -> "";
                case 1 -> "I";
                case 2 -> "II";
                case 3 -> "III";
                case 4 -> "IV";
                case 5 -> "V";
                case 6 -> "VI";
                case 7 -> "VII";
                case 8 -> "VIII";
                case 9 -> "IX";
                default -> "Error";                
            };
            
            System.out.printf("El número %d expresado en números romanos es %S%S.\n", numero, decenas, unidades);
        }        
    }
}
