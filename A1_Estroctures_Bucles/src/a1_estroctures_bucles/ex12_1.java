/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_bucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nlo7503
 */
public class ex12_1 {

    public static void main(String[] args) {
        int aleatori, num;
        Scanner nuevo = new Scanner(System.in);
        Random in = new Random();
        System.out.println("Penso un numero... ");
        aleatori = in.nextInt(1, 11);
        System.out.println(
                "Endivinar el numero entre (1-100): ");
        num = nuevo.nextInt();
        for (int contador = 0; num == aleatori; contador++) {
            if (aleatori < num) {
                System.out.println("El numero a endivinar es mes gran");
            } else {
                System.out.println("El numero a endivinar es mes petit");
            }
        }

        System.out.println("Els intents fets per endivinar el numero han sigut "+contador);
    }
}
