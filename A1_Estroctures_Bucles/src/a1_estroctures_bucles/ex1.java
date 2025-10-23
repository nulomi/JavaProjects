/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_bucles;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author nlo7503
 */
public class ex1 {
    public static void main(String[] args) {
        int num;
        Scanner in= new Scanner(System.in);
        System.out.println(" Introdueix un numero: ");
        num=in.nextInt();
        if(num>0){
            for(int i = 1; i <= num ; i++){
            System.out.println(i+" ");
                }
        System.out.println("\\b\n");
    }else{
            System.out.println("El numero ha de ser positiu!!");
        }
    }
}
