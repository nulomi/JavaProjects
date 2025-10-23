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
public class ex12 {
    public static void main(String[] args) {
        //Define Variable
        char color;
        Scanner entrada = new Scanner(System.in);
        // Inicio de programa
        System.out.print("Dime el color del semáforo R = Rojo, A = Amarillo y V = Verde: ");
        color = entrada.next().charAt(0);
        //Condicion y fin
        switch (color){
            case 'R': 
                System.out.println("No pasar, semáforo en rojo!!");
                break;
            case 'A':
                System.out.println("Corre!!! con cuidado");
                break;
            case 'V':
                System.out.println("Puedes pasar");
                break;
            default:
                System.out.println("La respuesta no es ninguna de estas R = Rojo, A = Amarillo y V = Verde");
                break;
        }
    }
}
