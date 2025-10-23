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
public class ex5 {
      public static void main(String[] args) {
        int num;
          Scanner in=new Scanner(System.in);
        System.out.print("Introdueix un numero natuaral: ");
        num=in.nextInt();
        for (int i = 0; i <= 100; i++){
            if(num<0){
                System.out.println("hi ha numeros negatius: ");
            }
        }
        
      } 
}