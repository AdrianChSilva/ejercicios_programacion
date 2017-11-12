/**Ejercicio 7
Escribe un programa que calcule el total de una factura a partir de la base
imponible
*/

public class Ejercicio_07 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce el precio del primer producto: ");
    float primero = Integer.parseInt( System.console().readLine() );

    System.out.print("Por favor, introduce el precio del segundo producto: ");
    float segundo = Integer.parseInt( System.console().readLine() );
  
    System.out.print("Por favor, introduce el precio del tercer producto: ");
    float tercero = Integer.parseInt( System.console().readLine() );

    System.out.print("Por favor, introduce el precio del cuarto producto: ");
    float cuarto = Integer.parseInt( System.console().readLine() );




    System.out.print( "El total de su factura (con IVA) es: " + (((primero + segundo + tercero + cuarto) * 1.21) + "\n"));
    System.out.print( "El total de su factura (sin IVA) es: " + ((primero + segundo + tercero + cuarto) + "\n"));
  } 
}
