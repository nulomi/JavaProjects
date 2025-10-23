/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_condicionals;
import java.util.Scanner;
/**
 *
 * @author nlo7503
 */
public class ex7 {
    public static void main(String[] args) {
    double num1,num2,num3;
        Scanner in= new Scanner(System.in);
        System.out.println("Introdueix el valor del primer numero: ");
        num1=in.nextDouble();
         System.out.println("Introdueix el valor del segon numero: ");
        num2=in.nextDouble();
         System.out.println("Introdueix el valor del tercer numero: ");
        num3=in.nextDouble();
        if(num1==num2&&num1==num3){
            System.out.println("Els numeros intoduits tene el mateix valor:");
        }
        if(num1>num2&&num1>num3){
            System.out.println("El primer nombre que me has posta que es "+
                    num1+" es el mes gran dels tres");
        }
        if(num1<num2&&num3<num2){
            System.out.println("El segon nombre que me has posta que es "+
                    num2+" es el mes gran dels tres");
        }
        if(num1<num3&&num2<num3){
            System.out.println("El tercer nombre que me has posta que es "+
                    num3+" es el mes gran dels tres");
        } 
        if(num1==num2&&num1>num3){
            System.out.println("Els dos primers nombres intoduits son "+
                    num1+" i tene el mateix valor i tambe son els mes grans:");
        }
        if(num1==num3&&num1>num2){
            System.out.println("El primeri tercer nombres  intoduits son "+
                    num1+" i tene el mateix valor i tambeson els mes grans:");
        }
        if(num3==num2&&num1>num3){
            System.out.println("Els dos ultims nombres intoduits son "+
                    num2+"i tene el mateix valor i tambe son els mes grans:");
        }
     }
}