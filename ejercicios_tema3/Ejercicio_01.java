/**Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
*/

public class Ejercicio_01 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce un número: ");
    int primerNumero = Integer.parseInt( System.console().readLine() );

    System.out.print("introduce otro, por favor: ");
    int segundoNumero = Integer.parseInt( System.console().readLine() );



    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El resultado de multiplicar los dos numeros introducidos es: ");
    System.out.print(primerNumero * segundoNumero);   
  } 
}
