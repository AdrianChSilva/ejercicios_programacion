/**
Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 * @author AdrianChSilva
 */

public class Ejercicio13_T05{
  public static void main(String[] args) {
  
    int numeros = 0;
    int numeroIntroducido = 0;
    System.out.println("Escriba 10 números y le diré si es negativo o positivo");
    do { //Éste ejercicio está mal. Sería más eficiente usar un bucle 'for'
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    numeros++; 
    if (numeroIntroducido >= 0) {
      System.out.println("Éste numero es postivo");
    } else {
      System.out.println("Este número es negativo");
    }
    }while (numeros <= 9);

  }
}
