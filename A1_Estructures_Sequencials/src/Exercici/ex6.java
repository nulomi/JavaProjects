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
public class ex6 {
    public static void main(String[] args) {
        // Crear variables
        double Fahrenheit;
        Scanner entrada = new Scanner(System.in);
        // Inicio del programa
        System.out.print("Introduce la temperatura en grados Fahrenheit: ");
        Fahrenheit = entrada.nextDouble();
        // Calculo
        double Celsius = (Fahrenheit-32)/1.8;
        // Final programa
        System.out.printf("Los grados Fahrenheit %.2fºF en Celcius es %.2fºC\n",Fahrenheit,Celsius);
    }
}

