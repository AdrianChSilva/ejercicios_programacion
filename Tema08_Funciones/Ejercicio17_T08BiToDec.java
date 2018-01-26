
/**
 * Ejercicio 17
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Adrian
 */
import java.util.Scanner;

public class Ejercicio17_T08BiToDec {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long binario, digito, decimal;
    int exponente;
    boolean esBinario;

    System.out.print("Introduce un numero binario y lo convertiré en decimal");
    binario = s.nextLong();
    
    //proceso para pasar de binario a decimal///////////////////////////////////
    exponente = 0;
    decimal = 0;
    while (binario != 0) { //Aquí decimos que coja cada 1 del numero binario////
      digito = binario % 10;
      decimal = decimal + digito * (int) Math.pow(2, exponente);
      exponente++;
      binario = binario / 10; //Aquí vamos acortando el número para que 'digito' pueda seguir cogiendo el último numero
    }
    System.out.println("Decimal: " + decimal);
  }
}
