/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa contará los números del
 * array que terminan por una determinada cifra. Esta cifra se le preguntará al usuario.
 *
 * @author Adrian
 */
import java.util.Scanner;

public class Ex10acs03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Array generado ");
    int cifra = 0;
    int[] array = new int[20];
    int contador = 0;
    for (int i = 0; i < 20; i++) {
      array[i] = (int) (Math.random() * 101) + 1;
      System.out.print(array[i] + " ");

    }
    System.out.println();
    System.out.println("A continuación contaré los números que terminan en una cifra determinada. ");
    System.out.print("Elija la cifra: ");
    cifra = s.nextInt();
    for (int i = 0; i < 20; i++) {
      if (array[i] % 10 == cifra) {
        contador++;
      }

    }
    System.out.println("Hay " + contador + " número(s) que terminan por " + cifra);
  }
}
