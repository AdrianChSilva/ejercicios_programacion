/**
Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
*
* @author Luis José Sánchez
*/

public class Ejercicio01_T06ConBucle {
  public static void main(String[] args) {
    int suma = 0;
    for (int i=1;i<=3;i++){
    int dado = (int)(Math.random()*6) + 1;
    suma += dado;
    System.out.println(dado);
    }
  }
}
