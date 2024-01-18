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
public class S8_Banco {
    public static void main(String[] args) {
        // Declaracion
        double lineaCredito, deuda, aumento;
        int tipoTarjeta;
        Scanner scan = new Scanner(System.in);

        // Entrada
        System.out.println("Ingrese su línea de crédito (S/):");
        lineaCredito = scan.nextDouble();
        System.out.println("Ingrese su tipo de tarjeta (1, 2, 3, ...)");
        tipoTarjeta = scan.nextInt();
        System.out.println("Ingrese su deuda (S/).\nSi no tiene deuda,ingrese 0:");
        deuda = scan.nextDouble();
        
        // Proceso
        aumento = switch (tipoTarjeta) {
            case 1 -> lineaCredito * 0.25;
            case 2 -> lineaCredito * 0.35;
            case 3 -> lineaCredito * 0.45;
            default -> lineaCredito * 0.50;
        };
        
        boolean condicionDeuda = (tipoTarjeta == 1 || tipoTarjeta == 2) && (deuda != 0);
        if (condicionDeuda) {
            aumento = 0.5 * aumento;
        }
        
        lineaCredito = lineaCredito + aumento;
        
        // Salida
        System.out.println("Su nueva línea de crédito es S/ " + lineaCredito);
    }
}
