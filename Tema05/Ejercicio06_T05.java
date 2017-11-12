/**
Ejercicio 6
Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.
 * @author AdrianChSilva
 */

public class Ejercicio06_T05{
  public static void main(String[] args) {
        
    int x = 320;
    
    do {
      System.out.println(x);
      x -= 20;
    } while (x > 140);
  }
}
