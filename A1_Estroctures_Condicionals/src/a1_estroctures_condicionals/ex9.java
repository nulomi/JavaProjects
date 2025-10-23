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
public class ex9 {

    public static void main(String[] args) {
        double horaA, minA, segA, segAf,horaAf,minAf;
        Scanner entrada = new Scanner(System.in);
        System.out.print("introdueix el valor de hores actuals ");
        horaA = entrada.nextDouble();
        System.out.print("introdueix el valor de minuts actuals ");
        minA = entrada.nextDouble();
        System.out.print("introdueix el valor de segons actuals ");
        segA = entrada.nextDouble();
        System.out.print("introdueix el valor de segons afegides ");
        segAf = entrada.nextDouble();
        horaAf=0;
        minAf=0;
        if(segAf<60){
        segA+=segAf;
        minA+=minAf;
        horaA+=horaAf;
         if(segA>=60){
                     segA-=60;
                     minA++;
                      if(minA>60){
                            minA-=60;
                            horaA++;
                            if(horaA>=24){
                                horaA-=24;
                            }else{
                                System.out.print("Les hora, minuts i segons que seran, transcorreguten un temps especificat son: "+horaAf+minAf);
                                }
        }
        else{
        System.out.print("Calculo hores, minuts i segons del tempsAfegit ");
        minAf=segAf/60;
        segAf=segAf%60;
            if(minAf>=60){
            System.out.print("Calculo hores i minuts del tempsAfegit ");
            horaAf=minAf/60;
            minAf=segAf%60; 
            segA+=segAf;
            minA+=minAf;
            horaA+=horaAf;
                     if(segA>=60){
                     segA-=60;
                     minA++;
                      if(minA>60){
                            minA-=60;
                            horaA++;
                            if(horaA>=24){
                                horaA-=24;
                            }else{
                                System.out.print("Les hora, minuts i segons que seran, transcorreguten un temps especificat son: "+horaAf+minAf);
                                }
            }
            else{
            segA+=segAf;
            minA+=minAf;
            horaA+=horaAf;
                     if(segA>=60){
                     segA-=60;
                     minA++;
                      if(minA>60){
                            minA-=60;
                            horaA++;
                            if(horaA>=24){
                                horaA-=24;
                            }else{
                                System.out.print("Les hora, minuts i segons que seran, transcorreguten un temps especificat son: "+horaAf+minAf);
                                }
                     }
                     else{
                            if(minA>60){
                            minA-=60;
                            horaA++;
                            if(horaA>=24){
                                horaA-=24;
                            }else{
                                System.out.print("Les hora, minuts i segons que seran, transcorreguten un temps especificat son: "+horaAf+minAf);
                                }
                            }
                            else{
                                if(horaA>=24){
                                horaA-=24;
                                } else{
                                System.out.print("Les hora, minuts i segons que seran, transcorreguten un temps especificat son: "+horaAf+minAf);
                                }
                                }
                            }
                     }    
            }
        }
    }

                     }
            }
                           
  }
                      }
         }


    
