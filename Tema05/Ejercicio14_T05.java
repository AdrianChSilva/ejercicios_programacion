/**
Ejercicio 14
Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia
 * @author AdrianChSilva
 */

public class Ejercicio14_T05{
  public static void main(String[] args) {
  

   System.out.println("Cálculo de una potencia");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int x = 0; x < exponente; x++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int x = 0; x < -exponente; x++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
