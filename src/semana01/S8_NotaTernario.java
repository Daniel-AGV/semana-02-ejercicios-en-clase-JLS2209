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
public class S8_NotaTernario {
    public static void main(String[] args) {
        // Declaracion
        double nota;
        String msg;
        Scanner scan = new Scanner(System.in);

        // Entrada
        System.out.println("Ingrese la nota del estudiante (0 - 20)");
        nota = scan.nextDouble();

        // Salida
        msg =   (nota < 0) ? "Ingrese una nota válida" :
                (nota < 13) ? "Estado: DEFICIENTE" :
                (nota <= 15) ? "Estado: REGULAR" :
                (nota <= 18) ? "Estado: BUENO" :
                (nota <= 20) ? "Estado EXCELENTE" : "Ingrese una nota válida";
                
        System.out.println(msg);
    }
}
