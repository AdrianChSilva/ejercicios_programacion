/**
Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).
* @author: AdrianChSilva
 */

public class Ejercicio09_T04{
  public static void main(String[] args) {
  
    System.out.println("Vamos a realizar una ecuación de segundo grado del tipo ax2 + bx + c = 0");
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
