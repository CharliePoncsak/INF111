/*
 * @DiviseursPremiers   1.0 07/09/2020
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
        Ce programme trouve le nombre de diviseurs premiers
        d'un entier positif N.
 * 
 * @version
        1.0 7 Sep 2020  *  @Charlie Poncsak    */

public class DiviseursPremiers{
    
        /**/
    
    public static Scanner clavier = new Scanner(System.in);

    public static void main(){
     
            /** .*/
        
        /// valeur de l'entier
        int entierPositif;
        
        /// valeur des diviseurs
        double diviseur = 2;
        
        /// Savoir si le nombre n'est pas premier
        int nombreDiviseursPremiers = 0;
        
        /// Savoir si le nombre n'est pas premier
        int diviseursDesDiviseurs;
        
        boolean pasPremier;
            ///Sollicitation de la question
        
        System.out.println("Entrer un entier positif  : ");
            entierPositif = clavier.nextInt();
        System.out.println();
        
            /// Vérification de l'entier donné
            
        while (entierPositif <= 0){
            
            System.out.println("Erreur");
            System.out.println("Entrer un entier positif  : ");
                entierPositif = clavier.nextInt();
            System.out.println();
        
        }
        
            /// L'entier est testé pour savoir s'il est positif
        
        
        while (diviseur <= entierPositif){ 
            
            pasPremier = false;
            diviseursDesDiviseurs = 2;
            
            while (diviseursDesDiviseurs <= diviseur / 2){
                
                if (diviseur % diviseursDesDiviseurs == 0){
                    
                    pasPremier = true;
                    
                }
                
                diviseursDesDiviseurs++;
                
            }
            
            if (!pasPremier){
                
                nombreDiviseursPremiers++;
                
            }
            
            diviseur++;
            
        }
            
         
            ///Réponse à la question
        
        System.out.println("Le nombre de diviseurs premiers est " + nombreDiviseursPremiers);
            System.out.println();
            
        
    }
}