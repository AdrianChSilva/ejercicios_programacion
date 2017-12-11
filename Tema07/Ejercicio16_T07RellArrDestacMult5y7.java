
/**
 * Ejercicio 16
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array escribiendo los números que se quieren resaltar entre corchetes.
 *
 * @author AdrianChSilva
 */
import java.util.Scanner;

public class Ejercicio16_T07RellArrDestacMult5y7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[20];
    int i;
    int decision;
    //Rellenamos el array de 20 elementos con valores del 0 al 400//////////////
    for (i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 401);
      System.out.print(numeros[i] + " ");

    }
    ////////////////////////////////////////////////////////////////////////////

    //Pedimos que decida////////////////////////////////////////////////////////
    System.out.println();
    System.out.print("¿Cuál quiere destacar? ");
    System.out.println("(1) Múltiplos de 5 | (2) Múltiplos de 7");
    decision = s.nextInt();
    ////////////////////////////////////////////////////////////////////////////

    //Se opera en función de la decision (multiplo de 5 O 7)////////////////////
    switch (decision) {
      case 1:
        for (i = 0; i < 20; i++) {
          if (numeros[i] % 5 == 0) {
            System.out.print("[" + numeros[i] + "] ");
          } else { //si no ponemos el 'else' sólo nos imprime los multiplos
            System.out.print(numeros[i] + " ");
          }
        }
        break;
      case 2:
        for (i = 0; i < 20; i++) {
          if (numeros[i] % 7 == 0) {
            System.out.print("[" + numeros[i] + "]");
          } else { //si no ponemos el 'else' sólo nos imprime los múltiplos
            System.out.print(numeros[i] + " ");
          }
        }
        break;
    }
    /////////////////////////////////////////////////////////////////////////////
  }
}
