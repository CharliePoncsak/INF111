/******************************************************
 * RACINE CARREE
 *
 * @author : Pierre B�lisle
 * @version : septembre 2008
 * derni�re r�vision : janvier 2014
 ******************************************************/
import java.util.Scanner;

public class RacineCarree{

       //*****************************************
       // D�claration du tampon de clavier
       //*****************************************
       public static Scanner clavier = new Scanner(System.in);

       //*****************************************
       // Constantes
       //*****************************************
       //d�termine le niveau de pr�cision voulue dans la r�ponse
       public static final double PRECISION = 0.0000001;


       //messages
       public static final String EFFACE_ECRAN = "\f";
       public static final String CAR_FIN = "n";
       public static final String SAUTE_LIGNE = "\n";

       public static final String MSG_SOL =
       "\nVeuillez entrer la valeur dont on souhaite calculer la racine : ";

       public static final String LIGNE_ENTETE =
       "**********************************************************************";

       public static final String TITRE =
       "*                         LA RACINE CAR�E D'UN NOMBRE                *";

       public static final String MSG_BIENVENU =
       "\n\nBienvenu au programme de calcul de la racine carr�e";

       public static final String MSG_RESULTAT =
       "\nLa racine carree de %1.2f est : %1.2f";

       public static final String MSG_RECOMMENCE =
       "\n\nVoulez-vous faire une autre demande de calcul ?";

       public static final String MSG_TAPEZ_UNE_TOUCHE =
       "\nTapez 'n' pour quitter suivi de <enter>: ";

       public static final String MSG_CONFIRMATION =
       "\n\nRetapez votre r�ponse svp ";

       public static final String MSG_FIN = "\nMerci et � la prochaine....\n";


    /*****************************************
    * PROGRAMME PRINCIPAL
    * 
    * Ce programme permet de calculer et d'afficher
    * a racine carr�e d'un nombre entr� par l'utilisateur.
    *****************************************/
    public static void main(String[] args){

       //*****************************************
       // variables
       //*****************************************
        double a;  // nombre saisi
        double x;  // contiendra la racine carr�e

        boolean quitter = false; //sera mis a vrai si l'utilisateur quitte


        //*****************************************
        // boucle principale
        //*****************************************

        //Le premier tour et tant que l'utilisateur ne quitte pas
        while (!quitter) {

            // Sollicite l'utilisateur pour entrer un nombre
            System.out.print(EFFACE_ECRAN);
            System.out.println(LIGNE_ENTETE);
            System.out.println(TITRE);
            System.out.println(LIGNE_ENTETE);
            System.out.print(MSG_BIENVENU);
            System.out.print(SAUTE_LIGNE);
            System.out.print(MSG_SOL);


            //saisie du nombre
            a = clavier.nextDouble();

            //*****************************************
            //Ici le calcul est fait selon la m�thode de Newton
            //(voir "racine carr�e" sur Wikip�dia)
            //*****************************************

            //au d�part x == a et on cherche que x^2 - a = 0 (ou presque)
            x = a;

            // Tant qu'on a pas atteint la pr�cision voulue, on effectue
            //
            //                    x =  x      a
            //                        --- +  ----
            //                         2      2x
            //
            x = UtilitaireMath.racineCarree(x, a);

            // affichage du r�sultat
            System.out.printf(MSG_RESULTAT, a, x);

            //On demande si l'utilisateur veut recommencer
            System.out.print(MSG_RECOMMENCE);
            System.out.print(MSG_TAPEZ_UNE_TOUCHE);


            //saisie de la r�ponse
            String reponse = clavier.next();


            //si la r�ponse entr�e est le CAR_FIN
            if(reponse.equals(CAR_FIN)){

                //confirme que l'utilisateur d�sire quitter
                System.out.print(MSG_CONFIRMATION);
                System.out.print(MSG_TAPEZ_UNE_TOUCHE);

                //saisie de la confirmation
                reponse = clavier.next();

                //Quitte est vraie si et seulement
                //si la r�ponse entr�e est encore le CAR_FIN
                 if(reponse.equals(CAR_FIN))
                    quitter = true;
                 else
                    quitter = false;
           }

           //l'utilisateur a r�pondu CAR_FIN
           else
               quitter = false;

        }

        //le programme est fini
        System.out.print(SAUTE_LIGNE);
        System.out.print(LIGNE_ENTETE);
        System.out.println(MSG_FIN);
        System.out.print(LIGNE_ENTETE);
    }
}

