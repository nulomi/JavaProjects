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
public class ex9_1 {

    public static void main(String[] args) {
        int horaActual, minActual, segActual, tempsAfegir, horaAfegir, minAfegir,segAfegir;
        Scanner entrada = new Scanner(System.in);
        System.out.print("introdueix el valor de hores actuals ");
        horaActual = entrada.nextInt();
        System.out.print("introdueix el valor de minuts actuals ");
        minActual = entrada.nextInt();
        System.out.print("introdueix el valor de segons actuals ");
        segActual = entrada.nextInt();
        System.out.print("introdueix el valor de segons a afegir ");
        tempsAfegir = entrada.nextInt();
        minAfegir=0;
        horaAfegir=0;
        segAfegir=0;
        if(tempsAfegir>60){
            horaAfegir=tempsAfegir/3600;
            tempsAfegir=tempsAfegir%3600;
            minAfegir=tempsAfegir/60;
            tempsAfegir=tempsAfegir%60;
            segAfegir=tempsAfegir;  
        }else{
            segAfegir=tempsAfegir;
        }
        horaActual+=horaAfegir;
        minActual+=minAfegir;
        segActual+=segAfegir;
        if(segActual>60){
            segActual=-60;
            minActual++;
        }
        if(minActual>=60){
            minActual=-60;
            horaActual++;
        }
        if(horaActual>=24){
            horaActual=-24;
        }
        System.out.println("Hola transcurregut el temps especificat seran hores:"
                + horaActual+" minuts:"+minActual+" segons: "+segActual);
            
            
                
                
    
    
    
    }
}
       