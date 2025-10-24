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
public class ex14 {

    public static void main(String[] args) {
        int qeuro,bit500 = 0,bit200 = 0,bit100 = 0,bit50 = 0,bit20 = 0,bit10 = 0,bit5 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix quantitat d'euros: ");
        qeuro = in.nextInt();
        if (qeuro % 5 != 0 || 0 < qeuro) {
            for (; 500 > qeuro; bit500++) {
                qeuro -= 500;
            }
            for (; 200 > qeuro; bit200++) {
                qeuro -= 200;
            }
            for (; 100 > qeuro; bit100++) {
                qeuro -= 100;
            }
            for (; 50 > qeuro; bit50++) {
                qeuro -= 50;
            }
            for (; 20 > qeuro; bit20++) {
                qeuro -= 20;
            }
            for (; 10 > qeuro; bit10++) {
                qeuro -= 10;
            }
            for (; 5 > qeuro; bit5++) {
                qeuro -= 5;
            }
            System.out.println("El resulatat deEls billets utilizats de 500 son\n" + bit500
                    + "Els billets utilizats de 200 son\n"+bit200
                    + ",Els billets utilizats de 100 son \n"+bit100
                    + ",Els billets utilizats de 50 son \n"+bit50
                    + ",Els billets utilizats de 20 son \n"+bit20
                    + ",Els billets utilizats de 10 son \n"+bit10
                    + "Els billets utilizats de 5 son \n"+bit5);
        } else if (0 == qeuro) {
            System.out.println("no has introduit nungun numero per tant la maquina ");
        } else {
            System.out.println("torna a iniciar quantitat en euros: ");
        }
    }
}
