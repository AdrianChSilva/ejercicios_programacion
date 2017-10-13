/**Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
*/

public class Ejercicio_04 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce un número: ");
    int primerNumero = Integer.parseInt( System.console().readLine() );

    System.out.print("introduce otro, por favor: ");
    double segundoNumero = Integer.parseInt( System.console().readLine() );



    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El resultado de multiplicar los dos numeros introducidos es: ");
    System.out.print(primerNumero * segundoNumero);  
    System.out.print("\nEl resultado de sumar los dos numeros introducidos es: ");
    System.out.print(primerNumero + segundoNumero);
    System.out.print("\nEl resultado de restar los dos numeros introducidos es: ");
    System.out.print(primerNumero - segundoNumero);  
    System.out.print("\nEl resultado de dividir los dos numeros introducidos es: ");
    System.out.print((primerNumero / segundoNumero) + "\n");  
  } 
}
