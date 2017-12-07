

/**
 Ejercicio 7
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados.
 * @author AdrianChSilva
 */
import java.util.Scanner;
public class Ejercicio07_T07CambiarOcurrencias {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[100];
    int i;
    
    //Aquí generamos el array de 100 valores del 0 al 20////////////////////////
    for (i = 0; i < 100; i++){ 
      numeros[i] = (int)(Math.random()*20);
      System.out.print(numeros[i] + " ");
    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println();
    System.out.println("Introduce 2 numeros.");
    System.out.println("Primer número: ");
    int numero1 = Integer.parseInt(s.nextLine());
    System.out.println("Segundo número: ");
    int numero2 =Integer.parseInt(s.nextLine());
    //Aquí cambiamos todas las ocurrencias /////////////////////////////////////
    for(i = 0; i < 100; i++){
      if (numeros[i] == numero1 ){ /*SI dentro de los numeros del array hay
        valores iguales al numero introducido en la var 'numero1', serán
        cambiados por el numero introducido en la var 'numero2'.
        */
        numeros[i] = numero2;
        System.out.print("'" + numeros[i] + "' ");
      } else {
        System.out.print(numeros[i] + " ");
      //////////////////////////////////////////////////////////////////////////
    }
    }
    System.out.println();
  }
}
