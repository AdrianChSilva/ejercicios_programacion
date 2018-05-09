/**
 * Escribe un programa que genere una secuencia de 6 fichas de domin� perfectamente colocadas.
Cada ficha tiene dos mitades y cada mitad contiene un n�mero de puntitos del 0 (blanca) al 6. Para
que dos fichas consecutivas est�n bien colocadas, deben coincidir las dos mitades que se ponen
juntas. Hay que tener en cuenta que la ficha [2 | 4] es la misma que la ficha [4 | 2]. Cada ficha que va
saliendo debe ser un objeto de la clase Ficha.
Ejemplo:
[ 1 | 4 ] [ 4 | 5 ] [ 5 | 3 ] [ 3 | 3 ] [ 3 | ] [ | 6 ]
De forma ideal, en la secuencia mostrada, no se pueden
 * @author https://github.com/GuillermoGarcia
 *
 */
public class Ej04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    boolean[][] creadas = new boolean[7][7];
    inicializar(creadas);
    boolean nueva = true;
    int numeroFicha = 5;

    Ficha ficha = new Ficha((int)(Math.random() * 7), (int)(Math.random() * 7));
    System.out.print(ficha);
    int esquinaAnterior = ficha.valorDerecha();

    while (numeroFicha > 0){
      do {
        ficha = new Ficha(esquinaAnterior, (int)(Math.random() * 7));
        if (!yaCreada(creadas,ficha)){
          guardarCreada(creadas,ficha);
          nueva = true;
        } else {
          nueva = false;
        }
      } while(!nueva);
      esquinaAnterior = ficha.valorDerecha();
      System.out.print(ficha);
      numeroFicha--;
    }

  }

  /*
   * Inicializa un array bidimensional de booleans con valores 'false'
   *
   * @param: boolean[][], array bidimensional de booleans
   *
   * @return void
   */
  public static void inicializar(boolean[][] c){
    for (int i = 0; i < c.length; i++){
      inicializar(c[i]);
    }
  }

  /*
   * Inicializa un array unidimensional de booleans con valores 'false'
   *
   * @param: boolean[], array unidimensional de booleans
   *
   * @return void
   */
  public static void inicializar(boolean[] c){
    for (int i = 0; i < c.length; i++){
      c[i] = false;
    }
  }

  /*
   * Comprueba si una ficha ya ha sido creada.
   *
   * @param: boolean[][], array bidimensional con las fichas ya creadas.
   * @param: Ficha, ficha que vamos a comprobar si ha sido creada
   *
   * @return: boolean, True si ya ha sido creada, False si no ha sido creada.
   *
   */
  public static boolean yaCreada(boolean[][] c, Ficha f){
    int[] valores = f.getValores();
    return c[valores[0]][valores[1]];
  }

  /*
   * Guarda una ficha, no creada anteriormente, en el array bidimensional.
   *
   * @param: boolean[][], array bidimensional con las fichas ya creadas.
   * @param: Ficha, ficha que vamos a guardar.
   *
   * @return: void
   *
   */

  public static void guardarCreada(boolean[][] c, Ficha f){
    int[] valores = f.getValores();
    c[valores[0]][valores[1]] = true;
    c[valores[1]][valores[0]] = true;
  }

}
