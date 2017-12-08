
/**
 * Ejercicio 8
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 * @author AdrianChSilva
 */
import java.util.Scanner;

public class Ejercicio08_T07TempeDiagBarras {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Guardamos en un array los meses del año///////////////////////////////////
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    ////////////////////////////////////////////////////////////////////////////

    int[] temperatura = new int[12];
    int i, j;

    //Aquí pedimos por teclado las temperaturas de cada mes/////////////////////
    for (i = 0; i < 12; i++) {
      System.out.print("Introduce la temperatura media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(s.nextLine());
    }
    ////////////////////////////////////////////////////////////////////////////
    //Aquí pintamos el diagrama de barras///////////////////////////////////////
    for (i = 0; i < 12; i++) {
      System.out.print(mes[i] + "|");
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print("*");
      }
    ////////////////////////////////////////////////////////////////////////////
    //Aquí se imprime la temperatura, introducida anteriormente, al final///////
      System.out.println(" " + temperatura[i] + "ºC");
      //Queda fuera del bucle porque sino se pondría la temperatura al lado de
      //cada aesterisco
    ////////////////////////////////////////////////////////////////////////////

//////Ésta es la forma de imprimir lo anterior pero formateado//////////////////
//      String verde = "\033[32m";
//      String naranja = "\033[33m";
//      String azul = "\033[34m";
//      String morado = "\033[35m";
//      String blanco = "\033[37m";
//      for (i = 0; i < 12; i++) {
//        System.out.printf(azul + "%12s " + verde + "│", mes[i]);
//        for (j = 0; j < temperatura[i]; j++) {
//          System.out.print(morado + "▄");
//        }
//        System.out.println(naranja + " " + temperatura[i] + "ºC" + blanco);
//      }
////////////////////////////////////////////////////////////////////////////////
    }
  }
}
