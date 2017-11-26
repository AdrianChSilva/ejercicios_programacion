/** Ejercicio 7
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
@author Adrian
*/

public class Ejercicio07_T06 {
  public static void main(String[] args) {
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);
      
      
      for (int columna = 1; columna < 3; columna++ ) {
        int quiniela = (int)((Math.random()*3) + 1);
        
        switch (quiniela) {
          case 1:
            System.out.print("1  |");
            break;
          case 2: 
            System.out.print(" 2 |");
            break;
          case 3: 
            System.out.print("  x|");
            break;
        }
      }
      System.out.println();
    }
  }
}
