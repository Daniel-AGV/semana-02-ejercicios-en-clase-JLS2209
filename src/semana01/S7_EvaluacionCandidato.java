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
public class S7_EvaluacionCandidato {
    public static void main(String[] args) {
        // Declaracion
        int puntaje;
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.print("Ingrese la puntuación del candidato: ");
        puntaje = scan.nextInt();
        
        // Salida
        String msg = "\nDescripción del candidato: ";
        switch (puntaje) {
            case 0, 1, 2, 3, 4: 
                System.out.println(msg + "DESCARTADO");
                break;
            case 5: 
                System.out.println(msg + "EN SUSPENSO");
                break;
            case 6: 
                System.out.println(msg + "ACEPTABLE");
                break;
            case 7, 8: 
                System.out.println(msg + "NOTABLE");
                break;
            case 9, 10: 
                System.out.println(msg + "SOBRESALIENTE");
                break;
            default:
                System.out.println("ERROR: Puntuación no válida");
                break;
        }
    }
}
