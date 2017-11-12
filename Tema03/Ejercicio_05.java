/**Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.
*/

public class Ejercicio_05 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce la base del rectángulo: ");
    int base = Integer.parseInt( System.console().readLine() );

    System.out.print("introduce la altura del rectándulo por favor: ");
    int altura = Integer.parseInt( System.console().readLine() );



    System.out.print("La base introducida es " + base);
    System.out.println(" y su altura es " + altura);
    System.out.print("El área del rectángulo entonces es: ");
    System.out.print((base * altura) + "\n");  
 
  } 
}
