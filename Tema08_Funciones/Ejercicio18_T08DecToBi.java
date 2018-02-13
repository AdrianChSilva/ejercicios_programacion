
/**
 * Escribe un programa que pase de decimal a binario.
 *
 * @author Adrian
 */
import java.util.Scanner;

public class Ejercicio18_T08DecToBi {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Vamos a transformar de decimal a binario. ");
    System.out.println("Porfavor, introduce un número: ");
    long numero = s.nextLong();
    long digito;
    long binario = 0;
    int exponente = 0;
    long aux = numero;
    while (numero != 0) { 
      digito = numero % 2;
      binario = binario + digito * (int) Math.pow(10, exponente);
      exponente++;
      numero = numero / 2; 
    }
    System.out.println("El numero " + aux + " en binario es: " + binario);
  }
}
