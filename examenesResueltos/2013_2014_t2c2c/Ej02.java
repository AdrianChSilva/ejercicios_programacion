/**
 * La cadena de tiendas EnteraMark quiere premiar la fidelidad de sus clientes ofreciendo descuentos
 * y regalos en función de los puntos acumulados en una tarjeta. Crea la clase Tarjeta con los
 * atributos numero, titular y puntos. Cuando se crea una nueva tarjeta, se le asigna de forma
 * automática un número aleatorio de 6 dígitos y la cuenta de puntos se inicializa a 0. Con cada
 * compra, se van acumulando puntos según el producto, las ofertas vigentes, etc. El siguiente
 * programa genera la salida que se muestra:
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Tarjeta t1 = new Tarjeta("Marta Gutiérrez Pérez");
    Tarjeta t2 = new Tarjeta("Tomás García Belda");
    Tarjeta t3 = new Tarjeta("Gonzalo Doblas Faiz");
    t1.acumula(10);
    t1.acumula(2);
    t2.acumula(25);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
  }

}
