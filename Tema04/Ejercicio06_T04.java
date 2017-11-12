/**
Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √ 2g h siendo g = 9:81m/
* @author: AdrianChSilva
 */

public class Ejercicio06_T04{
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular con un programa el tiempo que tarda en caer un objeto desde una determinada altura");
    System.out.println("Introduce la altura en metros sin decimales: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double tiempo = (Math.sqrt((2 * h) / (9.81)));
    
    System.out.println("Introduciste " + h + "m y a esa altura el objeto tarda en caer " + tiempo + " segundo(s)");
    

  }
}
