/**
 * Implementa una función que sea capaz de “desenrollar” un array bidimensional recorriéndola en
espiral en el sentido de las agujas del reloj. La cabecera de la función es la siguiente:
public static int[] desenrolla(int[][] n)
Por ejemplo, si el array bidimensional “a” es el que se muestra a continuación
45 92 14 20 25 78
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48
El array unidimensional generado por desenrolla(a) sería el siguiente
45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35 72 24 45 42 41 23 64 42
 * @author adrian.chamorrosilva
 *
 */
public class Ej04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int x = (int) (Math.random() * 4) + 2;
    int y = (int) (Math.random() * 4) + 2;
    int cont = 0;
    int[][] matriz = new int[x][y];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = (int) (Math.random() * 9) + 1;
        System.out.printf("%3d   ", matriz[i][j]);
        cont++;
      }
      System.out.println();
    }

    System.out.println();


    System.out.println("Array Desenrrollado");
    int[] result = desenrolla(matriz);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }



  public static int[] desenrolla(int[][] n) {
    int cont = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        cont++;
      }
    }
    int[] resultado = new int[cont];
    int contador = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        for (int f = contador; f < resultado.length; f++) {
          resultado[f] = n[i][j];

        }
        contador++;
      }
    }

    return resultado;

  }
}
