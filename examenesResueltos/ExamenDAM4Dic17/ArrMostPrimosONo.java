
/**
 * 1. Realiza un programa que genere 20 números aleatorios entre 2 y 100. A continuación, el programa
 * deberá mostrar un listado con todos los números primos encontrados. Si no existiera ningún primo, el
 * programa deberá mostrar el mensaje “No se ha encontrado ningún número primo.”
 * Ejemplo:
 * 45 92 4 2 25 17 8 90 35 29 55 24 45 66 30 74 90 13 18 72
 * Números primos encontrados: 2 17 29 13
 *
 * @author AdriChS
 */
public class ArrMostPrimosONo {

  public static void main(String[] args) {
    int[] array = new int[20];
    int i, j;
    int[] arrayPrimos = new int[20];
    boolean esPrimo = false;
    int primos = 0;

    //Rellenamos el array de 20 elementos con valores del 2 al 100//////////////
    System.out.println("Array generado ");
    for (i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 99) + 2;
      esPrimo = true;
      for (j = 2; j < array[i] - 1; j++) {
        if (array[i] % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        arrayPrimos[i] = array[i];
        primos++;
      }
        System.out.print(array[i] + " ");
      

    }
    System.out.println();
    //Aquí señalamos si existen numeros primos en el array o no/////////////////
    if (primos == 0) {//si el contador no aumentó, quiere decir que no hay primos
      System.out.print("No se encontró ningún numero primo ");
    } else {

      System.out.print("Numeros Primos encontrados: ");
      for (i = 0; i < arrayPrimos.length; i++) {
        System.out.print(arrayPrimos[i] + " ");

      }
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

  }

}
