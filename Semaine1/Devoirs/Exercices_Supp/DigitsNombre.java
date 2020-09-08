/*
 * @DigitsNombre      1.0 04/09/2020
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
        Ce programme enumere chaque chiffre d'un
        nombre par unite
 * 
 * @version
        1.0 4 Sep 2020  *  @Charlie Poncsak    */
public class DigitsNombre{
    
    public static Scanner clavier = new Scanner(System.in);
    
    /// permet de repeter la question plusieurs fois
    public static boolean question = true;
    
    /// valeur a separer par unite
    public static int nombreASeparer;
    
        public static void main(){
     
            /*
             * Les unites sont affichee en calculant le modulo du nombre.
             * Le nombre est ensuite divise par dix et ses unités sont
             * réaffichées jusqu'a ce qu'il atteigne zéro.*/
        
        while (question = true){
            
            System.out.println("Entrer une valeur  : ");
                nombreASeparer = clavier.nextInt();
            
            System.out.println();
                
            while (nombreASeparer > 0){
    
                System.out.println(nombreASeparer %10);
                
                nombreASeparer = nombreASeparer / 10;
                
                ///System.out.println(nombreASeparer);
                
            }
        }
    }
}