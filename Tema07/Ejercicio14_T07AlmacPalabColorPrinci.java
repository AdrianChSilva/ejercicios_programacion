
/**
 * Ejercicio 14
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 *
 * @author Adrian
 */
import java.util.Scanner;

public class Ejercicio14_T07AlmacPalabColorPrinci {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int i;
    String[] palabras = new String[8];
    String[] resultadoFinal = new String[8];
    int contador = 0;
    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa",
      "negro", "blanco", "morado"};

    System.out.print("Introduzca 8 palabras. Recomiendo introducir colores:");
    for (i = 0; i < 8; i++) {
      palabras[i] = s.nextLine();
      for (String x : colores) {
        if (palabras[i].equals(x)) {
          resultadoFinal[contador++] = x;
        }
      }
    }
    for (i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : colores) {
        if (palabras[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        resultadoFinal[contador++] = palabras[i];
      }
    }
    // Muestra el array original.  
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for ( i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String p : palabras) {
      System.out.printf("│%-8s", p);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    
    // Muestra el array resultado///////////////////////////////////////////////
    System.out.println("\n\nArray resultado:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for ( i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (String r : resultadoFinal) {
      System.out.printf("│%-8s", r);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
  }
}
