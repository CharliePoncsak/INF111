///Package DateJours;
/************************
Ce programme donne ton age en jour lorsque tu lui donne ton age en années.

Author: @Charlie Poncsak   
Version: V1.0
Date: 3 Septembre 2020
************************/
import java.util.Scanner;

public class DateJours{

    public static Scanner clavier = new Scanner(System.in);
    
    ///Constantes
    
    public static final int ANNEEMAX = 100;
    
    
    public static void main(String[] args){
        
        ///Variables
        
        int annee;
        int jours;
        
        ///La questions, sollicitation de l'age
        
        System.out.println("Quel age a-tu ?  : ");
        annee = clavier.nextInt();
        
        ///Validation de l'age
        
        while (annee >= ANNEEMAX){
                System.out.println("Menteur! Quel age a-tu ?  : ");
                annee = clavier.nextInt();
        }
        
        ///Calcul du nb de jours
        
        jours = 365*annee - annee/4;
        
        System.out.println("Vous avez vecu " + jours + " jours! Bravo!");
        
    }
    
    
}
