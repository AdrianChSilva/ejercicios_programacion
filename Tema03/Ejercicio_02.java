/**Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*/

public class Ejercicio_02 {
  public static void main(String[] args) {

    System.out.print("Introduce una cantidad en euros: ");
    int euros = Integer.parseInt( System.console().readLine() );

    System.out.print("La conversión de " + euros+ "€ a pesetas es: ");
    System.out.print((euros * 166.386) + " pesetas\n");   
  } 
}
