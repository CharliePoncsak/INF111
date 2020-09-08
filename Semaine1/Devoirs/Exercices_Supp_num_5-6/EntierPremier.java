/*
 * @EntierPremier   1.0 07/09/2020
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
        Ce programme trouve si un entier positif N
        est premier.
 * 
 * @version
        1.0 7 Sep 2020  *  @Charlie Poncsak    */

public class EntierPremier{
    
        /**/
    
    public static Scanner clavier = new Scanner(System.in);

    public static void main(){
     
            /** .*/
        
        /// valeur de l'entier
        int entierPositif;
        
        /// valeur des diviseurs
        int diviseur = 2;
        
        /// Savoir si le nombre n'est pas premier
        boolean pasPremier = false;
        
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
        
        //while (!pasPremier){
            
            while (diviseur <= entierPositif / 2){
                
                if (entierPositif % diviseur == 0){
                    
                    pasPremier = true;
                    
                }
                
                diviseur++;
                
            }
        //}
            
         
            ///Réponse à la question
        
        if (!pasPremier){
            
            System.out.println("L'entier est premier");
                System.out.println();
            
        } else {
            
            System.out.println("L'entier n'est pas premier");
                System.out.println();
            
        }
        
    
    }
}