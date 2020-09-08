/**********************
 * RacineCarree
 * 
 * Auteur: Charlie Poncsak
 * V1.0
 * Date: 3 Septembre 2020 
 */

import java.util.Scanner;
import java.math.*;

public class RacineCarree{

    public static Scanner clavier = new Scanner(System.in);

    
    ///Determine le niveau de precision voulue dans la reponse
    public static final double EPSILON = 0.00001;
    
    ///Messages
    public static final String MSG_SOL = 
    "Ecrivez un nombre  : ";

    public static final String MSG_RESULTAT =
    "Le carre de ce nombre est %1.2f";
    
    ///
    public static final int CARRE = 2;
    
    public static void main(String[] args){
    
        ///nombre saisi
        int valeur_lu;       ///a
        
        ///contiendra la racine carree
        double valeur_carre;    ///x
        
        ///Sollicitation du nombre a elever au carre
        
        System.out.print(MSG_SOL);
        valeur_lu = clavier.nextInt();
        
        
        ///Calcul du carre de la valeur saisi
        
        valeur_carre = valeur_lu;

        while ((Math.pow(valeur_carre,CARRE) - valeur_lu) > EPSILON){
        
        valeur_carre = valeur_carre/CARRE + valeur_lu/(CARRE*valeur_carre);
            
        }
        
        ///Reponse
        
        System.out.println(MSG_RESULTAT);
        System.out.printf(, valeur_carre);
        
    }
    
}
