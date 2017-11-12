/**
Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
* @Author: AdriánChSilva
 */

public class Ejercicio14_T04 {
  public static void main(String[] args) {

    System.out.println("Acontinucación vamos a comprobar si un número es par y/o divisible entre 5");
    System.out.println("Escriba el número");
    int a = Integer.parseInt(System.console().readLine());

    
    if ((a % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((a % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
           

  }
}
