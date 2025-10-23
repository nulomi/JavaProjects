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
public class ex10 {
    public static void main(String[] args) {
     double horesTreballades,salariBrut,salariNet;
        Scanner in = new Scanner(System.in);
        System.out.println("introdueix numero de hores treballades: ");
        horesTreballades=in.nextDouble();
        salariBrut=0;
        salariNet=0;
        if(horesTreballades<=130){
        salariBrut=horesTreballades*15;
        }
        if(horesTreballades>130){
        salariBrut=130+(horesTreballades-130)*22.5;   
        }
        if(salariBrut<=500){
            System.out.println("El teu salari net ha sigut: "+salariBrut);
        }
        if(salariBrut <= 900){
            salariNet= 500 + (salariBrut-500) * 0.75;
            System.out.println("El teu salari net ha sigut: "+salariNet);
        }
        if(salariBrut>900){
            salariNet=500+(400*0.75)+(salariBrut-900)*0.55;
            System.out.println("El teu salari net ha sigut: "+salariNet);
        }
    
    }
}
 

    
