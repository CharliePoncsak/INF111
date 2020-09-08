/********************************
 * FACTORIEL
 *
 *
 * @author Pierre Belisle
 * @version Aout 2005
 * @derniere mise e jour : janvier 2014
 *
 */
import java.util.Scanner;

public class Factoriel{

    /*********************
     * CONSTANTES
     *********************/
    //Sert e ne pas multiplier par 1 inutilement.  Au depart, on commence e 2
    public static final int VALEUR_DEPART = 2;

    //Caracteres speciaux d'affichage
    public static final String EFFACE_ECRAN = "\f";
    public static final String SAUTER_LIGNE = "\n";

    //Messages
    public static final String MSG_SOLLIC_VALEUR = "Entrez le nombre dont vous voulez le factoriel : ";

    public static final String MSG_RESULTAT = "Le factoriel de ";
    public static final String LIAISON = " est ";

    public static final String MSG_CONTINUER = SAUTER_LIGNE + SAUTER_LIGNE + SAUTER_LIGNE +
        "Voulez-vous faire une autre demande de calcul (n pour quitter)? : ";

    public static final String MSG_AU_REVOIR = "Merci d'avoir utilise le programme de calcul" +
        "du factoriel et e la prochaine";

    //Reponse possible
    public static final String MSG_NON = "n";

    /**
     * Programme qui affiche le factoriel d'un nombre (en mode console)
     *
     * Voir enonce de laboratoire 1 pour details.
     */
    public static void main(String[] args) {


        /******************************************
         * Programme principal
         *******************************************
         * Strategie : Le calcul du fatoriel se realise en mettant 2 dans une variable
         *             et dans une boucle WHILE toutes les valeurs que
         *             prendra la variable entre elles sont multiplies jusqu'e
         *             la valeur fournie par l'utilisateur inclusivement.
         *
         *             Le resultat sera mis dans une autre variable initialisee e 1 au depart.
         *
         *
         *             Le programme se termine seulement si l'utilisateur repond MSG_NON au MSG_CONTINUER
         */
        //pour la lecture au clavier
        Scanner clavier = new Scanner(System.in);

        //valeur e lire
        int valeur;

        //sert au calcul du factoriel
        int factoriel;

        //sera mise e vrai lorsque l'utilisateur repond non
        boolean fini  = false;

        while(!fini) {

            //efface l'ecran
            System.out.print(EFFACE_ECRAN);

            //saisie de la valeur
            System.out.print(MSG_SOLLIC_VALEUR);
            valeur = clavier.nextInt();

            //sert e retenir le resultat des multiplications
            factoriel = 1;

            //on commence e deux pour sauver une multiplication inutile par 1.
            int i = VALEUR_DEPART;

            //On cumule toutes les valeurs entre elles
            
            UtilitaireMath.calculFactoriel();
            /*
             * Si vous avez decide d'utiliser l'autre algorithme
             *
             * while (valeur > 1){
             *         factoriel = factoriel * valeur;
             *         valeur--;
             * }
             *
             */

            System.out.print(MSG_RESULTAT + valeur + LIAISON + factoriel);

            //demande si l'utilisateur veut continuer
            System.out.print(MSG_CONTINUER);
            String reponse = clavier.next();

            //si l'utilisateur repond non, c'est qu'il veut quitter
            if (reponse.equals(MSG_NON))
                fini = true;

        }

        //efface l'ecran et message de fin
        System.out.print(EFFACE_ECRAN);
        System.out.println(MSG_AU_REVOIR);

    }


}
