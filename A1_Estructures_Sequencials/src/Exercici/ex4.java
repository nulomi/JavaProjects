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
public class ex4 {

    public static void main(String[] args) {
        //declarar les variables
        final double PI = 3.14;
        double radi, perimetre, area, volum;
        Scanner entrada = new Scanner(System.in);
        //funcionament del main
        System.out.println("Introdueix el valor de radi: ");
        radi = entrada.nextDouble();
        perimetre = 2 * PI * radi;
        area = PI * radi * radi;
        volum = 4 / 3 * PI * radi * radi * radi;
        System.out.printf("Longitut de circunferencia de radi %.2f=%.2f\n", radi, perimetre);
        System.out.printf("Longitut de circunferencia de radi %.2f*%.2f=%.2f\n", radi, radi, perimetre);
        System.out.printf("Longitut de circunferencia de radi %.2f*%.2f*%.2f=%.2f\n", radi, radi, radi, perimetre);

    }
}
