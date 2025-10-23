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
public class ex7 {
    public static void main(String[] args) {
        int num,positius=0,negatius=0, contador=0;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("introdueix num= ");
            num=in.nextInt();
            if(num>0){
                positius++;
            }else if(num<0){
                negatius++;
            }else{
                System.out.println("sortin del programa...");
            }
            contador++;
        }while(num!=0);
        System.out.printf("De %d numeros introducidos, "
                +"%d son negativos y %d positivos\n",
                contador-1,negatius,positius);
        }
       
}
