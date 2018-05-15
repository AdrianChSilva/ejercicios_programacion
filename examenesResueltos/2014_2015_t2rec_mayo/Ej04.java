/**
 * Crea las clases Punto y Linea. De un punto se tienen que saber sus coordenadas x e y, mientras que
una línea está definida por dos puntos. Define las clases y los métodos necesarios para que el
siguiente programa muestre la salida que se indica.
 * @author adrian.chamorrosilva
 *
 */
public class Ej04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Punto p1 = new Punto(4.21, 7.3);
    Punto p2 = new Punto(-2, 1.66);
    Linea l = new Linea(p1, p2);
    System.out.println(l);
  }

}
