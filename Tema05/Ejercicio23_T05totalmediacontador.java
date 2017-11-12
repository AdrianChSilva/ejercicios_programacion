/**
Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 * @author AdrianChSilva
 */

public class Ejercicio23_T05totalmediacontador{
  public static void main(String[] args) {
     int contador = 0;
    int acumulado = 0;
       System.out.println("Introduce numeros");
    System.out.println("cuando la suma total llegue a 10000, se para.");
  do {
    int numerosIntroducidos = Integer.parseInt(System.console().readLine());
    acumulado += numerosIntroducidos;
    contador++;
  } while (acumulado <= 10000);
  
    System.out.println("Ha introducido " + contador + " números");
    System.out.println("La media de los numeros es " + acumulado/contador );
    System.out.println("El total acumulado es " + acumulado);


  }
}
