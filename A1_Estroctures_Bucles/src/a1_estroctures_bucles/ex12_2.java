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
public class ex12_2 {

    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);
        Random in = new Random();
        int secret, num, intents = 1;
        secret = in.nextInt(1, 100);
         System.out.println("Penso un numero...Endivinar el numero entre (1-100) "+secret);
        do {
            System.out.println("Introdueix numero: ");
            num = nuevo.nextInt();
            intents++;
            if (num < secret) {
                System.out.println("El numero a endivinar es mes gran");
            } else if (num > secret) {
                System.out.println("El numero a endivinar es mes petit");
            } else {
                System.out.println("Enhorabona, has trobat el numero secret amb %d intents!\n", intents);
            }

        }while(num!=secret);
    }
}
