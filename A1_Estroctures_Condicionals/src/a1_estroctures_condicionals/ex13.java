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
public class ex13 {
    public static void main(String[] args) {
        //Define variables
        double euros,yen,libras,pesos,dolares;
        int menu;
        Scanner entrada = new Scanner(System.in);
        //Inicio de programa
        System.out.print("Dime los euros que quieres cambiar: ");
        euros = entrada.nextDouble();
        System.out.println("A que lo quieres cambiar?");
        System.out.println("Opciones: 1 = Dolares | 2 = Yen | 3 = Libras | 4 = Pesos");
        menu = entrada.nextInt();
        //Condicion y fin
        switch (menu){
            case 1: 
                dolares = euros * 1.17;
                System.out.printf("El cambio de estos Euros %.2f a Dolares es %.2f\n",euros,dolares);
                break;
            case 2: 
                yen = euros * 174.89;
                System.out.printf("El cambio de estos Euros %.2f a Yen es %.2f\n",euros,yen);
                break;
            case 3: 
                libras = euros * 0.87;
                System.out.printf("El cambio de estos Euros %.2f a Libras es %.2f\n",euros,libras);
                break;
            case 4: 
                pesos = euros * 1565.24;
                System.out.printf("El cambio de estos Euros %.2f a Pesos es %.2f\n",euros,pesos);
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
