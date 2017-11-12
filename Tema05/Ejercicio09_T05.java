/**
Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado
 * @author AdrianChSilva
 */

public class Ejercicio09_T05{
  public static void main(String[] args) {
    /**
     * Ésta es una manera alternativa de contar dígitos
     * Usando x.length()
     */
    System.out.println("Introduzca una cifra");
    int n = Integer.parseInt(System.console().readLine()); //pedimos una cifra
    String x = Integer.toString(n); //convertimos esa cifra en una cadena
    System.out.println(n + " tiene " + x.length() + " dígitos"); //empleamos 'x.length' el cual nos permite contar cuantos caracteres tiene una cadena (que en nuestro caso es una cifra convertida a cadena)

 }
}
