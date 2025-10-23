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
public class ex8_1 {
    public static void main(String[] args) {
    double num1;   
        Scanner in=new Scanner(System.in);
        System.out.println("introdueix el valor de la nota: ");
        num1=in.nextDouble();
        if(0<=num1&&num1<3){
           System.out.println("Valor de "+num1+" es molt deficient");
        }
        if(3<=num1&&num1<5){
           System.out.println("Valor de "+num1+" es insuficient");
        }
        if(5<=num1&&num1<6){
           System.out.println("Valor de "+num1+" es suficient");
        }
        if(6<=num1&&num1<7){
            System.out.println("Valor de "+num1+" es be");
        }
        if(7<=num1&&num1<9){
            System.out.println("Valor de "+num1+" es notable");
        }
         if(9<=num1&&num1<=10){
            System.out.println("Valor de "+num1+" es extelent");
        }
    }
}
