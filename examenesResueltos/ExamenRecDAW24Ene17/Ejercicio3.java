
/**
 *
 * @author Adrian
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    String[] nombres = { "Adrián Aguilar", "Manuel Alcántara", "Jorge Alcaraz",
    "Joaquín Bello", "María Margarita Benítez", "Francisco Casasola" };
    int alumnos = ((int) (Math.random() * 6));

    System.out.print("Le ha tocado salir a ... " + nombres[alumnos]);
  }
}
