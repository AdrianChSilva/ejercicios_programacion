import java.util.Scanner;

/**
 * Realiza una función con nombre linea que sea capaz de pintar una línea horizontal de caracteres
 * por pantalla. La longitud de la línea y el carácter con el que se pinta se pasan como parámetros.
 * Utiliza esta función para realizar el programa de la pirámide rellena, es decir, que pida la
 * altura y muestre por pantalla una pirámide. La cabecera de la función es la siguiente: public
 * static void linea(int longitud, String caracter)
 * 
 * @author Adrian
 *
 */
public class Ej01_PintarLineaPiramide {

  public static void linea(int longitud, String caracter) {

    for (int i = 0; i < longitud; i++) {
      System.out.print(caracter);
    }
  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = 1;
    int alturaInt = 0;
    String c = "";
    System.out.print("Escriba un caracter");
    c = s.nextLine();

    System.out.print("Ahora escriba la altura");
    alturaInt = Integer.parseInt(s.nextLine());
    int i = 0;
    int altura = 1;
    int espacios = alturaInt - 1;
    while (altura <= alturaInt) {

      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      // pinta la línea
      linea(x, c);

      System.out.println();

      altura++;
      x += 2;
      espacios--;
    }
  }
}


