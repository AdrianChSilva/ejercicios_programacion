
/**
 * Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá llevar el mínimo
 * a la primera posición del array y el máximo a la última, dejando el resto de valores en las posiciones
 * intermedias, en el mismo orden en que aperecieron, llenando los huecos que dejan el máximo y el
 * mínimo. Se puede trabajar sobre un solo array o sobre varios, como el alumno estime oportuno. Si el
 * máximo y/o el mínimo se repite en el array, da igual cuál de ellos se escoja para colocar el primero o el
 * último, siempre que el resultado sea correcto.
 *
 * @author Adrian
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    int[] numeros = new int[20];
    int i;
    int[] aux = new int[20];
    int[] maximo = new int[2];
    int[] minimo = new int[2];
    minimo[0] = 100;
    int indice = 0;
    int indiceFinal = 19;
    int[] arrayFinal = new int[20];
    //Rellenamos el array de 20 elementos con valores del 1 al 100//////////////
    System.out.println("Array generado ");
    for (i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 100) + 1;
      System.out.print(numeros[i] + " ");
    }
    ////////////////////////////////////////////////////////////////////////////

    for (i = 0; i < 20; i++) {
      if (numeros[i] < minimo[0]) {
        minimo[0] = numeros[i];
        minimo[1] = i;
      } else if (numeros[i] > maximo[0]) {
        maximo[0] = numeros[i];
        maximo[1] = i;
      }
    }
//    numeros[minimo[1]] = -1;
//    numeros[maximo[1]] = -1;

//    for (i = 0; i < 20; i++) {
//      if (numeros[i] != -1) {
//        int aux2 = numeros[i];
//        for (int j = 0; j < i; j++) {
//          if (numeros[i - j - 1] == -1) {
//            numeros[i - j - 1] = aux2;
//            numeros[i - j - 1] = -1;
//          }
//        }
//      }
//    }
    for (i = 20 - 3; i >= 0; i--) {
      numeros[i + 1] = numeros[i];
    }
    numeros[0] = minimo[0];
    numeros[19] = maximo[0];
    
    System.out.println();
    System.out.println();
    ////////////////////////////////////////////////////////////////////////////

    System.out.println("Array final ");
    for (i = 0; i < 20; i++) {
      System.out.print(numeros[i] + " ");
    }
  }
}
