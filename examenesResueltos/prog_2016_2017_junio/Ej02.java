/**
 * Realiza las funciones parizarArray e imparizarArray. La funci�n parizarArray debe ser capaz de
 * convertir todos los n�meros contenidos en un array en n�meros pares. La funci�n ir� comprobando
 * cada n�mero uno por uno, si es par lo deja como est� y, si es impar, busca el siguiente par (le
 * suma 1). La funci�n imparizarArray es an�loga pero transformando a n�meros impares. Por ejemplo,
 * si tenemos el array a = {7, 10, 20, 11, -5, 33. 100}, parizarArray(a) deber�a devolver el array
 * {8, 10, 20, 12, -4, 34. 100} mientras que imparizarArray(a) deber�a devolver {7, 11, 21, 11, -5,
 * 33. 101}. La cabecera de las funciones son las siguientes: public static int[] parizarArray(int[]
 * a) public static int[] imparizarArray(int[] a) Verifica que las funciones son correctas mediante
 * un programa de prueba.
 * 
 * @author adrichs
 *
 */
public class Ej02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int x = (int) (Math.random() * 9) + 3;
    int[] array = new int[x];
    System.out.println("ARRAY ORIGINAL");
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 8) + 1;
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("ARRAY PARIZADO");
    int[] parizado = parizarArray(array);
    for (int i = 0; i < parizado.length; i++) {
      System.out.print(parizado[i] + " ");
    }
    System.out.println();
    System.out.println("ARRAY IMPARIZADO");
    int[] imparizado = imparizarArray(array);
    for (int i = 0; i < imparizado.length; i++) {
      System.out.print(imparizado[i] + " ");
    }
    System.out.println();
  }
  public static int[] parizarArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if ((a[i] % 2) != 0) {
        a[i]++;
      }

    }
    return a;
  }
  public static int[] imparizarArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if ((a[i] % 2) == 0) {
        a[i]--;
      }
    }
    return a;
  }
}
