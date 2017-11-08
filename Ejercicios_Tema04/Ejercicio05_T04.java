/**
Ejercicio 5
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
b = 0)
* @author: AdrianChSilva
 */

public class Ejercicio05_T04{
  public static void main(String[] args) {
  
    System.out.println("Vamos a realizar una ecuación de primer grado del tipo ax + b = 0");
    System.out.println("Porfavor, introduce el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("Porfavor, introduce el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    
    if (a == 0) {
      System.out.println("La ecuación no se podría realizar");
    } else {
      
      System.out.println(-b/a);
    }
 
  }
}
