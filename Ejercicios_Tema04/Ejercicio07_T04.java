/**
Ejercicio 7
Realiza un programa que calcule la media de tres notas
* @author: AdrianChSilva
 */

public class Ejercicio07_T04{
  public static void main(String[] args) {
    System.out.println("Vamos a obtener la media de 3 notas.");
    System.out.println("Por favor, introduce la primera nota: ");
    float nota1 = Float.parseFloat(System.console().readLine());
    
    System.out.println("Ahora la segunda: ");
    float nota2 = Float.parseFloat(System.console().readLine());
    
    System.out.println("Y por último, la tercera: ");
    float nota3 = Float.parseFloat(System.console().readLine());
    
    float media = ((nota1 + nota2 + nota3)/3);
    
    System.out.println("La nota media obtenida es: " + media);

    


  }
}
