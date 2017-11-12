/**
Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * @author AdrianChSilva
 */

public class Ejercicio22_T05numeroprimo{
  public static void main(String[] args) {
 
    System.out.print("Números primos entre 2 y 100: ");

    boolean primo = true;

    for (int n = 2; n <= 100; n++) {

      primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          primo = false;
        }
      }

      // si n es primo, se muestra por pantalla
      if (primo) {
        System.out.print(n + " ");
      }
    }

  }
}
