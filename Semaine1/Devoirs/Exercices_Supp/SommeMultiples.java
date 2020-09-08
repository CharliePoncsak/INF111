/*
 * @SommeMultiples      1.0 05/09/2020
 * 
 * Copyright 2020 Charlie Poncsak
 * (Addresse), Montreal, Canada
 * All rights reserved.
 *
 * (Close des droits d'auteur)
 */

import java.util.Scanner;
import java.lang.Math;

/**
 * 
        Ce programme calcul la somme des entiers multiples de 11 ou
        dont le sinus est supérieur à 0.68467711 dans un intervalle
        donné. 
 * 
 * @version
        1.0 5 Sep 2020  *  @Charlie Poncsak    */
public class SommeMultiples{
    
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
             * La somme des entiers est calculée en vérifiant si la division
             * de la borne inférieure par 11 donne un reste et si son sinus
             * est supérieur à 0.68.
             * 
             * La borne inférieure est ensuite incrémentée de 1.*/
        
        while (question){
            
            sommeIntervalle = 0;
            
                ///Déclaration des bornes
            
            System.out.println("Entrer la borne inférieure  : ");
                borneInferieure = clavier.nextInt();
            System.out.println("Entrer la borne supérieure  : ");
                borneSuperieure = clavier.nextInt();
            System.out.println();
                
            if (borneSuperieure > borneInferieure){
                
                while (borneSuperieure >= borneInferieure ){
                        
                    if (borneInferieure %11 == 0 || Math.sin(borneInferieure) > 0.68467711){
                        
                        sommeIntervalle = sommeIntervalle + borneInferieure;
                        
                    }
             
                    borneInferieure++;

                }
                
                System.out.println("La somme est  : " + sommeIntervalle);
                
            }
        }
    }
}