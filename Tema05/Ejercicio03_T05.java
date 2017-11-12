/**
Ejercicio 3
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * @author AdrianChSilva
 */

public class Ejercicio03_T05{
  public static void main(String[] args) {
        
    int x = 0;
    
    do {
      System.out.println(x);
      x += 5;
    } while (x < 101);
  }
}
