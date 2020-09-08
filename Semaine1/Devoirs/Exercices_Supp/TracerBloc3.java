/**
 * Ce programme trace les valeurs de trois differentes variables tout au long d'un calcul simple
 * 
 * Auteur: Charlie Poncsak 
 * 4 Septembre 2020
 * V1.0
 */

public class TracerBloc3{

    ///Mes différentes donnee
        
    public static int a = 5701436;
    public static int c = 0;
    
    public static void main(String[] args){
        
        ///Introduction du sujet du programme a l'utilisateur
        
        System.out.println("Bienvenue au calcul de l'exercice supplementaire 1 du cours INF111");
        
        ///Calcul des differentes valeurs
        
        while(a > 0){
        
            ///Affichage des valeurs de la table
            
            System.out.println("a = " + a);
            System.out.println("c = " + c);
            System.out.println();
            
            ///Calcul de la table
            
            if ((a%10) > 5){
            
                c = c + 1;
                
            }
            
            a = a/10;
        
        }    
        
        ///Affichage des valeurs finales
        
        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("Termine");
        
    } 
}
