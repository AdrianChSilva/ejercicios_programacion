/**
 * El ayuntamiento nos va a contratar para implementar un nuevo programa que llevar� el control de
 * los aparcamientos municipales. Crea la clase Tique de tal forma que cuando se crea un nuevo tique
 * de aparcamiento se guarde el momento en el que es creado. Cada tique llevar� un n�mero
 * consecutivo, empezando por el 1. El precio es de 2 c�ntimos por minuto (0'02 �). El siguiente
 * trozo de c�digo que va dentro del �main� genera la salida que se muestra a continuaci�n. Se debe
 * crear tanto la clase Tique como el programa de prueba completo.
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Tique t1 = new Tique(10, 5);
    Tique t2 = new Tique(14, 30);
    Tique t3 = new Tique(15, 00);
    System.out.println(t1.paga(11, 00));
    System.out.println(t3.paga(17, 45));
    System.out.println(t2.paga(18, 20));
  }

}
