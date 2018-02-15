
/**
 *
 * @author AdriChS
 */
import funciones.NuevasFunciones;
import java.util.Scanner;

public class Ej19_T08HexOctBinDec {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("***********************CONVERSOR***********************");
    System.out.println("Porfavor, indique en qué base va a introducir el numero: ");
    System.out.println("1.  Base 10");
    System.out.println("2.  Base 2");
    System.out.println("3.  Base 8");
    System.out.println("4.  Base 16");
    int base = s.nextInt();
    String hexa = "";
    long numero = 0;
    System.out.println("Introduzca el número a convertir");
    if (base == 4) {
      hexa = s.next();
    } else {
      numero = s.nextLong();
    }
    System.out.println("Bien. Ahora indique a qué quiere convertirlo");
    System.out.println("1.  Decimal");
    System.out.println("2.  Binario");
    System.out.println("3.  Octal");
    System.out.println("4.  Hexadecimal");
    int convert = s.nextInt();
    int numeroAsInt = (int) numero;
//    String numeroString = Long.toString(numero);
    System.out.println();
    if (base == 1 && convert == 2) {
      System.out.println(NuevasFunciones.decToBi(numero));
    }
    if (base == 1 && convert == 3) {
      System.out.println(NuevasFunciones.decToOct(numero));
    }

    if (base == 1 && convert == 4) {
      System.out.println(NuevasFunciones.decToHex(numeroAsInt));

    }
    if (base == 2 && convert == 1) {
      System.out.println(NuevasFunciones.biToDec(numero));
    }
    if (base == 2 && convert == 3) {
      System.out.println(NuevasFunciones.decToOct(NuevasFunciones.biToDec(numero)));
    }

    if (base == 2 && convert == 4) {
      int conversion = (int) NuevasFunciones.biToDec(numero);
      System.out.println(NuevasFunciones.decToHex(conversion));
    }
    if (base == 3 && convert == 1) {
      System.out.println(NuevasFunciones.octToDec(numero));
    }
    if (base == 3 && convert == 2) {
      System.out.println(NuevasFunciones.decToBi(NuevasFunciones.octToDec(numero)));
    }
    if (base == 3 && convert == 4) {
      int conversion = (int) NuevasFunciones.biToDec(numero);
      System.out.println(NuevasFunciones.decToHex(conversion));
    }
    if (base == 4 && convert == 1) {
      System.out.println(NuevasFunciones.biToDec(NuevasFunciones.hexToBi(hexa)));
    }
    if (base == 4 && convert == 2) {
      System.out.println(NuevasFunciones.hexToBi(hexa));
    }
    if (base == 4 && convert == 3) {
      System.out.println(NuevasFunciones.decToOct(NuevasFunciones.biToDec(NuevasFunciones.hexToBi(hexa))));
    }
  }
}
