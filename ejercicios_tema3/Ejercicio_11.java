/**Ejercicio 11
Realiza un conversor de Kb a Mb.
*/

public class Ejercicio_11 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce los KBs para transformarlos en MBs ");
    float kb = Integer.parseInt( System.console().readLine() );


    System.out.print( kb + "KB son " + kb / 1024 + " Megabytes\n"); 
    
 
  } 
} 
