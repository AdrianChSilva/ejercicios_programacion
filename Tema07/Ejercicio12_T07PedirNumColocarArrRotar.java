
/**
 * Ejercicio 12
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de
 * la posición inicial en la posición final, rotando el resto de números para que no
 * se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author AdriChS
 */
import java.util.Scanner;

public class Ejercicio12_T07PedirNumColocarArrRotar {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numerosArray = new int[10];
    int[] arrayFinal = new int[10];
    int numeroInicial;
    int numeroFinal;

    System.out.println("Introduzca 10 números:");
    int i;
    //Aquí pedimos por teclado 10 numeros///////////////////////////////////////
    for (i = 0; i < 10; i++) {
      numerosArray[i] = Integer.parseInt(s.nextLine());
    }
    ////////////////////////////////////////////////////////////////////////////

    System.out.println();
    System.out.print("Introduce 2 numeros (entre 0 y 9). ");
    System.out.println("El número 'inicial' debe ser menor que el 'final");
    System.out.print("Numero inicial: ");
    numeroInicial = Integer.parseInt(s.nextLine());
    System.out.print("numero Final: ");
    numeroFinal = Integer.parseInt(s.nextLine());

    //Aquí comprobamos(escuetamente) que los numeros son correctos//////////////
    do {
      if (numeroInicial >= numeroFinal) {
        System.out.println("Error. El número 'inicial' debe ser menor que el 'final'");
        System.out.println("Por favor, introduzca los números de nuevo: ");
        System.out.print("Numero inicial: ");
        numeroInicial = Integer.parseInt(s.nextLine());
        System.out.print("numero Final: ");
        numeroFinal = Integer.parseInt(s.nextLine());
      }
    } while (numeroInicial >= numeroFinal);
    ////////////////////////////////////////////////////////////////////////////

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
      System.out.printf("|%3d ", numerosArray[i]);
    }
    System.out.println("|");
    ////////////////////////////////////////////////////////////////////////////

    //copiamos en array inicial en el final. Cambiamos y rotamos////////////////
    for (i = 0; i < 10; i++) {
      arrayFinal[i] = numerosArray[i];
    }
    arrayFinal[numeroFinal] = numerosArray[numeroInicial];
    
    for (i = numeroFinal + 1; i < 10; i++) {
      arrayFinal[i] = numerosArray[i - 1];
    }

    arrayFinal[0] = numerosArray[9];/**
     * aquí el primer valor del array final se convierte en el valor final del
     * array inicial
     */

    for (i = 0; i < numeroInicial; i++) {
      arrayFinal[i + 1] = numerosArray[i];
    }
    ////////////////////////////////////////////////////////////////////////////

    // Muestra el array Final///////////////////////////////////////////////////
    System.out.println("\nArray Final:");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", i);
    }
    System.out.println("|");
    for (i = 0; i < 50; i++) {
      System.out.print("⎯");
    }
    System.out.println("⎯");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", arrayFinal[i]);
    }
    System.out.println("|");
    ////////////////////////////////////////////////////////////////////////////
  }
}
