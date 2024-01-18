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
public class S7_ConvesrionMonetaria {
    public static void main(String[] args) {
        // Declaracion
        int monedaOrigen, monedaDestino = -1;
        double valorOrigen = -1.0, valorDestino = -1.0;
        final double TC_DOLAR_A_SOL = 3.82, TC_EURO_A_SOL = 4.17;
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("CONVERSIÓN MONETARIA");
        System.out.println("Seleccione la moneda de origen:\n1 = dolar\n2 = euro\n3 = sol");
        monedaOrigen = scan.nextInt();
        
        if (monedaOrigen != 1 && monedaOrigen != 2 && monedaOrigen != 3) {
            System.out.println("ERROR. Seleccione una opción válida (1, 2 o 3)");
        } else {
            System.out.println("Seleccione la moneda de destino:\n1 = dolar\n2 = euro\n3 = sol");
            monedaDestino = scan.nextInt();

            if (monedaDestino != 1 && monedaDestino != 2 && monedaDestino != 3) {
                System.out.println("ERROR. Seleccione una opción válida (1, 2 o 3)");
            } else {
                System.out.println("Ingrese el valor monetario de origen");
                valorOrigen = scan.nextDouble();

            }
        }
        
        // Proceso y Salida
        System.out.println("");
        switch (monedaOrigen) {
            case 1: // Dólar
                switch (monedaDestino) {
                    case 1: // Dólar
                        System.out.println("Operación redundante");
                        break;
                    case 2: // Euro
                        valorDestino = valorOrigen * (TC_DOLAR_A_SOL / TC_EURO_A_SOL);
                        System.out.printf("%.2f $ equivalen a %.2f €\n", valorOrigen, valorDestino);
                        break;
                    case 3: // Sol
                        valorDestino = valorOrigen * (TC_DOLAR_A_SOL);
                        System.out.printf("%.2f $ equivalen a S/ %.2f\n", valorOrigen, valorDestino);
                        break;                        
                }
                break;
            case 2: // Euro
                switch (monedaDestino) {
                    case 1: // Dólar
                        valorDestino = valorOrigen * (TC_EURO_A_SOL / TC_DOLAR_A_SOL);
                        System.out.printf("%.2f € equivalen a %.2f $\n", valorOrigen, valorDestino);
                        break;
                    case 2: // Euro
                        System.out.println("Operación redundante");
                        break;
                    case 3: // Sol
                        valorDestino = valorOrigen * (TC_EURO_A_SOL);
                        System.out.printf("%.2f € equivalen a S/ %.2f\n", valorOrigen, valorDestino);
                        break;                        
                }
                break;
            case 3: // Sol
                switch (monedaDestino) {
                    case 1: // Dólar
                        valorDestino = valorOrigen * (1.0 / TC_DOLAR_A_SOL);
                        System.out.printf("S/ %.2f equivalen a %.2f $\n", valorOrigen, valorDestino);
                        break;
                    case 2: // Euro
                        valorDestino = valorOrigen * (1.0 / TC_EURO_A_SOL);
                        System.out.printf("S/ %.2f equivalen a %.2f €\n", valorOrigen, valorDestino);
                        break;
                    case 3: // Sol
                        System.out.println("Operación redundante");
                        break;                       
                }
                break;
        }
    }
}
