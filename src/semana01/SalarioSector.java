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
public class SalarioSector {
    public static void main(String[] args) {
        // Declaracion
        int sector;
        char sexo;
        double salarioActual, aumentoPorcentual, nuevoSalario;
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Ingrese su sexo (M/F):");
        sexo = scan.next().toUpperCase().charAt(0);
        System.out.println("Ingrese su sector (1: Salud, 2: Educación, 3: Transporte):");
        sector = scan.nextInt();
        
        // Proceso
        if (sector == 1) { // Salud
            salarioActual = 15000.0;
            if (sexo == 'F') {
                aumentoPorcentual = 0.25;
            } else {
                aumentoPorcentual = 0.20;
            }
        } else if (sector == 2) { // Educación
            salarioActual = 12000.0;
            if (sexo == 'F') {
                aumentoPorcentual = 0.12;
            } else {
                aumentoPorcentual = 0.11;
            }
        } else { // Transporte
            salarioActual = 18000.0;
            if (sexo == 'F') {
                aumentoPorcentual = 0.20;
            } else {
                aumentoPorcentual = 0.15;
            }
        }
        
        nuevoSalario = salarioActual * (1 + aumentoPorcentual);
        
        // Salida
        if (sexo != 'M' && sexo != 'F') {
            System.out.println("\nIngrese un valor válido para sexo.");
        } else if (sector < 1 || sector > 3) {
            System.out.println("\nIngrese un valor válido para el sector.");
        } else {
            System.out.printf("\nEl monto de su salario es: S/. %.2f\n", nuevoSalario);            
        }
              
    }
}
