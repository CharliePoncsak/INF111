/*
 * @NombreDiviseurs      1.0 05/09/2020
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
        d'un entier positif particulier.
 * 
 * @version
        1.0 5 Sep 2020  *  @Charlie Poncsak    */

public class NombreDiviseurs{
    
        /**/
    
    public static Scanner clavier = new Scanner(System.in);

    public static void main(){
     
            /** .*/
        
            /// permet de répéter la question plusieurs fois.
        boolean question = true;
        
        /// valeur de l'entier positif particulier
        int entier;
        
        /// valeur des diviseurs
        int diviseur;
        
        /// nombre de diviseurs de l'entier
        int nombreDiviseurs;
            
        while (question){
            
            diviseur = 1;
            nombreDiviseurs = 1;
            
                ///Déclaration des bornes
            
            System.out.println("Entrer un entier positif  : ");
                entier = clavier.nextInt();
            System.out.println();
                
            while (diviseur <= entier / 2){
                
                if (entier % diviseur == 0){
                    
                nombreDiviseurs++;

                }
                
                diviseur++;
                
            }
            
            System.out.println("Ce nombre a " + nombreDiviseurs + " diviseurs");
            System.out.println();
        }
    }
}