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
public class ex2 {
     public static void main(String[] args) {
        int num,print=2;
         Scanner in=new Scanner(System.in);
        System.out.println("Introdueix un numero natuaral: ");
        num=in.nextInt();
        while(print<num){
            System.out.println(print+" ");
            print+=2;
        }
        System.out.println("\b\n");
    }
}

for (int i =2; i < num ; i++){
if(i%2==0){
    System.out.println(i+"");
    
    }
}
