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
public class ex4 {
     public static void main(String[] args) {
        int num,result=1;
         Scanner in=new Scanner(System.in);
        System.out.print("Introdueix un numero natuaral: ");
        num=in.nextInt();
        System.out.print(num+"!=");
        for(int i = num; i > 0; i--){
            result*=i;
            System.out.print(i+" * ");
        }
         System.out.printf("\b=%d\n",result);
  }
}
