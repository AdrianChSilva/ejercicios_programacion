/**
 * 
 */

/**
 * Implementa una función con nombre nEsimo que busque el número que hay dentro de un array
 * bidimensional en la posición n-ésima contando de izquierda a derecha y de arriba abajo, como si
 * se estuviera leyendo. El primer elemento es el 0. Si la posición donde se busca no existe en el
 * array, la función debe devolver -1. Se debe entregar tanto el código de la función como el código
 * de prueba que la usa. La cabecera de la función es la siguiente: public static int nEsimo(int[][]
 * n, int posicion)
 * 
 * @author Adrian
 *
 */
public class Ej02_RecorredArrayPosicion {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[][] array = new int[4][5];

    for (int fila = 0; fila < 4; fila++) {// en este bucle introducimos los 20 números
      for (int columna = 0; columna < 5; columna++) {
        array[fila][columna] = (int) (Math.random() * 100 + 100);
      }

    }
    System.out.println();

    for (int fila = 0; fila < 4; fila++) {
      for (int columna = 0; columna < 5; columna++) {
        System.out.printf("%10d ", array[fila][columna]);

      }
      System.out.println();
    }
    System.out.print("comprobamos " + nEsimo(array, 10));
  }

  public static int nEsimo(int[][] n, int posicion) {

    int fila;
    int columna;
    int resultado = 0;
    int aux = -1;

    for (fila = 0; fila < n.length; fila++) {
      for (columna = 0; columna < n.length + 1; columna++) {
        aux++;
        if (aux == posicion) {
          resultado = n[fila][columna];
        }
        if (resultado == 0) {
          resultado = -1;
        }
      }
    }
    System.out.println();

    return resultado;
  }

}
