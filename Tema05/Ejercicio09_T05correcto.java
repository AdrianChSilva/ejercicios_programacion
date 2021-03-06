/**
Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado
 * @author AdrianChSilva
 */

public class Ejercicio09_T05correcto{
  public static void main(String[] args) {
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}
