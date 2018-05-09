/**
 * Crea la funci�n de manejo de arrays que tenga la siguiente cabecera y que haga lo que se
 * especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas): public
 * static int[ ] extraePares(int x[ ]) // Devuelve un array con todos los n�meros pares que se //
 * encuentren en otro array que se pasa como par�metro. // L�gicamente el tama�o del array que se
 * devuelve ser� // menor o igual al que se pasa como par�metro. Utiliza esta funci�n en un programa
 * para comprobar que funcionan bien. Si en el array no existe ning�n n�mero par, se devuelve un
 * array con el n�mero -1 como �nico elemento.
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Array generado: ");
    int[] array = new int[6];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 11) + 1;
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("Array resultado: ");
    int[] resultado = extraePares(array);
    for (int i = 0; i < resultado.length; i++) {
      System.out.print(resultado[i] + " ");
    }
  }

  public static int[] extraePares(int x[]) {// con esta funci�n podr�a extraer pares, capicuos, etc

    int contador = 0;
    int[] resultado;
    int[] aux = new int[1000];
    for (int i = 0; i < x.length; i++) {

      if ((x[i] % 2) == 0) {
        aux[contador++] = x[i];
      }
    }
    //////////////////////////////
    if (contador != 0) {
      resultado = new int[contador];
      for (int i = 0; i < contador; i++) {

        resultado[i] = aux[i];

      }
    } else {
      resultado = new int[1];
      resultado[0] = -1;
    }
    //////////////////////////////

    return resultado;
  }
}
