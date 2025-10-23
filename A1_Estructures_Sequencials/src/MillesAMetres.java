
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nlo7503
 */
public class MillesAMetres {
    public static void main(String[] args) {
         final double MILLES_A_METRES = 1852;//factor conversió constant
         Scanner lector = new Scanner(System.in);  
         //llegir distància en milles
         System.out.println("Entra la distància en milles:");
         double distanciaEnMilles = lector.nextDouble();
          //calcular conversió de milles a metres
        double distanciaEnMetres = distanciaEnMilles * MILLES_A_METRES;
         //imprimir resultat a l'usuari
        System.out.println(
          distanciaEnMilles + " milles equivalen a " 
                  + distanciaEnMetres + " metres ");
    }
}
