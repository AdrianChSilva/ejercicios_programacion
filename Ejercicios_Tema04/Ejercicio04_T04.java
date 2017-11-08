/**
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora
 */

public class Ejercicio04_T04{
  public static void main(String[] args) {
    
    
     System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 41) {
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
  }
    
    if (horasTrabajadas > 40) {
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 16) + " euros.");
  }
  
   

 
  }
}
