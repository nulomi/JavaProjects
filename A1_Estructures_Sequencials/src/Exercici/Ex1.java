/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici;

import java.util.Scanner;

/**
 *
 * @author nlo7503
 */
public class Ex1 {
     public static void main(String[] args) {
         //declarar les variables
         String nom = new String();
         Scanner entrada = new Scanner(System.in);
         //funcionament del main
         System.out.println("Introdueix el teu nom: "); 
         nom=entrada.nextLine();
         //sortida del programa
         System.out.println("Hola "+nom);
     }
}
