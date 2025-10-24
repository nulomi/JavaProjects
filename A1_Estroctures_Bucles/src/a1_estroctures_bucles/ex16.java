/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_bucles;

import java.util.Scanner;

/**
 *
 * @author nlo7503
 */
public class ex16 {

    public static void main(String[] args) {
        int num, primo = 0,k=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un numero enter !!!");
        num=in.nextInt();
        if (num >= 1) {
            for (; k >= num; k++) {
                for (int contador = k; contador == 1; contador++) {
                    if (k % contador == 0) {
                        System.out.println("No es primo ");
                       
                    }
                }
                primo++;
            } System.out.println("El resulatat es les vegades contades han sigut "+k
                    +" Els numeros primos "+primo);
        } else {
            System.out.println("Error torrna a enviar el numero");
        }
    }
}

