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
        
        ///Mes différentes donnee
            
        public static int n = 5;
        public static int p = 1;
        public static int w = 0;
        
        public static void main(String[] args){
            
            ///Introduction du sujet du programme a l'utilisateur
            
            System.out.println("Bienvenue au calcul de l'exercice supplementaire 1 du cours INF111");
            
            ///Calcul des differentes valeurs
            
            while(n > 0){
            
                ///Affichage des valeurs de la table
                
                System.out.println("n = " + n);
                System.out.println("p = " + p);
                System.out.println("w = " + w);
                System.out.println();
                
                ///Calcul de la table
                
                p = p * n;
                w = w + p / n;
                n = n - 1;
            
            }    
            
            ///Affichage des valeurs finales
            
            System.out.println("n = " + n);
            System.out.println("p = " + p);
            System.out.println("w = " + w);
            System.out.println("Termine");
            
        } 
}
