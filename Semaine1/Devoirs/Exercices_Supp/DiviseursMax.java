/*
 * @DiviseursMax     1.0 05/09/2020
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
        Ce programme trouve l'entier ayant un maximum de diviseurs
        dans un intervalle donné.
 * 
 * @version
        1.0 5 Sep 2020  *  @Charlie Poncsak    */

public class DiviseursMax{
    
        /**/
    
    public static Scanner clavier = new Scanner(System.in);

    public static void main(){
     
            /** .*/
        
        /// valeur de la borne supérieure
        int borneSuperieure;
        
        /// valeur de la borne inférieure
        int borneInferieure;
        
        /// valeur des diviseurs
        int diviseur;
        
        /// nombre de diviseurs de l'entier
        int nombreDiviseurs;
                    
        /// l'entier avec un maximum de diviseurs
        int diviseurMax = 0;
        
        /// le maximum de diviseurs
        int nombreDiviseursMax = 0;
        
            ///Sollicitation de la question
        
        System.out.println("Entrer la borne inférieure  : ");
            borneInferieure = clavier.nextInt();
        System.out.println();
            
        System.out.println("Entrer la borne supérieure  : ");
            borneSuperieure = clavier.nextInt();
        System.out.println();
        
            /// Vérification de l'entier donné
            
        while (borneInferieure >= borneSuperieure){
            
            System.out.println("Erreur");
            
            System.out.println("Entrer la borne inférieure  : ");
                borneInferieure = clavier.nextInt();
            System.out.println();
            
            System.out.println("Entrer la borne supérieure  : ");
                borneSuperieure = clavier.nextInt();
            System.out.println();
                
        }
        
            /// L'entier ayant un maximum de diviseurs est calculé
        
        while (borneInferieure <= borneSuperieure){
            
            diviseur = nombreDiviseurs = 1;
            
            while (diviseur <= borneInferieure / 2){
                
                if (borneInferieure % diviseur == 0){
                    
                    nombreDiviseurs++;
                    
                }
                
                diviseur++;
                
            }
            
            if (nombreDiviseurs > nombreDiviseursMax){
                
                nombreDiviseursMax = nombreDiviseurs;
                diviseurMax = borneInferieure;
                
            }
            
            borneInferieure++;
            
        }

            ///Réponse à la question
        
        System.out.println("L'entier ayant un maximum de diviseurs dans ");
        System.out.println("cet intervalle est " + diviseurMax);
        System.out.println("Il a " + nombreDiviseursMax + " diviseurs"); 
        System.out.println();
    
    }
}