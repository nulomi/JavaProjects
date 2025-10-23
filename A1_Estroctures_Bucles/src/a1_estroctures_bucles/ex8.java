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
public class ex8 {
    public static void main(String[] args) {
        int suma=0,producte=1,num;
        Scanner in=new Scanner(System.in);
        System.out.println("introdueix numero: ");
        num=in.nextInt();
        for(int contador=0 ;num<=contador;contador++){
        producte*=contador;
        suma+=contador;
        }
        System.out.println("la mutiplicacio a sigut "+producte+" la suma a sigut "+suma);
        
        
        
        
        
        
        
    }
}
