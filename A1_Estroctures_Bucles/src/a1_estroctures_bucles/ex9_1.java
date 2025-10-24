/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_bucles;

import java.util.Scanner;

/**
 *
 * @author nulomi
 */
public class ex9_1 {

    public static void main(String[] args) {
        int aprovat = 0, contador = 0;
        boolean nota10 = false;
        String missatge = "";
        Scanner in = new Scanner(System.in);

        for (int num = -2; num != -1;) {
            System.out.println("introdueix nota= ");
            num = in.nextInt();
            if (num > 5) {
                aprovat++;
            }
            if (num == 10) {
                nota10 = true;
            }
            contador++;
        }
        missatge = "Les notes llegides son " + contador;
        //System.out.println("Les notes llegides son " + contador);
        if (nota10) {
            missatge += ". Hi ha notes de 10. ";

            //System.out.println("Hi ha notes de 10. ");
        } else {
            missatge += " No hi ha notes de 10. ";

            //System.out.println("No hi ha notes de 10. ");
        }
        missatge += "Les notes aprobadas han tingut un nombre de " + aprovat;
        System.out.println(missatge);
        //System.out.println("Les notes aprobadas han tingut un nombre de " + aprovat);

    }
}
