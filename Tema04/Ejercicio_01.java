/**
Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 */

public class Ejercicio_01 {
  public static void main(String[] args) {
  
    System.out.println("Escribe un día de la semana");
   String diaSemana = System.console().readLine().toLowerCase();   // con '.toLowerCase() hacemos que la línea que nos escriba, nos la pase a minúscula)'
    
    if (diaSemana.equals("lunes")) {
      System.out.println("Sistemas Informáticos");
    }
    
    if (diaSemana.equals("martes")) { 
      System.out.println("Programación");
    }
    
    if (diaSemana.equals("miércoles")) {
      System.out.println("Sistemas Informáticos");
    }
    
    if (diaSemana.equals("jueves")) {
      System.out.println("Programación");
    }
    
    if (diaSemana.equals("viernes")) {
      System.out.println("Programación");
    
      } 
 
  }
}
  
