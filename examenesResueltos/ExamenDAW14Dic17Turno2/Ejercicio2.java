
/**
 * 2. Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa indicará para cada uno
 * de ellos si es un número primo y/o un capicúa de la forma que muestra el ejemplo.
 *
 * @author Adrian
 */
public class Ejercicio2 {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    int i, j;
    int[] arrayFinal = new int[10];
    boolean esPrimo = false;
    int contadorPrimo = 0;
    int contNoPrimo = 0;
    boolean capicua = false;
    int contadorCapicua = 0;
    int contNoCapicua = 0;
    int volteado = 0;

    //Rellenamos el array de 20 elementos con valores del 2 al 100//////////////
    System.out.println("Array generado ");
    for (i = 0; i < 10; i++) {
      numeros[i] = (int) (Math.random() * 101) + 2;
      System.out.print(numeros[i] + " ");
    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println();
    System.out.println();
    
    //vamos diciendo si es primo y/o capicuo////////////////////////////////////
    for (i = 0; i < 10; i++) {
      capicua = false;
      esPrimo = false;
      System.out.print("El " + numeros[i]);
      //dice si es primo////////////////////////////////////////////////////////
      for (j = 2; j < numeros[i] - 1; j++) {
        if (numeros[i] % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.print(" es primo y ");
      } else {
        System.out.print(" no es primo y ");
      }
      //////////////////////////////////////////////////////////////////////////
      //dice si es capicua//////////////////////////////////////////////////////
      int aux = numeros[i];
      int auxReves = 0;
      int numDig = 0;
      int numBien = numeros[i];
      while (aux > 0) {
        auxReves = ((auxReves * 10) + (aux % 10));
        aux /= 10;
        numDig++;
      }
      do {
        int numeroDerecho = numBien % 10;
        int numReves = auxReves % 10;
        if (numeroDerecho == numReves) {
          capicua = true;
        } else {
          capicua = false;
        }
        numBien /= 10;
        auxReves /= 10;
        numDig--;
      } while ((numDig > 0) && (capicua == true));
      if (capicua) {
        System.out.println(" es capicúa.");
      } else {
        System.out.println(" no es capicúa.");
      }
      //////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    }
  }
}
