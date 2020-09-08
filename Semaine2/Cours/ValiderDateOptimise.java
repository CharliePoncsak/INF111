/***************************************

 *@author : Pierre Bélisle
 *@version   : juin 2005
 *dernière révision : janvier 2014
 */
 import java.util.Scanner;

public class ValiderDateOptimise{

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

    //La plus petite année permise
    public static final int ANNEE_MIN= 1900;

    //valeur arbitraire, il fallait en choisir une
    //pour appeler entier_valide
    public static final int ANNEE_MAX = 3000;

    //Le clavier
    public static Scanner clavier = new Scanner(System.in);

    /**************************************************
     * programme principal
     **************************************************/
	public static void  main(String[] args){

		 /*
	     * STRATÉGIE : On utilise une fonction locale générale qui permet de lire un 
	     *                         entier valide (en mode console) selon les paramètres qui lui 
	     *                         sont founis.
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
		annee = entierValide("Entrez une année svp : ",
				ANNEE_MIN,ANNEE_MAX,
				"Erreur : Entrez une autre année svp : ");

		//validation du mois
		mois = entierValide("Entrez un mois svp : ",
				MOIS_MIN,MOIS_MAX,
				"Erreur : Entrez un autre mois svp : ");

		//validation du jour (Ici on appelle directement la fonction pour le
        // nombre de jours, dans les paramètres effectifs)
		jour = entierValide("Entrez un jour svp : ",JOUR_MIN,
				nbrJourMaxParMois(mois,annee),
				"Erreur : Entrez un autre jour svp : ");

		//affichage de la date en format texte
		afficherDate(jour,mois,annee);

	  }

      /******************************************************
  	  *  lit et valide une annee plus grande que ANNEMAX
	  *  retour : un entier valide
	  *******************************************************/
      public static int entierValide(String msgSollic, int min, int max, 
    		                                          String msgErreur) {
    	  
    	  /*
  	     * STRATÉGIE : On lit d'abord un entier et on utilise un while 
  	     *                         pour la validation car si la valeur est déjà valide,
  	     *                         on n'entre pas dans la boucle.
  	     */

	        int entier;    //sert a la saisit de l'entier

	        
            System.out.print(msgSollic);
            entier = clavier.nextInt();

            ////lit tant que ce n'est pas valide
  	    	while (entier < min || entier > max ) {
              System.out.print(msgErreur);
              entier = clavier.nextInt();
            }
  	    	
	        return entier;
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
