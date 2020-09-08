/*
 * @SommeEntiers      1.0 05/09/2020
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
        Ce programme calcul la somme des entiers dans un intervalle. 
 * 
 * @version
        1.0 5 Sep 2020  *  @Charlie Poncsak    */
public class SommeEntiers{
    
    public static Scanner clavier = new Scanner(System.in);
    
    /// permet de répéter la question plusieurs fois.
    public static boolean question = true;
    
    /// valeur de la borne inférieure.
    public static int borneInferieure;
    
    /// valeur de la borne supérieure.
    public static int borneSuperieure;
    
    /// valeur de la somme de l'intervalle.
    public static int sommeIntervalle;
    
        public static void main(){
         
                /**
                 * La somme des entiers est calculée en additionnant le nombre
                 * inférieur à la somme des entiers et en l'incrémentant de 1.*/
            
            while (question){
                
                sommeIntervalle = -1;
                
                    ///Déclaration des bornes
                
                System.out.println("Entrer la borne inférieure  : ");
                    borneInferieure = clavier.nextInt();
                System.out.println("Entrer la borne supérieure  : ");
                    borneSuperieure = clavier.nextInt();
                System.out.println();
                    
                while (borneSuperieure > borneInferieure){
                    
                    sommeIntervalle = sommeIntervalle + borneInferieure;
                        
                    borneInferieure++;
                    
                }
                
                System.out.println("La somme est  : " + sommeIntervalle);
                
            }
    }
}