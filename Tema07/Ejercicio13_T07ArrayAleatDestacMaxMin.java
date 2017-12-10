
/**
 * Ejercicio 13
 * Escribe un programa que rellene un array de 100 elementos con números enteros
 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 *
 * @author AdriChS
 */
import java.util.Scanner;

public class Ejercicio13_T07ArrayAleatDestacMaxMin {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numerosArray = new int[100];
    int i;
    int[] arrayCopiado = new int[100];
    int decision;
    int nMaximo = 0;
    int nMinimo = 100;
    
    System.out.print("Éste es su array, generado aleatoriamente, con 100 valores ");
    System.out.println("comprendidos del 0 al 500 (ambos inclusive):");
    //rellenamos el array y definimos cual es maximo y minimo///////////////////
    for (i = 0; i < 100; i++) {
      numerosArray[i] = (int) (Math.random() * 500);
      System.out.print(numerosArray[i] + " ");
      arrayCopiado[i] = numerosArray[i];

      if (arrayCopiado[i] < nMinimo) {
        nMinimo = arrayCopiado[i];
      }

      if (arrayCopiado[i] > nMaximo) {
        nMaximo = arrayCopiado[i];
      }
    }
    ////////////////////////////////////////////////////////////////////////////

    //Pedimos que decida con un Switch//////////////////////////////////////////
    System.out.println();
    System.out.print("¿Cuál quiere destacar? (1: Maximo | 2: Mínimo): ");
    decision = Integer.parseInt(s.nextLine());

    switch (decision) {
      case 1:
        for (i = 0; i < 100; i++) {

          if (arrayCopiado[i] == nMaximo) {//aquí se destaca al maximo
            System.out.print("**" + arrayCopiado[i] + "** ");
          } else { //si no ponemos el 'else' sólo nos imprime el numero maximo
            System.out.print(arrayCopiado[i] + " ");
          }
        }
        break;
      case 2:
        for (i = 0; i < 100; i++) {

          if (arrayCopiado[i] == nMinimo) {//aquí se destaca al mínimo
            System.out.print("**" + arrayCopiado[i] + "** ");
          } else { //si no ponemos el 'else' sólo nos imprime el numero minimo
            System.out.print(arrayCopiado[i] + " ");
          }
        }
        break;
    ////////////////////////////////////////////////////////////////////////////
    }
  }
}
