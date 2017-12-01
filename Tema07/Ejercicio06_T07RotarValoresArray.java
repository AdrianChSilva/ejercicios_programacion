
/**
Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 * @author AdrianChSilva
 */
import java.util.Scanner;
public class Ejercicio06_T07RotarValoresArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int [15];
    System.out.println("Introduzca 15 números:");
    int i; 
    
    for (i = 0; i < 15; i++) {
      numeros[i] = Integer.parseInt(s.nextLine()); 

    }
    System.out.println();
      
      
      // rota una posición a la derecha //////////
      int aux = numeros[14]; /** con esto cogemos el array de la posición 15
       * y lo incluimos en una variable auxiliar.
       */
      for (i = 14; i > 0; i--) {
        numeros[i] = numeros[i-1]; /** Aquí decimos por ejemplo; que el valor
         * del array en la posicion 7, se pone en la posicion 6.
         */
      }
      numeros[0] = aux; /** esto enlaca con lo escrito en la línea 27. El primer
       * array toma el valor del aux, el cual tomaba el último valor del array.
       */
      ////////////////////////////////////////////

      // Muestra el array rotado /////////////////
      System.out.println("\nArray rotado a la derecha una posición:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numeros[i]);
      }
      System.out.println("|");
      ////////////////////////////////////////////

  }
}
