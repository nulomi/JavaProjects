/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici;
import java.util.Scanner;
/**
 *
 * @author nlo7503
 */
public class ex5 {
    public static void main(String[] args) {
         //declarar les variables
        double preu_original,preu_rebaixat,descompte;
        Scanner entrada=new Scanner(System.in);
         //funcionament del main
         System.out.println("Introdueix elpreu oroiginal i  preu rebaixat : "); 
         preu_original = entrada.nextDouble();
         preu_rebaixat = entrada.nextDouble();
         descompte=100-((preu_rebaixat*100)/preu_original);
         System.out.printf("El descompte aplicat a un producte que val %.2f/%.2f=%.2f\n",preu_rebaixat,preu_original,descompte);
    }
}