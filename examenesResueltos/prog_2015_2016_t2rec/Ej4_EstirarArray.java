
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
    // TODO Auto-generated method stub
    int[][] array = new int[5][5];

    
    for (int filas = 0; filas < 5; filas++) {
      for (int columnas = 0; columnas < 5; columnas++) {
        array[filas][columnas] = (int) (Math.random() * 101) + 100;
        System.out.printf("%5d   ", array[filas][columnas]);
      }
      System.out.println();
    }
    
    int[] resultado = estira(array);
    for (int i = 0; i < 25; i++) {
      System.out.print(resultado[i]+ " ");
    }
    
    
  }
  public static int[] estira(int[][] n) {
    int[] resultado = new int[25];
    for(int filas = 0; filas<5;filas++) {
      
      for (int columnas = 0; columnas < 5; columnas++) {
        if(filas == 0) {
          resultado[columnas] = n[filas][columnas];
        }

        if(filas == 1) {
          resultado[columnas+5] = n[filas][columnas];
        }
        if(filas == 2) {
          resultado[columnas+10] = n[filas][columnas];
        }
        
        if(filas == 3) {
          resultado[columnas+15] = n[filas][columnas];
        }
        
        if(filas == 4) {
          resultado[columnas+20] = n[filas][columnas];
        }
      }
    }
    
    return resultado;
    
  }
  
}
