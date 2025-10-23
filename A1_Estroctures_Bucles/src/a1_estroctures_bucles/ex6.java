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
public class ex6 {
    public static void main(String[] args) {
        int num,positivo=0;
        Scanner in=new Scanner(System.in);
        System.out.println("introdueix un numero: ");
        num=in.nextInt();
        for(int contador=0; contador < 100; contador++){
            if(num>0){
            positivo++;
             }
        }
      System.out.println("El resultat del compte de positius es: " + positivo +
                   " El resultat del compte de negatius es: " + (100 - positivo));
    }
}
