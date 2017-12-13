
/**
Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
 * @author AdriChS
 */
import java.util.Scanner;

public class Ejercicio20_T06CuboAgua {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = s.nextInt();
    int llenado = (int) (Math.random() * capacidad + 1);
    for (int i = 0; i <= capacidad; i++) {
      for (int c = 0; c < 6; c++) { //ancho fijo
        if (c == 0 || c == 5 || i == capacidad) {
          System.out.print("*");
        } else if (capacidad - llenado <= i ){
          System.out.print("=");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + llenado + " litros de agua.");

  }
}
    
    

