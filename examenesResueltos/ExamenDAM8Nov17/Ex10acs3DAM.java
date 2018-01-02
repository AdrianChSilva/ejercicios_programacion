/**
EXAMEN DAM 2017
Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a
los últimos acontecimientos que han tenido lugar en Cataluña, han recibido muchos pedidos del cartel
que muestra el número 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios que habrá entre los
números. La altura mínima es 5. La anchura de los números siempre es la misma. La parte superior
de los cincos también es siempre igual. La parte inferior del 5 sí que varía en función de la altura
@author: Lucía Blanco Salgado
 */
import java.util.Scanner;
public class Ex10acs3DAM{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    final String uno = "*";
    final String cuatro = "****";
    final String hueco = "   ";
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int h = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espacio = Integer.parseInt(s.nextLine());
    // Imprime las 3 primeras filas
    for(int fila = 0; fila < 3; fila++){
      // Uno
      if ((fila == 0) || (fila == 2)){
        System.out.print(uno);
        // Cinco
        for (int i = 0; i < 2; i++){
          for(int col = 0; col < espacio; col++){
            System.out.print(" ");
          }
          System.out.print(cuatro);
        }
      } else {
        System.out.print(uno);
        for(int col = 0; col < espacio; col++){
          System.out.print(" ");
        }
        for (int i = 0; i < 2; i++){
          System.out.print(uno);
          for(int col = 0; col < espacio; col++){
            System.out.print(" ");
          }
          System.out.print(hueco);
        }
      }
      System.out.println();
    }
    // Imprime tantas filas en medio como h - primeras filas - última fila
    int medio = h - 4;
    for(int i = 0; i < medio; i++){
      // Uno
      System.out.print(uno);
      for(int col = 0; col < espacio; col++){
        System.out.print(" ");
      }
      // Cinco
      for (int j = 0; j < 2; j++){
        System.out.print(hueco);
        System.out.print(uno);
        for(int col = 0; col < espacio; col++){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    // Última fila
    // Uno
    System.out.print(uno);
    // Cinco
    for (int i = 0; i < 2; i++){
      for(int col = 0; col < espacio; col++){
        System.out.print(" ");
      }
      System.out.print(cuatro);
    }
  }
}