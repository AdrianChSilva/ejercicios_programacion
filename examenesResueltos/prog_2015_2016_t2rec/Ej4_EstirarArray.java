
/**
 * Implementa una función que sea capaz de “estirar” un array bidimensional transformándola en un
 * array de una dimensión. El array estirada será el resultado de pegar cada una de las filas del
 * array original, una detras de otra empezando por la fila 0. La cabecera de la función es la
 * siguiente: public static int[] estira(int[][] n)
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej4_EstirarArray {

  public static void main(String[] args) {

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



    int[] resultado = estira(matriz);
    for (int i = 0; i < resultado.length; i++) {
      System.out.print(resultado[i] + " ");
    }


  }

  public static int[] estira(int[][] n) {
    int cont = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        cont++;
      }
    }
    // ESTIRA EL ARRAY EN ORDEN FILA A FILA
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
  // ESTIRA EL ARRAY POR ORDEN EN COLUMNAS
  // for (int i = 0; i < n[0].length; i++) {
  // for (int j = 0; j < n.length; j++) {
  // for (int f = contador; f < resultado.length; f++) {
  // resultado[f] = n[j][i];
  //
  // }
  // contador++;
  // }
  // }
}
