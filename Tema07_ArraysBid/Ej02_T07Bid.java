import java.util.Scanner;

public class Ej02_T07Bid {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] array = new int[4][5];
    int auxFila;
    int sumaTotal = 0;
    
    for (int fila = 0; fila < 4; fila++) {// en este bucle introducimos los 20 números
      for (int columna = 0; columna < 5; columna++) {
       array[fila][columna] = Integer.parseInt(s.nextLine());
      }
      
    }
    System.out.println();
    //"plantilla para imprimir el array"/////////////////////////////////////////////////////////////
    for (int fila = 0; fila < 4; fila++) {
      auxFila=0;//ES TOTALMENTE NECESARIO INICIALIZAR LA VARIABLE DENTRO DEL BUCLE, SINO, DA LA SUMA TOTAL
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
      sumaColumna = 0;
      for (int fila = 0; fila < 4; fila++) {
        sumaColumna += array[fila][columna];
      }
      System.out.printf("%10d", sumaColumna);
    }
    System.out.println("Suma Total"+ sumaTotal);
  }

}
