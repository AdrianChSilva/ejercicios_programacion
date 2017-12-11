
/**
 * Ejercicio 17
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir
 * un número al usuario. Se debe comprobar que el número introducido por
 * teclado se encuentra dentro del array, en caso contrario se mostrará un
 * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
 * introduzca uno correctamente. A continuación, el programa rotará el array
 * hacia la derecha las veces que haga falta hasta que el número introducido
 * quede situado en la posición 0 del array. Por último, se mostrará el array rotado
 * por pantalla.
 *
 * @author AdrianChSilva
 */
import java.util.Scanner;

public class Ejercicio17_T07PedNumCoincDenArrRotDer {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[10];
    int[] arrayAux = new int[10];
    int i;
    int aux; 
    int numeroPedido;
    //Rellenamos el array de 10 elementos con valores del 0 al 100//////////////
    for (i = 0; i < 10; i++) {
      numeros[i] = (int) (Math.random() * 101);
      System.out.print(numeros[i] + " ");
      arrayAux[i] = numeros[i];
    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println();
    boolean numeroEsta = false;
    System.out.print("Introduzca un numero entero que coincida con el array ");
    System.out.println("mostrado.");
    do {
      numeroPedido = Integer.parseInt(s.nextLine());
      for (int elemento : arrayAux) {
        if (elemento == numeroPedido) {
          numeroEsta = true;
        }
      }
      if (!numeroEsta) {
        System.out.println("Debe introducir un numero que esté dentro del array");
      }

    } while (!numeroEsta);

 //Rota el array hasta que el número introducido se coloque en la posición 0////
    while (arrayAux[0] != numeroPedido) {
       aux = arrayAux[9];
      // Rotación a la derecha//////////////////////////////////////////////////
      for ( i = 9; i > 0; i--) {
        arrayAux[i] = arrayAux[i - 1];
      }
      //////////////////////////////////////////////////////////////////////////
      arrayAux[0] = aux;
    }
 ///////////////////////////////////////////////////////////////////////////////
 System.out.println("\nArray final:");
  for ( i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
  System.out.println();
    for ( i = 0; i < 10; i++) {
      System.out.printf("│%4d ", arrayAux[i]);
    }
  }
  

}
