
/**
 * Exercice1
 * 
 * 
 * @author <a href="mailto:Pierre.Belisle@etsmtl.ca">Pierre Belisle</a>
 * @version aout 2005
 */
public class Exercice1{
         
         /*
         *
         */
         public static void main(String[] args){
             
                /**.*/
             
               int a;       ///
               int b = 1;   ///
               int x = 1;   ///
               
               a=f1(x,b);
               f2(a,b);
               f2(a,x);
               x = f3(f1(b,b),f1(x,x));
               System.out.print("a = " + a + " b = " + b + " x = " + x);
         }
         
         public static int f1(int a, int x) {
             a += x;
             return a;
         }

         public static void f2(int a, int x) {
             a += x;
             x += x;
         }
         public static int f3(int a, int x) {
             f2(a,x);
             return f1(a,x);
         }
}
