/**
Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente)
* @author: AdrianChSilva
 */

public class Ejercicio08_T04{
  public static void main(String[] args) {
    System.out.println("Vamos a obtener la media de 3 notas.");
    System.out.println("Por favor, introduce la primera nota: ");
    float nota1 = Float.parseFloat(System.console().readLine());
    
    System.out.println("Ahora la segunda: ");
    float nota2 = Float.parseFloat(System.console().readLine());
    
    System.out.println("Y por último, la tercera: ");
    float nota3 = Float.parseFloat(System.console().readLine());
    
    float media = ((nota1 + nota2 + nota3)/3);
    
    if (media < 5) {
      System.out.println("Lo siento, ha suspendido");
    }
    
    if ((media > 4 ) && (media < 7)) {
      System.out.println("Tiene una calificación de 'bien'");
    }
    
    if ((media >= 7 ) && (media < 9)) {
      System.out.println("Tiene una calificación de 'notable'");
    }
    
    if ((media >= 9 ) && (media < 11)) {
      System.out.println("Tiene una calificación de 'sobresaliente'");
    }
      
    


  }
}
