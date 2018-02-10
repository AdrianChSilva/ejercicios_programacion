
/**
 *
 * @author Adrian
 */
import java.util.Scanner;
import funciones.NuevasFunciones;

public class Ejercicio17_T08SegundaForma {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número binario: ");
    long binario = s.nextLong();
    System.out.println(NuevasFunciones.biToDec(binario));
  }
}
