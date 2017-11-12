/**
Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 * @author AdrianChSilva
 */

public class Ejercicio16_T05{
  public static void main(String[] args) {
  
    System.out.print("Introduce un numero y te diré si es primo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    boolean esPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) { //esto hace que se vaya dividiendo entre todos los numeros hasta llegar al que hemos escrito y si al llegar a cierto numero el resto da 0, dirá que el numero no es primo
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

  }
}
