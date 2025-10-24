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
public class ex12 {

    public static void main(String[] args) {
        int aleatori, contador=1, num;
        Scanner in = new Scanner(System.in);
        System.out.println("Penso un numero... ");
        aleatori = in.nextInt();
        System.out.println("Endivinar el numero entre (1-100)");
        num = in.nextInt();
        for (; num == aleatori;) {
            if(aleatori<num){
                System.out.println("El numero a endivinar es mes gran");
            }else{
                System.out.println("El numero a endivinar es mes petit");
            }
         contador++;       
        }
        System.out.println("Els intents fets per endivinar el numero han sigut "+contador);
    }
}
