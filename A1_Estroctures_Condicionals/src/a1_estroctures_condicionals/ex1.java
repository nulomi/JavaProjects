/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_condicionals;

import java.util.Scanner;

/**
 *
 * @author nlo7503
 */
public class ex1 {
    public static void main(String[] args) {
        // Declarar la variable
        int edad;
        Scanner entrada = new Scanner(System.in);

        // Solicitar la edad
        System.out.println("Introdueix una edat:");
        edad = entrada.nextInt();

        // Condicionales
        if (edad >= 18) {
            System.out.println("Ets major d'edat.");
        } else {
            System.out.println("Ets menor d'edat.");
        }
    }
}