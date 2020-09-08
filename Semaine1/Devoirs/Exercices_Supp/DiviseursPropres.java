/*
 * @DiviseursPropres     1.0 05/09/2020
 * 
 * Copyright 2020 Charlie Poncsak
 * (Addresse), Montreal, Canada
 * All rights reserved.
 *
 * (Close des droits d'auteur)
 */

import java.util.Scanner;

/**
 * 
        Ce programme calcul le nombre de diviseurs
        propres d'un entier positif particulier.
 * 
 * @version
        1.0 5 Sep 2020  *  @Charlie Poncsak    */

public class DiviseursPropres{
    
        /**/
    
    public static Scanner clavier = new Scanner(System.in);

    public static void main(){
     
            /** .*/
        
        /// valeur de l'entier positif particulier
        int entier;
        
        /// valeur des diviseurs
        int diviseur = 2;
        
        /// nombre de diviseurs de l'entier
        int produitDiviseurs = 1;
                    
            ///Sollicitation de la question
        
        System.out.println("Entrer un entier positif  : ");
            entier = clavier.nextInt();
        System.out.println();
            
            /// Vérification de l'entier donné
            
        while (entier < 0){
            
            System.out.println("Erreur. Entrer un entier positif  : ");
                entier = clavier.nextInt();
            System.out.println();
            
        }
        
        while (diviseur <= entier / 2){
            
            if (entier % diviseur == 0){
                
                produitDiviseurs = produitDiviseurs * diviseur;

            }
            
            diviseur++;
            
        }
        
        System.out.println("Le produit de ces diviseurs propres est  : " + produitDiviseurs);
        System.out.println();
    
    }
}