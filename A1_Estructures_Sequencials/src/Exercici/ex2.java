package Exercici;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ex2{
     public static void main(String[] args) {
         //declarar les variables
        double costat,area;
         Scanner entrada = new Scanner(System.in);
         //funcionament del main
         System.out.println("Introdueix el teu costat: "); 
         costat = entrada.nextDouble();
         area= costat*costat;
         //sortida del programa
         System.out.print(" El quadrat de costat"+costat+"l'area val"+area);
         
     }
     }
    

