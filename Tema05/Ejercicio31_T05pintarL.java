/**
Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno
 * @author AdrianChSilva
 */

public class Ejercicio31_T05pintarL{
  public static void main(String[] args) {

      System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < altura -1; i++) {
      System.out.println("*"); //importante fijarse en el printLN
    }
/** Hay que fijarse en el "control de flujo", primero se van ejecutando las 
 * ordenes que haya dentro de las anillas, desde arriba hacia abajo, y 
 * una vez se haya completado el primer bucle, comienza el siguiente.
 * Entonces, primero se pinta la altura hasta que 'i' deje de ser más 
 * pequeña que la (variable)'altura'. Después, se ejecuta el siguiente
 * bucle.
 * 
 * ¿Por qué uno pinta hacia abajo y otro hacia la derecha?
 * 
 * Fijandonos bien, el primer bucle tiene un 'println' lo cual hace
 * un salto de línea por cada "print". El siguiente bucle sólo es un 
 * 'print' lo cual hace que pinte seguidamente (en horizontal).*/
    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print("* "); //importante fijarse que es sólo un PRINT
    }

  }
}
