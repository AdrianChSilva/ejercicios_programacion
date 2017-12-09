
/**
 * Ejercicio 11
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 *
 * @author AdriChS
 */
import java.util.Scanner;

public class Ejercicio11_T07IntrNumArrPrimosPrimero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] inicial = new int[10];
    int[] finalPrimo = new int[10];
    int[] noPrimo = new int[10];
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    System.out.println("Introduzca 10 números:");
    int i, j;
//Introducir, comprobar y dividir primos de los que no, va todo en un bucle FOR/
    for (i = 0; i < 10; i++) {
      inicial[i] = Integer.parseInt(s.nextLine());
      //Aquí comprobamos si es primo////////////////////////////////////////////
      esPrimo = true;
      for (j = 2; j < inicial[i] - 1; j++) {
        if (inicial[i] % j == 0) {
          esPrimo = false;
        }
      }
      //////////////////////////////////////////////////////////////////////////
      //Metemos en un array los primos, y los que no lo son en otro/////////////
      if (esPrimo) {
        finalPrimo[primos++] = inicial[i];
      } else {
        noPrimo[noPrimos++] = inicial[i];
      }
      ///////////////////////////////////////////////////////////////////////////
    }
////////////////////////////////////////////////////////////////////////////////

    // Muestra el array inicial ////////////////////////////////////////////////
    System.out.println("\nArray Original:");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", i);
    }
    System.out.println("|");
    for (i = 0; i < 50; i++) {
      System.out.print("⎯");
    }
    System.out.println("⎯");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", inicial[i]);
    }
    System.out.println("|");
    ////////////////////////////////////////////////////////////////////////////

    //Los números primos se meten en las primeras posiciones del array original
    for (i = 0; i < primos; i++) {
      inicial[i] = finalPrimo[i];
    }
    ////////////////////////////////////////////////////////////////////////////
    
    for (i = primos; i < primos + noPrimos; i++) {
      inicial[i] = noPrimo[i - primos];
    }
    // Muestra el Array con los primos al principio/////////////////////////////
    System.out.println("\n\nArray con los primos al principio:");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%3d ", i);
    }
    System.out.println("|");
    for (i = 0; i < 50; i++) {
      System.out.print("⎯");
    }
    System.out.println("⎯");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%3d ", inicial[i]);
    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println("|");
  }
}
