/**
* Trois donnees vont passer a travers des calculs, et leurs valeurs vont etre
* notees visuellement
*
* @Charlie Poncsak
* @v1.0 4 Sept 2020
*/
    
public class TracerBloc4{
    
    /// Donnees et leurs valeurs initiales
    public static int n1 = 210;
    public static int n2 = 67900;
    public static int p = 1;
    
    /**
    * Calcul des differentes valeurs de la table
    */
    public static void main(String[] args){
        
        System.out.println("Voici une magnifique table de valeurs n1, n2 et p");
        
        ///Calcul de la table
        
        while (p !=0){
            
            System.out.println("n1 = " + n1);
            System.out.println("n2 = " + n2);
            System.out.println("p = " + p);
            System.out.println();
            
            p = n1 % n2;
            n1 = n2;
            n2 = p;
                
        }
                    
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("p = " + p);            
        System.out.println("Termine");
        
        }
    }
