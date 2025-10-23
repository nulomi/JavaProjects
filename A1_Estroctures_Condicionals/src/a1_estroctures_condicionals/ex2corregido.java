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
public class ex2corregido {
        public static void main(String[] args) {
        // Declarar la variable
        double num1,num2,suma,resta,multiplicacio,divisio;
        Scanner entrada = new Scanner(System.in);
        // Solicitar la edad
        System.out.print("introdueix el valor del  numero1: ");
        num1 = entrada.nextDouble();
        System.out.print("introdueix el valor del  numero2: ");
        num2 = entrada.nextDouble();
         suma = num1+num2;
         System.out.printf("%.2f+%.2f=%.2f\n",num1,num2,suma);
         resta = num1-num2;
         System.out.printf("%.2f-%.2f=%.2f\n",num1,num2,resta);
         multiplicacio = num1*num2;
         System.out.printf("%.2f*%.2f=%.2f\n",num1,num2, multiplicacio);
        // Condicionales
            if (num2 == 0) {
            System.out.println("La divisio per 0 no es possible.");
        } else {
            divisio = num1 / num2;
            System.out.printf("La divisio es: %.2f\n", divisio);
            }
    }
}

