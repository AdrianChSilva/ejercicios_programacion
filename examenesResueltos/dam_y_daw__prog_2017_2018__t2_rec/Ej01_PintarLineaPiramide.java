import java.util.Scanner;

/**
 * Realiza una funci�n con nombre linea que sea capaz de pintar una l�nea horizontal de caracteres
 * por pantalla. La longitud de la l�nea y el car�cter con el que se pinta se pasan como par�metros.
 * Utiliza esta funci�n para realizar el programa de la pir�mide rellena, es decir, que pida la
 * altura y muestre por pantalla una pir�mide. La cabecera de la funci�n es la siguiente: public
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
      // pinta la l�nea
      linea(x, c);

      System.out.println();

      altura++;
      x += 2;
      espacios--;
    }
  }
}


