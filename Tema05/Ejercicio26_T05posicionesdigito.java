/**
Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
 * @author AdrianChSilva
 */

public class Ejercicio26_T05posicionesdigito{
  public static void main(String[] args) {

    System.out.println("Por favor, introduce un número:");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduce un dígito:");
    int digit = Integer.parseInt(System.console().readLine());
    
    System.out.println("El dígito " + digit + " se repite en " + num + " en = ");
    int contador = 1;
    int suma= 0;
    while (num > 0) {
      int separarNum = num % 10;
      suma = (suma * 10) + (separarNum);
      num = num / 10;
    }
    
    while (suma > 0) {
      if ((suma % 10) == digit) {
        System.out.println(" " + contador);
      }
      suma = suma / 10;
      contador++;
    }
	}
}
