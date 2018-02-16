
/**
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Adrian
 */
import funciones.Ejercicios01Al14;

public class Ejercicio15_T08Primos {

  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
      if (Ejercicios01Al14.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }

  }
}
