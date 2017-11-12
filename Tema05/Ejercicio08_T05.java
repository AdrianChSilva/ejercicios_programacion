/**
Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado
 * @author AdrianChSilva
 */

public class Ejercicio08_T05{
  public static void main(String[] args) {
    
    System.out.println("Acontinuación vamos a mostrar la tabla de multiplicar");
    System.out.println("Introduce el número para mostrar su tabla de multiplicar");
    int n = Integer.parseInt(System.console().readLine());
    
    for (int z = 0; z <= 10; z++ ) {
      System.out.println(n + " x " + z + " = " + n*z);

    }
    
  }
  
}
