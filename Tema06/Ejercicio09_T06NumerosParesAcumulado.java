/**Ejercicio 9
Realiza un programa que vaya generando n�meros aleatorios pares entre 0
y 100 y que no termine de generar n�meros hasta que no saque el 24. El
programa deber� decir al final cu�ntos n�meros se han generado.
@author AdrianChSilva
*/
public class Ejercicio09_T06NumerosParesAcumulado {

  public static void main(String[] args) {
    int numeros = 0;
    int contador = 0;
    do {
      numeros = (int)(Math.random()*51) * 2; //usando la multiplicaci�n hacemos que cada numero sea par
      System.out.print(numeros + " ");
      contador++;
      
    } while (numeros != 24); {
      System.out.println("\nSe han generado " + contador + " n�meros.");
    }
    
  }
}
