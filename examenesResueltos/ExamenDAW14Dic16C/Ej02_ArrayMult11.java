
/**
 * Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 11 comprendidos entre el
 * 330 y el 550 ambos incluidos.
 *
 * @author Adrian
 */
public class Ej02_ArrayMult11 {

  public static void main(String[] args) {
    System.out.println("Secuencia aleatoria de 10 números múltiplos de 11: ");
    int numero = 0;

    for (int i = 1; i <= 10; i++) {
      numero = (((int) (Math.random() * 22) + 33) * 11);
      System.out.print(numero + " ");
    }
  }
}
