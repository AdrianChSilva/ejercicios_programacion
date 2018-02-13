
import funciones.NuevasFunciones;
import java.util.Scanner;

/**
 *
 * @author AdriChS
 */
public class Ejercicio18_T08DecToBiSegundaForma {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número decimal: ");
    long decimal = s.nextLong();
    System.out.print("El numero " + decimal + " en binario es ");
    System.out.println(NuevasFunciones.decToBi(decimal));
  }
}

