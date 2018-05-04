
/**
 * Escribe un programa que diga cuánto suman todos los dígitos de un número introducido por el
 * usuario. El programa debe ser válido tanto para los números positivos como para los negativos.
 *
 * @author AdriChS
 */
import java.util.Scanner;

public class Ej04_SumaNumIntro {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int numero = s.nextInt();
    int suma = 0;

    while (numero != 0) {
      suma = suma + numero % 10;
      numero = numero / 10;
    }
    System.out.println("Los dígitos del número " + numero + " suman " + suma);
  }
}
