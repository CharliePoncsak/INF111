/*
 * @Factoriel.java      1.1 04/09/2020
 * 
 * Copyright 2020 Charlie Poncsak
 * (mon addresse), Montreal, Canada
 * All rights reserved.
 *
 * (Close des droits d'auteur)
 */


///package edu.factoriel;

import java.util.Scanner;

/**
 * 
        (Description de classe) Ce programme rend la valeur 
        factoriel d'un nombre entier saisi a l'entree.
 * 
 * @version
        1.1 4 Sep 2020  *  @Charlie Poncsak    */
public class Factoriel{ 
    
            /*    (L'implementation de la classe)    */
    
    /**
        Declaration du Scanner pour l'entree des donnees  */
    public static Scanner clavier = new Scanner(System.in);

    /**
        Valeur minimale pour arreter le calcul factoriel.  */
    public static final int MIN_FACTORIEL = 1;
    
    /**
        Valeur donnee par l'utilisateur  */
    static int valeur_lue;
    
    /**
            *   
        Resultat final du calcul,       *
        necessite une valeur initiale     */
    static int factoriel = 1;
    
    /**
        (documentation sur cette methode)        */
    public static void main(String[] args){
    
    /* 
        Sollicitation du nombre a factorialiser   */
    System.out.print("Entrez un nombre  : ");
    valeur_lue = clavier.nextInt();

    /* 
        Factorialisation du nombre   */
    while(valeur_lue >= MIN_FACTORIEL){
        
        factoriel = factoriel * valeur_lue;
        
        valeur_lue = valeur_lue - 1;
        
    }   
    
    ///Reponse litteraire du nombre factorialise
    
    System.out.println("La factorialisation de se nombre donne " + factoriel);
    
    }

}
