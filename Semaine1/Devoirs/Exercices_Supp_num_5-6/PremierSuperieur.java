/*
 * @PremierSuperieur   1.0 07/09/2020
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
        Ce programme affiche le prochain nombre premier
        supérieur à un entier donné.
 * 
 * @version
        1.0 7 Sep 2020  *  @Charlie Poncsak    */

public class PremierSuperieur{
    
        /**/
    
    public static Scanner clavier = new Scanner(System.in);

    public static void main(){
     
            /** .*/
        
        /// valeur de l'entier
        int entier;
        
        /// le prochain nombre premier
        double premierSuperieur;
        
        /// Savoir si le nombre est premier
        boolean premier = false;
        
        /// Savoir si le nombre n'est pas premier
        boolean pasPremier;
        
        /// Les diviseurs du nombre
        int diviseurs;
        
            ///Sollicitation de la question
        
        System.out.println("Entrer un entier positif  : ");
            entier = clavier.nextInt();
        System.out.println();
        
            /// Vérification de l'entier donné
            
        while (entier <= 0){
            
            System.out.println("Erreur");
            System.out.println("Entrer un entier positif  : ");
                entier = clavier.nextInt();
            System.out.println();
        
        }
        
            /* L'entier est testé pour savoir s'il est positif
                Le prochain nombre premier est ensuite trouvé.    */
        
        premierSuperieur = entier;
                
        while (!premier){ 
            
            premierSuperieur++;
            pasPremier = false;
            diviseurs = 2;
            
            while (diviseurs <= premierSuperieur / 2){
                
                if (premierSuperieur % diviseurs == 0){
                    
                    pasPremier = true;
                    
                }
                
                diviseurs++;
                
            }
            
            if (!pasPremier){
                
                premier = true;
                
            }
        }
            
        
            ///Réponse à la question
        
        System.out.println("Le prochain nombre premier est " + premierSuperieur);
            System.out.println();
            
        
    }
}