/**
 * Se dice que una matriz cuadrada – tiene el mismo número de filas que de columnas - es triangular
superior cuando todos los valores que están por debajo de la diagonal principal son cero. Por ejemplo,
la siguiente matriz es triangular superior:
2 7 5
0 4 1
0 0 8
Realiza una función que diga si una matriz dada es o no triangular superior y pruébala en un
programa. Recuerda que si la matriz no es cuadrada, se puede concluir directamente que no es
triangular superior, sin hacer ningún otro tipo de comprobación. La cabecera de la función es la
siguiente:
public static boolean esTriangularSuperior(int[ ][ ] a) 
 * @author adrian.chamorrosilva
 *
 */
import java.util.Scanner;

public class Ej03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    int fila;
    int columna;
    System.out.println("Debe introducir una matriz CUADRADA. ");
    System.out.println("Introduzca el numero de filas :");
    fila = s.nextInt();
    System.out.println("Introduzca el numero de columnas :");
    columna = s.nextInt();
    if (fila == columna) {
      int[][] matriz = new int[fila][columna];
      int tirada =  (int) (Math.random() * 2) + 1;

      switch (tirada) {
        case 1:// triangular superior
          int contador = 0;

          for (int i = 0; i < matriz.length; i++) {
            for (int j = contador; j < matriz[i].length; j++) {

              matriz[i][j] = (int) (Math.random() * 2) + 1;

            }
            contador++;
          }

          break;
        case 2:// triangular inferior
          int contador2 = 0;
          for (int i = 0; i < matriz.length; i++) {
            for (int j = contador2; j < matriz[i].length; j++) {

              matriz[j][i] = (int) (Math.random() * 2) + 1;

            }
            contador2++;
          }

          break;
      }

      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
          System.out.printf("%3d   ", matriz[i][j]);
        }
        System.out.println();
      }

      // Usamos la función
      System.out.println("¿Es matriz triangular superior?");
      System.out.println(esTriangularSuperior(matriz));

    } else {
      System.out.println("NO es cuadrada");
    }
  }

  public static boolean esTriangularSuperior(int[][] a) {
    boolean resultado = true;
    int contador = 0;
    int cont = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = contador; j < a[i].length; j++) {
        if (a[i][j] == 0) {
          cont++;
        }
      }
      contador++;
    }
    if (cont != 0) {
      resultado = false;
    }
    return resultado;

  }

}
