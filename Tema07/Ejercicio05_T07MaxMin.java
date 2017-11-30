/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciost07;

/**
Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.
 * @author Adrian
 */
import java.util.Scanner;

public class Ejercicio05_T07MaxMin {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = 10;
    int numIntroducido;
    long[] numeros = new long[10];
    long max = 0;
    long min = 1000000000;
     System.out.print("Introduce 10 números. A continuación, te mostraré ");
     System.out.println("cual es el máximo y cual es el mínimo:");
    
    do{
      
      for (int i = 0; i < 10; i++) {
        numeros[i] = Long.parseLong(s.nextLine());
        x--;
        
        if (numeros[i] > max){
          max = numeros[i];
          
        }
        else if (numeros[i] < min) {
          min = numeros[i];
			}
    }
      System.out.println();
    
    } while (x != 0);
    for (int i = 0; i < 10; i++){
      System.out.print(numeros[i]);
      if (numeros[i] == max) {
        System.out.print(" máximo");
      }
      
      if (numeros[i] == min) {
        System.out.print(" mínimo");
      }
      System.out.println();

      
    }
      System.out.print(" | ");
      System.out.print(max + " Éste es el máximo. ");
      System.out.print(min + " Éste es el mínimo. ");
    
    
  }
}
