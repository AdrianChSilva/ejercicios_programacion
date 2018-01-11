
/**
 * 2. Realiza un programa que genere 20 números aleatorios entre 1 y 10 (ambos incluidos) y que los
 * muestre por pantalla. A continuación, el programa deberá mostrar el número de ocurrencias de cada
 * número. Puedes usar tantos arrays auxiliares como estimes oportuno.
 *
 * @author AdriChS
 */
public class Ejer2ExDAWOcurrencias {

  public static void main(String[] args) {
    int i;
    int[] numeros = new int[20];
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    int contador6 = 0;
    int contador7 = 0;
    int contador8 = 0;
    int contador9 = 0;
    int contador10 = 0;
    //Rellenamos el array de 20 elementos con valores del 1 al 10///////////////
    System.out.println("Array generado ");
    for (i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 10) + 1;
      System.out.print(numeros[i] + " ");

    }
    ////////////////////////////////////////////////////////////////////////////
    System.out.println();
    //Comprobamos las ocurrencias de cada numero////////////////////////////////
    for (i = 0; i < 20; i++) {
      if (numeros[i] == 1) {
        contador1++;
      }
      if (numeros[i] == 2) {
        contador2++;
      }
      if (numeros[i] == 3) {
        contador3++;
      }
      if (numeros[i] == 4) {
        contador4++;
      }
      if (numeros[i] == 5) {
        contador5++;
      }
      if (numeros[i] == 6) {
        contador6++;
      }
      if (numeros[i] == 7) {
        contador7++;
      }
      if (numeros[i] == 8) {
        contador8++;
      }
      if (numeros[i] == 9) {
        contador9++;
      }
      if (numeros[i] == 10) {
        contador10++;
      }
      //////////////////////////////////////////////////////////////////////////
    }
    System.out.println("El numero 1 aparece: '" + contador1 + "' veces");
    System.out.println("El numero 2 aparece: '" + contador2 + "' veces");
    System.out.println("El numero 3 aparece: '" + contador3 + "' veces");
    System.out.println("El numero 4 aparece: '" + contador4 + "' veces");
    System.out.println("El numero 5 aparece: '" + contador5 + "' veces");
    System.out.println("El numero 6 aparece: '" + contador6 + "' veces");
    System.out.println("El numero 7 aparece: '" + contador7 + "' veces");
    System.out.println("El numero 8 aparece: '" + contador8 + "' veces");
    System.out.println("El numero 9 aparece: '" + contador9 + "' veces");
    System.out.println("El numero 10 aparece: '" + contador10 + "' veces");
  }
}
