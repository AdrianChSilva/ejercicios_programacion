/*
 * Ejercicio 3 Modifica el programa anterior de tal forma que los números que se introducen en el
 * array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Adrian Ch.S
 * 
 */

public class Ej03_T07Bid_NumAleatSumTotal {

  public static void main(String[] args) {

    int[][] array = new int[4][5];
    int auxFila;
    int sumaTotal = 0;

    for (int fila = 0; fila < 4; fila++) {// en este bucle introducimos los 20 números
      for (int columna = 0; columna < 5; columna++) {
        array[fila][columna] = (int) (Math.random() * 100 + 100);
      }

    }
    System.out.println();
    // "plantilla para imprimir el
    // array"/////////////////////////////////////////////////////////////
    for (int fila = 0; fila < 4; fila++) {
      auxFila = 0;// ES TOTALMENTE NECESARIO INICIALIZAR LA VARIABLE DENTRO DEL BUCLE, SINO, DA LA
                  // SUMA TOTAL
      System.out.print("Fila: " + fila);
      for (int columna = 0; columna < 5; columna++) {
        System.out.printf("%10d ", array[fila][columna]);
        auxFila += array[fila][columna];
        sumaTotal += array[fila][columna];
      }
      System.out.printf("%10d\n", auxFila);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////
    int sumaColumna;
    for (int columna = 0; columna < 5; columna++) {
      sumaColumna = 0; // cada vez que pase de nuevo el bucle, se inicializa una
      // y otra vez la variable. Entonces obtendremos la suma de cada fila.
      // Si inicializamos fuera obtendremos la suma total.
      for (int fila = 0; fila < 4; fila++) {
        sumaColumna += array[fila][columna];
      }
      System.out.printf("%10d", sumaColumna);
    }
    System.out.println("Suma Total" + sumaTotal);
  }

}
