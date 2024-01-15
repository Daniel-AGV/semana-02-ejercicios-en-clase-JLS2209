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
public class Reloj {

    public static void main(String[] args) {
        // Declaracion
        int horas = 0, minutos = 0, segundos = 0;
        boolean validacion = true;
        String horaActual, horaSiguiente;
        Scanner scan = new Scanner(System.in);

        // Entrada y validaciones
        System.out.print("Ingrese el número de las horas (0 - 23): ");
        horas = scan.nextInt();
        if (horas < 0 || horas > 23) {
            System.out.println("ERROR - Ingrese una cantidad válida para las horas.");
            validacion = false;
        } else {
            System.out.print("Ingrese el número de los minutos (0 - 59): ");
            minutos = scan.nextInt();
            if (minutos < 0 || minutos > 59) {
                System.out.println("ERROR - Ingrese una cantidad válida para los minutos.");
                validacion = false;
            } else {
                System.out.print("Ingrese el número de los segundos (0 - 59): ");
                segundos = scan.nextInt();
                if (segundos < 0 || segundos > 59) {
                    System.out.println("ERROR - Ingrese una cantidad válida para los segundos.");
                    validacion = false;
                }
            }
        }

        // Proceso y Salida (solo si se han validado las horas, minutos y segundos)
        if (validacion) {
            System.out.printf("\nLa hora actual es   %02d:%02d:%02d", horas, minutos, segundos);
            System.out.printf("\nEn un segundo serán ");

            // Si los segundos no llegan a 59, solo se aumenta uno al contador de segundos
            if (segundos < 59) {
                System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos + 1);
            } else {
                // Si los segundos actuales son 59, el contador de segundos va a cero
                // El contador de minutos aumenta en uno
                if (minutos < 59) {
                    System.out.printf("%02d:%02d:00\n", horas, minutos + 1);
                } else {
                    // Si los minutos actuales son 59, el contador de minutos va a cero
                    // El contador de horas aumenta en uno
                    if (horas < 23) {
                        System.out.printf("%02d:00:00\n", horas + 1);
                    } else {
                        // Si las horas actuales son 23, el contador de horas va a cero
                        System.out.printf("00:00:00 del día siguiente\n");
                    }
                }
            }

        }

    }
}
