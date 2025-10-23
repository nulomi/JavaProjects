/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_condicionals;

import java.util.Scanner;

/**
 *
 * @author nulomi
 */
public class ex11 {
    public static void main(String[] args) {
        double preu,diners, diferencia;
        Scanner in=new Scanner(System.in);
        System.out.println("introdueix el valor del preu: ");
        preu=in.nextDouble();
        System.out.println("introdueix el valor del diners: ");
        diners=in.nextDouble();
        diferencia=0;
        if(preu==diners){
            System.out.println("Es pot pagar sense sense tenir que tornar ni faltar diners perque son exactes");
        }
        if(diners<preu){
            diferencia=diners-preu;
            System.out.println("Li falten diners que son: "+-diferencia);
        }
        if(preu<diners){
            diferencia=diners-preu;
            System.out.println("Li sobren diners que son: "+diferencia);
        }
    }
   
}
