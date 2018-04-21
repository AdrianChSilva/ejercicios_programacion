/*
 * Ejercicio 4 Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 * aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda
 * “pensando” antes de mostrar los números.
 */
public class Ej04_T07BidRetardo {

  public static void main(String[] args) throws InterruptedException {

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
      Thread.sleep(600); // retardo de un segundo
      System.out.print("Fila: " + fila);
      for (int columna = 0; columna < 5; columna++) {
        System.out.printf("%10d ", array[fila][columna]);
        auxFila += array[fila][columna];
        sumaTotal += array[fila][columna];
        Thread.sleep(500); // retardo de un segundo
        
      }
      Thread.sleep(2000); // retardo de un segundo
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
      Thread.sleep(500); // retardo de un segundo
     
    }
    Thread.sleep(1000); // retardo de un segundo
    System.out.println("        Suma Total " + sumaTotal);
    
  }

}
