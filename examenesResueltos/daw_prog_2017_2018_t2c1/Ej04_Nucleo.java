import java.util.Scanner;

public class Ej04_Nucleo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce fila: ");
    int fila = s.nextInt();
    System.out.println("Introduce columna: ");
    int columna = s.nextInt();
    int[][] a = new int[fila][columna];

    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        a[i][j] = (int) (Math.random() * 40 + 10);
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    int[][] b = nucleo(a);

    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b.length; j++) {
        System.out.print(b[i][j] + " ");
      }

      System.out.println();
    }

  }

  public static int[][] nucleo(int[][] n) {
    int cols = 0;
    int filas = 0;
    int[][] c = new int[2][2];

    for (int i = 0; i < n.length; i++) {
      filas++;
      for (int j = 0; j < n[0].length; j++) {
        cols++;
      }
    }
    cols = cols / filas;

    if (cols == filas) {
      int filaABuscar = (filas / 2) - 1;
      int colsABuscar = (cols / 2) - 1;

      c[0][0] = n[filaABuscar][colsABuscar];
      colsABuscar++;

      c[0][1] = n[filaABuscar][colsABuscar];
      colsABuscar--;

      filaABuscar++;
      c[1][0] = n[filaABuscar][colsABuscar];
      colsABuscar++;

      c[1][1] = n[filaABuscar][colsABuscar];
    } else {

      c[0][0] = -1;
      c[0][1] = -1;
      c[1][0] = -1;
      c[1][1] = -1;

    }

    return c;
  }

}

