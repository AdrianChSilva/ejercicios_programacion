/**Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora
*/

public class Ejercicio_08 {
  public static void main(String[] args) {


    System.out.print("Por favor, introduce el número de semanas trabajadas ");
    int semanas = Integer.parseInt( System.console().readLine() );
    

    System.out.print( ((40 * 12) * semanas) + "€\n");  
 
  } 
} 
