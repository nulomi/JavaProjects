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
public class ex11 {
    public static void main(String[] args) {
        int num1,num2,resultat=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Introdueix numero 1: ");
        num1=in.nextInt();
        System.out.println("Introdueix numero 2: ");
        num2=in.nextInt();
        for(int contador=1; Math.abs(num2)<contador; contador++){
        resultat*=num1;
        }
        if(Math.abs(num2)<0){
            System.out.println("El resultat es: "+1/resultat);
        }else{
            System.out.println("El resultat es: "+resultat);
        }
    }
}
