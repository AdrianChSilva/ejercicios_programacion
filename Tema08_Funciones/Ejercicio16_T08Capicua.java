
import funciones.Ejercicios01Al14;



/**

 * @author Adrian
 */
public class Ejercicio16_T08Capicua {
  public static void main(String[] args) {
     for (int i = 1; i <= 99999; i++) {
       if(Ejercicios01Al14.esCapicua(i)){
         System.out.print(i + " ");
       }
     }
  }
}
