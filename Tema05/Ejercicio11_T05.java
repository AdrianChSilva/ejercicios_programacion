/**
Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * @author AdrianChSilva
 */

public class Ejercicio11_T05{
  public static void main(String[] args) {
  
    
    System.out.println("Vamos a mostrar el cuadrado y el cubo de los 5 primeros numeros a partir del que introduzcas por teclado");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    for (int x = numeroIntroducido; x < numeroIntroducido + 5; x++){
      System.out.printf("%3d  %5d   %7d\n", x, x*x, x*x*x);
    }

  }
}
      

