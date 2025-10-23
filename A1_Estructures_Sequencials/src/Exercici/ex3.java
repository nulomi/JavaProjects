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
public class ex3 {
     public static void main(String[] args) {
         //declarar les variables
         Scanner entrada = new Scanner(System.in);
         //funcionament del main
         System.out.println("Introdueix el teu valor de numero1: "); 
         double num1 = entrada.nextDouble();
         System.out.println("Introdueix el teu valor de numero2: "); 
         double num2 = entrada.nextDouble();
         double suma = num1+num2;
         double resta = num1-num2;
         double multiplicacio = num1*num2;
         double divicio = num1/num2;
         //sortida del programa
         System.out.print(" suma "+suma);
         System.out.print(" resta "+resta);
         System.out.print(" multiplicacio "+multiplicacio);
         System.out.print(" divicio "+divicio);
     }
     }
    
    

