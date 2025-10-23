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
public class ex6 {
        public static void main(String[] args) {
        // Declarar la variable
        double num1,num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("introdueix el valor del  numero1: ");
        num1 = entrada.nextDouble();
        System.out.print("introdueix el valor del  numero2: ");
        num2 = entrada.nextDouble();
          if (num1 == num2) {
            System.out.println("Son iguals");
              } else {
           if(num1 > num2){
              System.out.printf(num1+" Es mes gran ");
           } else {
              System.out.printf(num2+" Es mes gran ");
           }
          }
        }
}
