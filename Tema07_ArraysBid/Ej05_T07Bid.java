/**
 * Ejercicio 5 Realiza un programa que rellene un array de 6 filas por 10 columnas con n�meros
 * enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuaci�n, el programa
 * deber� dar la posici�n tanto del m�ximo como del m�nimo.
 * 
 * @author Adrian
 *
 */
public class Ej05_T07Bid {
  public static void main(String[] args) {
    int[][] array = new int[6][10];
    int max = 0;
    int aux = 0;
    int min = 1000;
    int aux2 = 0;
    int aux3 = 0;
    int aux4 = 0;
    int aux5 = 0;

    for (int fila = 0; fila < 6; fila++) {// en este bucle introducimos los numeros aleatorios
      for (int columna = 0; columna < 10; columna++) {
        array[fila][columna] = (int) (Math.random() * 1001);
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
    for (int fila = 0; fila < 6; fila++) {
      System.out.print("Fila: " + fila);
      for (int columna = 0; columna < 10; columna++) {
        System.out.printf("%10d ", array[fila][columna]);
      }
      System.out.println();
    }

    System.out.println("Este es el m�ximo " + max + " y est� en la posicion " + aux);
    System.out.println("Este es el minimo " + min + " y est� en la posicion " + aux2);
    System.out
        .println("Este es el m�ximo " + max + " y est� en la posicion [" + aux + "][" + aux3 + "]");
    System.out.println(
        "Este es el m�ximo " + min + " y est� en la posicion [" + aux2 + "][" + aux5 + "]");
  }
}
