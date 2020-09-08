/***************************************
 *Exemple regroupant une partie de la théorie du cours 01
 *en inf111
 *<p>
 *Il s'agit d'un programme qui demande une année, un mois et
 *un jour sous forme d'entier pour l'afficher sous forme de texte
 *
 *auteur : Pierre Bélisle
 *date   : juin 2005
 */
import java.util.Scanner;

public class ValiderDate{

    /**************************************************
     * déclaration pour le clavier
     **************************************************/
    public static Scanner clavier = new Scanner(System.in);

    /******************************************************
    *        CONSTANTES
    ******************************************************/
    public static final int JOURMIN = 1;
    public static final int NBRJOURMINFEV = 28;
    public static final int JOURMAX30 = 30;
    public static final int JOURMAX31 = 31;
    public static final int MOISMIN = 1;
    public static final int MOISMAX = 12;
    public static final int ANNEEMIN = 1900;


    ///pour la lisibilité du code
    public static final int JANVIER = 1;
    public static final int FEVRIER = 2;
    public static final int MARS = 3;
    public static final int AVRIL = 4;
    public static final int MAI = 5;
    public static final int JUIN = 6;
    public static final int JUILLET = 7;
    public static final int AOUT = 8;
    public static final int SEPTEMBRE = 9;
    public static final int OCTOBRE = 10;
    public static final int NOVEMBRE = 11;
    public static final int DECEMBRE = 12;


    // Sert à la vérification de l'année bissextile.
    public static final int MULTIPLE_MILENAIRE = 400;
    public static final int NB_ANNEES_CYCLE = 4;
    public static final int ANNEES_EXCLUS = 100;


    /**************************************************
     * programme principal
     **************************************************/
    public static void  main(String[] args){


        /******************************************************
        *        VARIABLE
        ******************************************************/

        //constituera la date
        int jour;
        int mois;
        int annee = ANNEEMIN;

        //sert a calculer le nombre de jour pour le mois choisis
        int nbrJourMax;

        /******************************************************
        *          BLOC PRINCIPAL
        ******************************************************/

        /******************************************************
        *       validation de l'annee version while
        ******************************************************/

        //sollicitation de l'année
        System.out.print("Entrez une année svp : ");
        annee = clavier.nextInt();

        //redemandé tant que pas valide
        while (annee <= ANNEEMIN ){
            System.out.print("Erreur : Entrez une autre année svp : ");
            annee = clavier.nextInt();
        }

        /******************************************************
        *       validation du mois version do-while
        ******************************************************/
        do{
            //sollicitation du mois
            System.out.print("Entrez un mois svp : ");
            mois = clavier.nextInt();

            //si mois invalide aviser l'utilisateur
            if (mois < MOISMIN || mois > MOISMAX)
            {
                System.out.print("Erreur : Entrez un autre mois svp : ");
                mois = clavier.nextInt();
            }

            //tant que le mois est invalide
        }while (mois < MOISMIN || mois > MOISMAX);


        /******************************************************
        * calcul du nombre de jour maximum pour le mois entré
        ******************************************************/
        //février
        if (mois == FEVRIER){
            //vérification de l'année bissextile
            if ((annee % MULTIPLE_MILENAIRE == 0) ||
                ((annee % NB_ANNEES_CYCLE == 0) &&
                  annee % ANNEES_EXCLUS != 0)){

                nbrJourMax = NBRJOURMINFEV + 1;
            }
            else{
                nbrJourMax = NBRJOURMINFEV;
            }
        }
        //mois de 30 jours
        else if (mois == AVRIL || mois == JUIN || mois == SEPTEMBRE || mois == NOVEMBRE){
            nbrJourMax = JOURMAX30;
	}	
        //mois de 31 jours
        else{
            nbrJourMax = JOURMAX31;
	}

        /******************************************************
        *       validation du jour
        ******************************************************/
        //sollicitation du jour
        System.out.print("Entrez un jour svp : ");
        jour = clavier.nextInt();

        //redemandé tant que pas valide
        while(jour < JOURMIN || jour > nbrJourMax){
            System.out.print("Erreur : Entrez un autre jour svp : ");
            jour = clavier.nextInt();
        }


        /******************************************************
        *       affichage de la date sous forme littérale
        ******************************************************/
        System.out.print("la date entree est le " + jour + " ");

        if (mois == JANVIER)
            System.out.print("janvier");
        else if(mois == FEVRIER)
            System.out.print("fevrier");
        else if(mois == MARS)
            System.out.print("mars");
        else if(mois == AVRIL)
            System.out.print("avril");
        else if(mois == MAI)
            System.out.print("mai");
        else if(mois == JUIN)
            System.out.print("juin");
        else if(mois == JUILLET)
            System.out.print("juillet");
        else if(mois == AOUT)
            System.out.print("aout");
        else if(mois == SEPTEMBRE)
            System.out.print("septembre");
        else if(mois == OCTOBRE)
            System.out.print("octobre");
        else if(mois == NOVEMBRE)
            System.out.print("novembre");
        else
            System.out.print("decembre");

        System.out.println(" " + annee);

        //passer deux lignes
        System.out.println();
        System.out.println();

    }
}