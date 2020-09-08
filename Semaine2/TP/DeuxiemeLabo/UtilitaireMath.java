/**
 * Write a description of class UtilitaireMath here.
 *
 * @Charlie Poncsak
 * @08 09 2020
 */
public class UtilitaireMath{
    
    /*
     * Fonction permettant le calcul du nombre factoriel
     * d'un entier entré par l'usager.
     * 
     * "param valeurLue (ce que la valeur fait), facto ()
     * /return false
     */
    
    /*int calculFactoriel = new calculFactoriel(){
        
        //variables
        private int 1;
    
        ///Multiplication du factoriel ..
        while( i <= valeur){
                    factoriel = factoriel * i;
    
                    //on prend soin de faire varier la variable-compteur (ou iterateur)
                    i++;
                }
        
    
            return ;
        }*/
    
    
    /*
     * Fonction permettant le calcul de la racine carree
     * d'un entier entré par l'usager.
     * 
     * "param x (la racine carrée), a (nombre saisi)
     * /return x, a
     */
    public static double racineCarree(double x,double  a){ 
        
        /// La racine carrée est calculée en ...
        while (x * x - a > RacineCarree.PRECISION) {
                        x = x / 2 + a / (x + x);
                    }
           
        /// Les valeurs sont renvoyés au programme principal
        return x;
        
            }
}
