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
public class S8_Nota {
    public static void main(String[] args) {
        // Declaracion
        double nota;
        Scanner scan = new Scanner(System.in);

        // Entrada
        System.out.println("Ingrese la nota del estudiante (0 - 20)");
        nota = scan.nextDouble();

        // Salida
        if (nota < 0) {
            System.out.println("Ingrese una nota válida");
        } else {
            if (nota < 13) {
                System.out.println("Estado: DEFICIENTE");
            } else {
                if (nota <= 15) {
                    System.out.println("Estado: REGULAR");
                } else {
                    if (nota <= 18) {
                        System.out.println("Estado: BUENO");
                    } else {
                        if (nota <= 20) {
                            System.out.println("Estado: EXCELENTE");
                        } else {
                            System.out.println("Ingrese una nota válida");
                        }
                    }
                }
            }
        }

    }
}
