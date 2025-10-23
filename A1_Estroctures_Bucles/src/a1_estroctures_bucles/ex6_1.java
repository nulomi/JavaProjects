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
public class ex6_1 {
      public static void main(String[] args) {
    //Crear variable
        int N,negativos=0,positivos=0;
          Scanner entrada = new Scanner(System.in);
          System.out.println("cunatos numeros quieres pedir: ");
            N =entrada.nextInt();
//Inicio del programa
        for (int i = 1; i < 101; i++) {
            System.out.print("Dime un número %d: ",i);
            N = entrada.nextInt();
            if (N<0) {
                negativo = true;
            }
            if (N==0){
                 System.out.println("Has introducido un número nulo (0), vuelve a ingresar otro número");
                 i--;
            }
        }
        if (N < 0) {
           negativos++;
        }
        else{
           positivos++;
        }
          System.out.println("De %d numeros introduidos, "+ "%d son negativos y %d positivos\n",num,negativos,positivos);
    }
}

}
