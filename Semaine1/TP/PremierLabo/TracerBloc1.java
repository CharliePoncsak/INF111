
/**
 * Ce programme trace les valeurs de trois differentes variables tout au long d'un calcul simple
 * 
 * Auteur: Charlie Poncsak 
 * 3 Septembre 2020
 * V1.0
 */

import java.util.Scanner;

public class TracerBloc1{
    
    
    public static Scanner clavier = new Scanner(System.in);
    
    
    public static void main(String[] args){
    
        ///Mes différentes donnee
        
        int n = 5;
        int p = 1;
        int w = 0;
        
        ///le tableau
        
        Object[][] table = new String[4][];
        
        ///Introduction du sujet du programme a l'utilisateur
        
        System.out.println("Bienvenue au bon calcul de l'exercice supplementaire 1 du cours INF111");
        System.out.println();
        
        
        ///Calcul des differentes valeurs
        
        while(n > 0){

            p = p * n;
            w = w + p / n;
            n = n - 1;
        
        }
        
            ///Presentation de la table de valeurs
        
            table[0] = new int[] {n};
            table[1] = new int[] {p};
            table[2] = new int[] {w};
            
            
            for (Object[] row : table) {
                
            System.out.format("%15s%15s%15s\n", row);
            
        }
    } 
}
