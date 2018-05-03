
/**
 * Realiza una función que tome como parámetros dos arrays de números enteros y que devuelva un
 * único array que es el resultado de concatenar los otros dos. Por ejemplo, si tenemos dos arrays a
 * y b: a = {7, 10, 20} b = {11, -5, 33. 100, 200, 8}, el resultado de ejecutar concatenaArrays(a,
 * b) debe ser {7, 10, 20, 11, -5, 33. 100, 200, 8}. La cabecera de la función es la siguiente:
 * public static int[] concatenaArrays(int[] primerArray, int[] segundoArray)
 * 
 * @author adrian.chamorrosilva
 *
 */

public class Ej02_ConcatArrayFunci {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6, 7, 8, 9};
    int[] resultado = concatenaArrays(array1, array2);

    for (int i = 0; i < 9; i++) {
      System.out.print(resultado[i]);
    }
  }

  public static int[] concatenaArrays(int[] primerArray, int[] segundoArray) {
    int[] resultado = new int[9];
    for (int i = 0; i < primerArray.length; i++) {
      resultado[i] = primerArray[i];
    }

    for (int j = 0; j < segundoArray.length; j++) {
      resultado[j + 3] = segundoArray[j];
    }
    return resultado;

  }
}
