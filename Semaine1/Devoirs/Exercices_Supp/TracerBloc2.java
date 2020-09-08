/**
 * Ce programme trace les valeurs de trois differentes variables tout au long d'un calcul simple
 * 
 * Auteur: Charlie Poncsak 
 * 4 Septembre 2020
 * V1.0
 */

public class TracerBloc2{

    ///Mes différentes donnee
    
    public static final int BORNE = 13;
    
    public static int w1 = 1;
    public static int w2 = w1;
    public static int fb = w2;
    
    public static void main(String[] args){
        
        ///Introduction du sujet du programme a l'utilisateur
        
        System.out.println("Bienvenue au calcul de l'exercice supplementaire 1 du cours INF111");
        
        ///Calcul des differentes valeurs
        
        while(w2 < BORNE){
        
            ///Affichage des valeurs de la table
            
            System.out.println("w1 = " + w1);
            System.out.println("w2 = " + w2);
            System.out.println("fb = " + fb);
            System.out.println();
            
            ///Calcul de la table
            
            fb = w1 + w2;
            w1 = 2 * w2;
            w2 = w1 + 1;
        
        }    
        
        ///Affichage des valeurs finales
        
        System.out.println("w1 = " + w1);
        System.out.println("w2 = " + w2);
        System.out.println("fb = " + fb);
        System.out.println("Termine");
        
    } 
}
