
/**
 * Ejercicio 6 Modifica el programa anterior de tal forma que no se repita ningún número en el
 * array.
 * 
 * @author Adrian
 *
 */
public class Ej06_T07BidNoRepitNum {
  public static void main(String[] args) {
    int[][] array = new int[6][10];
    int max = 0;
    int aux = 0;
    int min = 1000;
    int aux2 = 0;
    int aux3 = 0;
    int aux5 = 0;
    int fila;
    int columna;
    boolean repetido;
    int i;

    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        do {// en este bucle introducimos los numeros aleatorios
          array[fila][columna] = (int) (Math.random() * 1001);

          // Comprueba si el número generado ya está en el array.
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (array[fila][columna] == array[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }
    //Con el array lleno, comprobamos el maximo y el minimo y las posiciones.
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        // array[fila][columna] = (int) (Math.random() * 1001);

        if (array[fila][columna] > max) {
          max = array[fila][columna];
          aux = fila;
          aux3 = columna;
        }
        if (array[fila][columna] < min) {
          min = array[fila][columna];
          aux2 = fila;
          aux5 = columna;
        }
      }
    }
    for (fila = 0; fila < 6; fila++) {
      System.out.print("Fila: " + fila);
      for (columna = 0; columna < 10; columna++) {
        System.out.printf("%10d ", array[fila][columna]);
      }
      System.out.println();
    }
    System.out
        .println("Este es el máximo " + max + " y está en la posicion [" + aux + "][" + aux3 + "]");
    System.out
        .println("Este es el  " + min + " y está en la posicion [" + aux2 + "][" + aux5 + "]");
  }
}

