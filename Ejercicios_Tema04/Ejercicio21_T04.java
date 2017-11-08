/**
Ejercicio 21
Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior
* @author: AdrianChSilva
 */

public class Ejercicio21_T04{
  public static void main(String[] args) {
  
    System.out.println("Vamos a obtener tu nota media de programación.");
    System.out.println("Porfavor, introduce tu primera nota: ");
    int nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Porfavor, introduce tu segunda nota: ");
    int nota2 = Integer.parseInt(System.console().readLine());
    
    int sumaNota = ((nota1 + nota2)/2);
    
    if (sumaNota >= 5) {
      System.out.println("Tu nota media es: " + sumaNota);
  }
    if (sumaNota <= 4) {
      System.out.println("¿Qué calificación sacaste en la recuperación? (apto/no apto)");
      String calificacion = (System.console().readLine());
      if (calificacion.equals("apto")) {
        System.out.println("Tu nota media es 5");
      
      } else {
        System.out.println("Tu nota media es: " + sumaNota);
      }
    }
  }
}
