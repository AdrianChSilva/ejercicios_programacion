/**Ejercicio 6
Escribe un programa que calcule el área de un triángulo.
*/

public class Ejercicio_06 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce la base del triángulo: ");
    int base = Integer.parseInt( System.console().readLine() );

    System.out.print("introduce la altura del triángulo por favor: ");
    int altura = Integer.parseInt( System.console().readLine() );



    System.out.print("La base introducida es " + base);
    System.out.println(" y su altura es " + altura);
    System.out.print("El área del triángulo entonces es: ");
    System.out.print(((base * altura) / 2) + "\n");  
 
  } 
} 
  
