/**Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
*/

public class Ejercicio_03 {
  public static void main(String[] args) {

    System.out.print("Introduce una cantidad en pesetas: ");
    long pesetas = Integer.parseInt( System.console().readLine() );

    System.out.print("La conversión de " + pesetas + " pesetas a euros es: ");
    System.out.print((pesetas * 0.006) + "€\n");   
  } 
}
