/**
* Ce programme trouve et affiche tous les diviseurs d'un entier positif.
*
* @Charlie Poncsak
* @1.0 4 Sept 2020
*/

import java.util.Scanner;

public class Diviseurs{
    
    public static Scanner clavier = new Scanner(System.in);
    
    /*
     *  Cette variable est le nombre pour lequel
     *  nous cherchons les diviseurs.
     */
    public static int nombreADiviser;

    ///Cette variable est les diviseurs.
    public static int diviseurs;
    
    /// permet de repeter la question plusieurs fois
    public static boolean question = true;
    
    public static void main(){

        /*
         * Les diviseurs vont être calculées en trouvant lesquels 
         * des nombres en-dessous ou équivalent à la moitié du 
         * nombre à diviser donne une valeur en modulo.*/
    
        while (question = true){
            
            diviseurs = 1;
            
            System.out.println("Entrer une valeur  : ");
                nombreADiviser = clavier.nextInt();
            System.out.println();
                
            while (diviseurs <= nombreADiviser / 2){
    
                if ((nombreADiviser %diviseurs) <= 0){
                    
                    System.out.println(diviseurs);
                    
                }
                
                diviseurs ++;
                
                ///System.out.println(nombreASeparer);
                
            }
        }
    }
}
