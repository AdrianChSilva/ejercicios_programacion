/**
Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por
teclado.
Ejemplo:
 * @author AdrianChSilva
 */

public class Ejercicio28_T05calculofactorial{
  public static void main(String[] args) {

    System.out.println("vamos a hacer el calculo de factorial");
    System.out.println("Introduce un número");
    int numeroFactorial = Integer.parseInt(System.console().readLine());
    int factorial = 1;
    
    while(numeroFactorial != 0) {
      factorial = numeroFactorial * factorial;
      numeroFactorial--;
    }
    System.out.println("El factorial es " + factorial);
    
  }

}
