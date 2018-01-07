package examendaw14dic16c;


/**
 * Escribe un programa que pida al usuario introducir sus 5 números favoritos. Estos números se deben
 * guardar en un array. A continuación, se mostrarán todos los números del 1 al 100 junto con “ME
 * GUSTA” o “no me gusta” según si el número en cuestión está o no está el el array de favoritos tal y
 * como se muestra en el ejemplo. Nótese que “ME GUSTA” está en mayúsculas para que se pueda
 * distinguir bien. Por cada 5 números mostrados hay un salto de línea.
 *
 * @author AdriChS
 */
import java.util.Scanner;

public class Ej01_NumFav {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca sus 5 números favoritos: ");
    int[] numFav = new int[5];
    boolean favorito;
    for (int i = 0; i < numFav.length; i++) {
      numFav[i] = s.nextInt();

    }
    for (int i = 1; i < 101; i++) {//en este bucle imprimimos del 1 al 100//////

      favorito = false;//todos los numeros son falsos hasta que se diga lo contrario
      //con este bucle recorremos el array anterior y declaramos que los numeros son true
      for (int r = 0; r < 5; r++) {

        if (numFav[r] == i) {
          favorito = true; 
        }
      }
      //////////////////////////////////////////////////////////////////////////
      if (favorito == true) {
        System.out.print(i + " ME GUSTA, ");
      } else {
        System.out.print(i + " no me gusta, ");
      }
      //Aquí decimos que por cada 5 números ponemos un salto de línea///////////
      if (i % 5 == 0) {
        System.out.println();
      }
      //////////////////////////////////////////////////////////////////////////
    }
  }
}
