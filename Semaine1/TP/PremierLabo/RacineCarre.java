/**********************
 * Ce programme donne la racine carre d'un nombre saisi
 * 
 * Auteur: Charlie Poncsak
 * V1.0
 * Date: 3 Septembre 2020 
 */

import java.util.Scanner;
import java.math.*;

public class RacineCarre{

    public static Scanner clavier = new Scanner(System.in);

    public static final double EPSILON = 0.00001;
    
    public static final int CARRE = 2;
    
    public static void main(String[] args){
    
        int valeur_lu;       ///a
        double valeur_carre;    ///x
    
        ///Sollicitation du nombre a elever au carre
        
        System.out.print("Ecrivez un nombre  : ");
        valeur_lu = clavier.nextInt();
        
        
        ///Calcul du carre de la valeur saisi
        
        valeur_carre = valeur_lu;

        while ((Math.pow(valeur_carre,CARRE) - valeur_lu) > EPSILON){
        
        valeur_carre = valeur_carre/CARRE + valeur_lu/(CARRE*valeur_carre);
            
        }
        
        ///Reponse
        
        System.out.println();
        System.out.printf("Le carre de ce nombre est %1.2f", valeur_carre);
        
    }
    
}
