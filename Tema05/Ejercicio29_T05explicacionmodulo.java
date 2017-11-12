/**
jercicio 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma
 * @author AdrianChSilva
 */

public class Ejercicio29_T05explicacionmodulo{
  public static void main(String[] args) {

    System.out.print("Introduzca un número entero positivo (grande): ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca otro número (pequeño): ");
    int numeroPequeno = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");



    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) { /**el módulo siempre se refiere al
        resto, entonces si el resto da 0, quiere decir que ese número es
        * divisble entre ese número. Por ejemplo; 10 es divisible por 2
        * ya que el resto da 0. 40 también es divisible entre 2 ya que
        * dividiendo y dividiendo nuestro resto da 0. */
        System.out.print(i + " ");
      }
    }
  }
}
