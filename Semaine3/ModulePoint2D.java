/*
 * Module contenant les sous-programmes qui concernent le type Point2D.
 * On y retrouve l'initialisation, une fonction de comparaison et une procédure de copie.
 */
public class ModulePoint2D {

  /**
   * Initialise les champs du point 2D à l'aide des paramètres reçus
   * @param point Le point à initialiser
   * @param x La valeur à donner au champ x
   * @param y La valeur à donner au champ y
   */
  public static void initPoint(Point2D point, double x, double y) {
    point.x = x;
    point.y = y;
  }
  
  /**
   * Teste l'égalité entre deux points 2D champ par champ
   * @param p1 Un point 2D
   * @param p2 Un point 2D
   * @return Vrai si tous les champs sont égaux
   */
  public static boolean equals(Point2D p1, Point2D p2) {
    return p1.x == p2.x && p1.y == p2.y;
  }
  
  /**
   * Copie les données d'un point dans un autre.
   * Le point p2 est copié dans p1.
   * @param p1 Le point qui reçoit les données copiées
   * @param p2 Le point qui fournit les données copiées
   */
  public static void clone(Point2D p1, Point2D p2) {
    p1.x = p2.x;
    p1.y = p2.y;
  }

}
