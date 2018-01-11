
/**
 Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
(ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá mostrar por
separado los múltiplos de 2, de 3 y de 5.
 * @author AdriChS
 */
import java.util.Scanner;
public class Ejer1ExDAW {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[20];
    int i;
    //Rellenamos el array de 20 elementos con valores del 1 al 100//////////////
    System.out.println("Array generado ");
    for (i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 101) + 1;
      System.out.print(numeros[i] + " ");

    }
    System.out.println();
    System.out.println();
    ////////////////////////////////////////////////////////////////////////////


    //Sacamos los multiplos de 2, 3 y 5/////////////////////////////////////////
        System.out.print("Múltiplos de 2: ");
        for (i = 0; i < 20; i++) {
          if (numeros[i] % 2 == 0) {
            System.out.print("[" + numeros[i] + "]");
          }
        }
        System.out.println();
        
        System.out.print("Múltiplos de 3: ");
        for (i = 0; i < 20; i++) {
          if (numeros[i] % 3 == 0) {
            System.out.print("[" + numeros[i] + "]");
          }
        }
        System.out.println();
        
        System.out.print("Múltiplos de 5: ");
        for (i = 0; i < 20; i++) {
          if (numeros[i] % 5 == 0) {
            System.out.print("[" + numeros[i] + "]");
          }
        }
      //////////////////////////////////////////////////////////////////////////
    }
    
  }



