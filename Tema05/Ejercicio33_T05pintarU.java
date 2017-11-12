/**
jercicio 33
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
 */

public class Ejercicio33_T05pintarU{
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());

    // Palos verticales de la U
    for (int i = 1; i < altura; i++) {
      System.out.print("* ");/**pimero se imprime el asterisco junto con
      un espacio*/
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");/**Después de lo anterior, incrementamos
        la variable e imprimimos 2 espacios por cada incremento
        * hasta llegar a un número por debajo de la "altura" introducida.
        * */
      }
      System.out.println("*");
/** Tras los dos bucles, imprimimos el asterisco que quedaría a la derecha
 * y a la misma altura.*/
      
    }

    // Base de la U
    System.out.print("  ");
    for (int i = 2; i < altura; i++) { /** el valor de la 'i' es 2 porque
      tiene que cuadrar con los espacios que introdujimos en el bucle
      * anterior (se podría decir que son los espacios pero pintados)*/
      System.out.print("* ");
    }

  }
}
