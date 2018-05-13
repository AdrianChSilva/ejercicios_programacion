/**
 * Crea la clase Potencia. Cada potencia tiene una base y un exponente. Para
simplificar, consideramos únicamente las potencias con exponente entero (la base sí
podrá tener decimales). Cuando se multiplican dos potencias con la misma base, se
conserva la base y se suman los exponentes. Cuando se dividen dos potencias con la
misma base, se conserva la base y se restan los exponentes. Define
convenientemente el método toString y los métodos multiplicaPor() y divideEntre()
de tal forma que el siguiente programa muestre la salida que se indica. En caso de
que el usuario intente multiplicar o dividir potencias de distinta base, se debe mostrar
un mensaje de error y devolver la potencia cero elevado a cero.
 * @author Adrian
 *
 */
public class Ej02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Potencia p1 = new Potencia(5, 3);
    Potencia p2 = new Potencia(2, 0);
    Potencia p3 = new Potencia(5, 2);
   System.out.println(p1 + " "  + p2 + " " + p3);
   System.out.println(p1.multiplicaPor(p2)); 
   System.out.println(p1.multiplicaPor(p3));
   System.out.println(p1.divideEntre(p3));
  }

}
