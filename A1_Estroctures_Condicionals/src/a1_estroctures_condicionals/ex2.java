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
public class ex2 {
    public static void main(String[] args) {
        // Declarar la variable
        double num1,num2,divisio,suma,resta,multiplicacio;
        Scanner entrada = new Scanner(System.in);
        // Solicitar la edad
        System.out.println("introdueix el valor del  numero 1 i numero 2");
        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();
         suma = num1+num2;
         resta = num1-num2;
         multiplicacio = num1*num2;
        // Condicionales
            if (num2 == 0) {
            System.out.printf("La suma es: %.2f\n", suma);
            System.out.printf("La resta es: %.2f\n", resta);
            System.out.printf("La multiplicacio es: %.2f\n", multiplicacio);
            System.out.println("La divisio per 0 no es possible.");
        } else {
            divisio = num1 / num2;
            System.out.printf("La suma es: %.2f\n", suma);
            System.out.printf("La resta es: %.2f\n", resta);
            System.out.printf("La multiplicacio és: %.2f\n", multiplicacio);
            System.out.printf("La divisio es: %.2f\n", divisio);
            }
    }
}

