/**
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se
 * especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas): public
 * static int[ ] extraePares(int x[ ]) // Devuelve un array con todos los números pares que se //
 * encuentren en otro array que se pasa como parámetro. // Lógicamente el tamaño del array que se
 * devuelve será // menor o igual al que se pasa como parámetro. Utiliza esta función en un programa
 * para comprobar que funcionan bien. Si en el array no existe ningún número par, se devuelve un
 * array con el número -1 como único elemento.
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

  public static int[] extraePares(int x[]) {// con esta función podría extraer pares, capicuos, etc

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
