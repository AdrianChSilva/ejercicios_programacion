/**
Ejercicio 17
Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado
* @Author: AdriánChSilva
 */

public class Ejercicio17_T04 {
  public static void main(String[] args) {

    System.out.println("Escribe un número entero");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (x % 10));
    


  }
}
