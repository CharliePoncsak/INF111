/***************************************

 *@author : Pierre Bélisle
 *@version   : juin 2005
 *dernière révision : janvier 2014
 */
 import java.util.Scanner;

public class ValiderDateSousProgramme{

    /******************************************************
    *        CONSTANTES
    *******************************************************/

    //Les mois
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

    //Les limites
    public static final int MOIS_MIN = 1;
    public static final int MOIS_MAX = 12;

    public static final int JOUR_MIN = 1;
    public static final int NBR_JOUR_MIN_FEV = 28;
    public static final int JOUR_MAX_30 = 30;
    public static final int JOUR_MAX_31 = 31;

    //La plus petite année permises
    public static final int ANNEE_MIN= 1900;

    //Le clavier
    public static Scanner clavier = new Scanner(System.in);

    /**************************************************
     * Programme principal
     *
     * Exemple regroupant une partie de la théorie du cours 01
     * en inf111 et les sous-programmes.
     *
     *Il s'agit d'un programme qui valide une année (>ANNEE_MIN), un mois et
     *un jour sous forme d'entier pour l'afficher sous forme de texte
     **************************************************/
    public static void  main(String[] args){


        /*
         * Stratégie : On utilise des fonctions locales pour chaque saisie
         *             qui retourne l'année, le mois et le jour.
         *
         *             La vérification du nombre de jours dans un mois est délégué
         *             à la fonction de validation du jour
         *
         */
        /******************************************************
        *        VARIABLE
        ******************************************************/

        //constituera la date
        int jour;
        int mois;
        int annee;

        /******************************************************
        *          BLOC PRINCIPAL
        ******************************************************/

        //validation de l'année
        annee = anneeValide();

        //validation du mois
        mois = moisValide();

        //validation du jour
        jour = jourValide(mois,annee);

        //affichage de la date en format texte
        afficherDate(jour,mois,annee);

      }

      /******************************************************
      *  Lit et valide une annee plus grande que ANNEE_MIN
      *  @return : un année valide
      *******************************************************/
      public static int anneeValide() {
    	  
    	    /*
    	     * STRATÉGIE : On lit d'abord une année et on utilise un while 
    	     *                         pour la validation car si la date est déjà valide,
    	     *                         on n'entre pas dans la boucle.
    	     */

            int annee;    //sert a la saisit de l'annee

            //lit tant que ce n'est pas valide
            System.out.print("Entrez une année svp : ");
            annee = clavier.nextInt();
            
            //Sort de la boucle si valide
            while (annee <= ANNEE_MIN ) {
              System.out.print("Erreur : Entrez une autre année svp : ");
              annee = clavier.nextInt();
            }
            
            return annee;
       }

        /******************************************************
        * Lit et valide un mois entre MOIS_MIN et MOIS_MAX
        * @return : un mois valide
        ******************************************************/
        public static int moisValide() {
        	
            /*
    	     * STRATÉGIE : Un exemple d'utilisation de do while.  On voit la répétition
    	     *                         de la condition de validité.
    	     */
            int mois;  //sert a la saisit du mois

            do {
                 System.out.print("Entrez un mois svp : ");
                 mois = clavier.nextInt();

                 //Condition d'invalidité du mois
                 if (mois < MOIS_MIN || mois > MOIS_MAX) {
                     System.out.print("Erreur : Entrez un autre mois svp : ");
                     mois = clavier.nextInt();
                 }
                 
               //Reste dans la boucle tant	que le mois est invalide
            } while (mois < MOIS_MIN || mois > MOIS_MAX);

            return mois;

         }

        /****************************************************************
		* Calcule le nombre de jour maximum selon le mois et l'année reçus
		* @param : mois et année nécessaires
		* @return : le nombre de jour maximum pour le mois et l'année recus
		******************************************************************/
		public static int nbrJourMaxParMois(int mois, int annee) {


		    /*
		     * STRATÉGIE : Selon le mois, on affecte une variable avec le nombre de
		     *                         jours possibles du mois.
		     *
		     *             La vérification pour l'année bissextile en février est réalisée dans 
		     *             une fonction locale qui retourne 0 ou 1 selon que l'année est 
		     *             bissextile ou non.  On peut donc utiliser une addition plutôt qu'un 
		     *             if (re: valider_date cours 01).
		     *             
		     *             On commence par février les mois de 30 jours puiqu'il y a moins 
		     *             de cas à évaluer.
		     */

		    //recevra 28,29,30 ou 31 selon le mois et l'année.
		    int nbrJourMax;

      		if (mois == FEVRIER){

      		    //Ici on ajoute le résultat de la fonction, ce qui donne
      		    //le bon nombre de jours pour février
                nbrJourMax = NBR_JOUR_MIN_FEV + 
                		unSiBissextileZeroSinon(annee);

            } else if (mois == AVRIL || mois == JUIN || 
            		       mois == SEPTEMBRE || mois == NOVEMBRE){
		             nbrJourMax = JOUR_MAX_30;

            } else {
	     	       nbrJourMax = JOUR_MAX_31;
            }

		    return nbrJourMax;
		  }

	    /******************************************************
	 	* Vérifie si l'année est bissextile et en retourne l'information.
	 	*@return : 1 si l'annee est bissextile et 0 sinon
		******************************************************/
		public static int unSiBissextileZeroSinon(int annee) {

          /*
           * STRATÉGIE : On utilise l'opérateur ternaire puisque recommandé par 
           *                       convention.
           */
          
		  //Nous n'utilisons pas de constantes puisque peu de chance de changement 
	      //et c'est localisé (cas exceptionnel).
	      return ((annee % 400 == 0) || ((annee % 4 == 0) && (annee % 100 != 0))
	    		  ?1
	    	      :0);

        }

        /******************************************************
        * Lit et valide un jour selon le mois et l'année reçus.
        * @param : mois et année nécessaires
        * @return : le jour valide
        ******************************************************/
        public static int jourValide(int mois,int annee) {

             /*
              * Même stratégie que pour la validation de l'année.
              */

              int jour;  //sert a la saisit du jour

              System.out.print("Entrez un jour svp : ");
              jour = clavier.nextInt();

              //Ici, il est possible d'appeler la fonction dans l'évaluation de la boucle 
              //mais elle serait appelée à chaque tour de boucle pour retourner toujours 
              //la même valeur. On optimise le temps d'exécution en mettant le résultat 
              //dans une variable.
             int  nbrJour = nbrJourMaxParMois(mois,annee);
             
             //Rentre dans la boucle si le jour est invalide en utilisant la valeur retenue
              while(jour < JOUR_MIN || jour > nbrJour){
                    System.out.print("Erreur : Entrez un autre jour svp : ");
                    jour = clavier.nextInt();
              }
              return jour;
          }

        /******************************************************
        * Affiche de la date en format texte
        * @param : le jour, le mois et l'année à afficher
        ******************************************************/
        public static void afficherDate(int jour, int mois, int annee) {
        	
        	 /*
             * STRATÉGIE : On utilise la structure switch puisque recommandé par 
             *                       convention.
             */
            System.out.print("la date entree est le " + jour + " ");

            switch(mois) {
                case JANVIER : System.out.print("janvier");break;
                case FEVRIER : System.out.print("fevrier");break;
                case MARS : System.out.print("mars");break;
                case AVRIL : System.out.print("avril");break;
                case MAI : System.out.print("mai");break;
                case JUIN : System.out.print("juin");break;
                case JUILLET : System.out.print("juillet");break;
                case AOUT : System.out.print("aout");break;
                case SEPTEMBRE : System.out.print("septembre");break;
                case OCTOBRE: System.out.print("octobre");break;
                case NOVEMBRE: System.out.print("novembre");break;
                default: System.out.print("decembre");
            }

            System.out.println(" " + annee);

            //passer deux lignes
            System.out.println();
            System.out.println();

        }


}
