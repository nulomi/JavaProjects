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
public class ex8_1 {
    public static void main(String[] args) {
        long num,suma=0,mult=0;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("introdueix numero: ");
            num=in.nextLong();
            if(num<=0){
                System.out.println("introdueix numero: "
                +"ha de ser natural positiu");
            }
        } while(num<=0);
        for (int i = 1; i < num; i++) {
         suma+=i; 
         mult*=i;
        }
            System.out.printf("La suma dels %d primers num "
                    +"naturals es %d\n",num,suma);
            System.out.printf("La multiplicacio dels %d primers num "
                    +"naturals es %d\n",num,mult);
    }
}


