/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_bucles;

import java.util.Scanner;

/**
 *
 * @author nulomi
 */
public class ex10 {

    public static void main(String[] args) {
        int num1, num2, inici = 0, fi, parells = 0, imparells = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix numero 1: ");
        num1 = in.nextInt();
        System.out.println("Introdueix numero 2: ");
        num2 = in.nextInt();
        if (num1 == num2) {
            System.out.println("Els dos numeros son iguals!!");
        }
        if (num1 < num2) {
            inici = num1 + 1 ;
            fi = num2;
        } else {
            inici = num2 + 1;
            fi = num1;
        }
        for (; inici < fi; inici++) {
            if (inici % 2 == 0) {
                parells += inici;

            } else {
                imparells += inici;
            }

        }
        System.out.println("Entre "+num1+" i "+num2+" la suma de parells a sigut "+parells+" la suma de senars "+imparells);
    }
}
