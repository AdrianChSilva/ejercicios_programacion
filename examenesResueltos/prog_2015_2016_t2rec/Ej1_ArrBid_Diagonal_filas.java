/**
 * Realiza un programa que genere y muestre por pantalla un array bidimensional de números enteros
 * entre 100 y 200. El número de filas debe ser igual al número de columnas (un número aleatorio
 * entre 4 y 10). A continuación, se deben extraer del array los siguientes datos: a) La diagonal
 * que va de la esquina superior izquierda a la esquina inferior derecha. b) La diagonal que va de
 * la esquina superior derecha a la esquina inferior izquierda. c) La primera fila. d) La última
 * fila. e) La primera columna. f) La última columna.
 * 
 * @author adrian.chamorrosilva
 *
 */
//EL TAMAÑO DEL ARRAY NO ESTÁ GENERADO ALEATORIAMENTE
public class Ej1_ArrBid_Diagonal_filas {

  public static void main(String[] args) {
    int[][] array = new int[5][5];
    int[] diagonal = new int[5];
    int[] diagonalDer = new int[5];
    int[] primFila = new int[5];
    int[] ultFila = new int[5];
    int[] primColumna = new int[5];
    int[] ultColumna = new int[5];
    int filas;
    int columnas;
    for (filas = 0; filas < 5; filas++) {
      for (columnas = 0; columnas < 5; columnas++) {
        array[filas][columnas] = (int) (Math.random() * 101) + 100;
      }
    }

    for (filas = 0; filas < 5; filas++) {
      for (columnas = 0; columnas < 5; columnas++) {
        System.out.printf("%5d   ", array[filas][columnas]);
        diagonal[0] = array[0][0];
        diagonal[1] = array[1][1];
        diagonal[2] = array[2][2];
        diagonal[3] = array[3][3];
        diagonal[4] = array[4][4];

        diagonalDer[0] = array[0][4];
        diagonalDer[1] = array[1][3];
        diagonalDer[2] = array[2][2];
        diagonalDer[3] = array[3][1];
        diagonalDer[4] = array[4][0];
        
        primFila[columnas] = array[0][columnas];
        
        ultFila[columnas] = array[4][columnas];
        
        primColumna[filas] = array[filas][0];
        
        ultColumna[filas] = array[filas][4];
      }
      System.out.println();
    }
    System.out.print("Diagonal de izq a der: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(diagonal[i] + " ");
    }
    System.out.println();
    
    System.out.print("Diagonal de der a izq: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(diagonalDer[i] + " ");
    }
    System.out.println();
    
    System.out.print("Primera fila: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(primFila[i] + " ");
    }
    System.out.println();
    
    System.out.print("Ultima fila: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(ultFila[i] + " ");
    }
    System.out.println();
    
    System.out.print("Primera columna: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(primColumna[i] + " ");
    }
    System.out.println();
    
    System.out.print("Ultima columna: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(ultColumna[i] + " ");
    }
    System.out.println();
  }
}
