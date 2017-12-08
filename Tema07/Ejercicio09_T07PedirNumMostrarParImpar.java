
/**
 * Ejercicio 9
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author AdrianChSilva
 */
import java.util.Scanner;

public class Ejercicio09_T07PedirNumMostrarParImpar {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[8];
    int i;
   
    System.out.println("Introduzca 8 números: ");

    for (i = 0; i < 8; i++) {
      numeros[i] = Integer.parseInt(s.nextLine());
    }
    for (i = 0; i < 8; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.println(numeros[i] + " Es PAR");
      } else {
        System.out.println(numeros[i] + " Es IMPAR");
      }
    }
  }
}
