/**Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula V =
1/3*πr2h
*/

public class Ejercicio_09 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce el radio del cono: ");
    long radio = Integer.parseInt( System.console().readLine() );

    System.out.print("introduce la altura del cono por favor: ");
    long altura = Integer.parseInt( System.console().readLine() );



    System.out.print("El volumen del cono es: ");
    System.out.print(((3.1415926 * (radio * radio) * altura) / 3) + "\n");  
 
  } 
}
