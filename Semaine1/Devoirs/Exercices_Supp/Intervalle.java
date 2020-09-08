/*
 * @Intervalle.java      1.0 04/09/2020
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
        Ce programme enumere les nombres entiers dans 
        un interval donne.
 * 
 * @version
        1.0 4 Sep 2020  *  @Charlie Poncsak    */
public class Intervalle{
    
    public static Scanner clavier = new Scanner(System.in);
    
    /// Defini la borne inferieure de l'intervalle
    static int borneInferieure;
    
    /// Defini la borne superieure de l'intervalle
    static int borneSuperieure;
    
    public static void main(String[] args){
            
            ///Declaration des bornes

        System.out.println();
        System.out.println("Indiquer la borne inférieure  : ");
            borneInferieure = clavier.nextInt();
        
        System.out.println("Indiquer la borne supérieure  : ");
            borneSuperieure = clavier.nextInt();
        
            ///Comparaison des bornes
            
        ///if (borneInferieure < borneSuperieure){
            
            
            while ((borneInferieure - 1) < borneSuperieure){
            
                System.out.println(borneInferieure);
            
                borneInferieure++;
            
            } 
        ///}
    }
}