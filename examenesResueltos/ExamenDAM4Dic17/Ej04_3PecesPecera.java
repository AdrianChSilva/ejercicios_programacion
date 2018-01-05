
/**
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han
 * traído un caballito de mar ($) y una caracola (@) para que le hagan compañía al pez. Realiza un
 * programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en
 * posiciones aleatorias. Por una cuestión de física elemental, ninguno de los animales puede
 * coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera, que como
 * mínimo serán de 4 unidades.
 *
 * @author AdriChS
 */
import java.util.Scanner;

public class Ej04_3PecesPecera {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = s.nextInt();
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = s.nextInt();
    int espacio = 0;
    int caballito = 0;
    int caracola = 0;
    int pececito = 0;
    do {
      pececito = (int) (Math.random() * ((ancho - 2) * (alto - 2)));
      caballito = (int) (Math.random() * ((ancho - 2) * (alto - 2)));
      caracola = (int) (Math.random() * ((ancho - 2) * (alto - 2)));
    } while ((caracola == caballito) || (pececito == caracola) || (caballito == pececito));
    //Pintamos la parte superior de la pecera///////////////////////////////////
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println();
    //Pintamos la zona de dentro de la pecera///////////////////////////////////
    for (int i = 0; i < (alto - 2); i++) {
      System.out.print("*");

      for (int j = 0; j < (ancho - 2); j++) {
        if (espacio == caballito) {
          System.out.print("$");
        }
        if (espacio == caracola) {
          System.out.print("@");
        }
        if (espacio == pececito) {
          System.out.print("&");
        }
        if ((espacio != caballito) && (espacio != caracola) && (espacio != pececito)) {
          System.out.print(" ");
        }
        espacio++;
      }
      //////////////////////////////////////////////////////////////////////////
      System.out.print("*");//ëste es el '*' que se pone a la derecha del todo//
      System.out.println();
    }
    //Pintamos la base de la pecera/////////////////////////////////////////////
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println();
  }
}
