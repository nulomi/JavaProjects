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
public class ex4 {
        public static void main(String[] args) {
        // Declarar la variable
        double num1;
        Scanner entrada = new Scanner(System.in);
        // Solicitar la edad
        System.out.print("introdueix el valor del  numero1: ");
        num1 = entrada.nextDouble();
          if (num1 == 0) {
            System.out.println("el numero%.1f es0\n");
              } else {
           if(num1 > 0){
              System.out.printf(" el numero%.1f es positiu\n ");
           } else {
              System.out.printf("el numero%.1f es negatiu\n  ");
           }
          }
        }
}
