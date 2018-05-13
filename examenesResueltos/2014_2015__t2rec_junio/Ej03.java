import java.util.Scanner;

/**
 * Sea A una matriz con m filas y n columnas. La matriz transpuesta, denotada con At
está formada de tal manera que el elemento aji de la matriz original A se convertirá en
el elemento aij de la matriz transpuesta At.
Por ejemplo, si A es:
1 2
3 4
5 6
La transpuesta de A sería:
1 3 5
2 4 6
Realiza una función que devuelva la matriz transpuesta a una dada. La cabecera de
la función es la siguiente:
public static int[][] transpuesta(int[ ][ ] a)
 * @author Adrian
 *
 */
public class Ej03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    int fila, columna;
    System.out.println("Introduce la fila");
    fila = Integer.parseInt(s.nextLine());
    System.out.println("Introduce la columna");
    columna = Integer.parseInt(s.nextLine());
    int[][] array = new int[fila][columna];
    
    for (int i = 0; i < fila; i++) {// en este bucle introducimos los 20 números
      for (int j = 0; j < columna; j++) {
        array[i][j] = (int) (Math.random() * 10 + 1);
      }
    
    }
    //pinta el array
    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        System.out.printf("%5d ", array[i][j]);
      }
      System.out.println();
    }
    int[][] result = transpuesta(array);
    System.out.println();
    System.out.println("Traspuesta");
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        System.out.printf("%5d ", result[i][j]);
      }
      System.out.println();
    }
    
    
  }
  public static int[][] transpuesta(int[ ][ ] a){
    int contadorFila = 0;
    
    int aux= 0;
    for (int i = 0; i < a.length; i++) {
      contadorFila++;
      int contadorcolumna = 0;
      for (int j = 0; j < a[0].length; j++) {
        
        contadorcolumna++;
      }
      aux = contadorcolumna;
      }
    int [][] resultado = new int[aux][contadorFila];
    for (int i = 0; i < aux; i++) {
   
      for (int j = 0; j < contadorFila; j++) {
        resultado[i][j] = a[j][i];
        
      }
     
      }
    return resultado;
    
  }
}
