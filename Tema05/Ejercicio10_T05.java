/**
Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 * @author AdrianChSilva
 */

public class Ejercicio10_T05{
  public static void main(String[] args) {
  
    int numeroIntroducido = 0;
    int numeros = 0;
    int suma = 0;
    
    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Para parar el programa introduzca un numero negativo");
    
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
