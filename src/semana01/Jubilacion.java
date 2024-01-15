/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana01;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LN6377-A0607
 */
public class Jubilacion {

    public static void main(String[] args) {
        // Declaracion
        int edad;
        char sexo;
        Scanner scan = new Scanner(System.in);

        // Entrada
        System.out.println("Ingrese su sexo (M/F):");
        sexo = scan.nextLine().charAt(0);
        System.out.println("Ingrese su edad:");
        edad = scan.nextInt();

        // Condiciones
        boolean aplicaMasculino = (sexo == 'M' && edad >= 65);
        boolean aplicaFemenino = (sexo == 'F' && edad >= 60);

        // Salida
        if (sexo != 'M' && sexo != 'F') {
            System.out.println("\nIngrese un valor válido para sexo.");
        } else {
            if (aplicaMasculino || aplicaFemenino) {
                System.out.println("\nUsted está en edad de jubilación");
            } else {
                System.out.println("\nUsted NO está en edad de jubilación");
            }

        }

    }

}
