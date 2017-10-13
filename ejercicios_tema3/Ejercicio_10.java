/**Ejercicio 10
Realiza un conversor de Mb a Kb.
*/

public class Ejercicio_10 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce los MBs para transformarlos en KBs ");
    float mb = Integer.parseInt( System.console().readLine() );


    System.out.print( mb + "MB son " + mb * 1024 + " Kilobytes\n"); 
    
 
  } 
} 
