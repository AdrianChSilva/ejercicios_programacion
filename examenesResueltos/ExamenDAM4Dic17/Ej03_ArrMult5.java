
/**
 * 3. Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre
 * 0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente
 * criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se
 * cambia por el siguiente múltiplo de 5 que exista a partir de él. Utiliza dos arrays, uno para contener los
 * números originales y otro para guardar el resultado.
 *
 * @author AdriChS
 */
public class Ej03_ArrMult5 {

  public static void main(String[] args) {

    int[] array = new int[15];
    int i;
    int[] arrayAux = new int[15];
    int[] arrayCincuerizado = new int[15];
    int numeros = 0;
    //Rellenamos el array de 15 elementos con valores del 0 al 500//////////////
    System.out.println("Array generado: ");
    for (i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 500);
      System.out.print(array[i] + " ");
      arrayAux[i] = array[i];

    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println();
    System.out.println();
    //comprobamos si los numeros son mult de 5 y los metemos en un array////////
    for (int x = 0; x < arrayAux.length; x++) {
      numeros = arrayAux[x];
      if (arrayAux[x] % 5 == 0) {
        arrayCincuerizado[x] = numeros;

      } else {
        do {
          numeros++;

        } while (numeros % 5 != 0);
        arrayCincuerizado[x] = numeros;
      }
    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println("Array cincuerizado:");
    for (int z = 0; z < arrayCincuerizado.length; z++) {
      System.out.print(arrayCincuerizado[z] + " ");
    }

  }
}
