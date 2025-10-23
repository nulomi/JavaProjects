/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1_estroctures_bucles;

import java.util.Scanner;

/**
 *
 * @author nlo7503
 */
public class A1_Estroctures_Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Introdueix un numero natural: ");
        num=in.nextInt();
        if(num>0){
            for (int i =1; i <= num; i++){
              System.out.println(i +"");
            }
            System.out.println("\\d\n");
        }else {
            System.out.println("El número no es natural.");
                
            
    }
    
}
