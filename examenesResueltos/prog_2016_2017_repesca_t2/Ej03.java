/**
 * Una empresa quiere implementar un programa que lleve el control de las incidencias que se
 * producen en sus ordenadores. Cada incidencia tiene un c�digo: 1, 2, 3, 4, etc. Cuando se crea una
 * nueva incidencia, se le asigna un c�digo de forma autom�tica y se pone el estado como
 * �pendiente�. Al crear una incidencia hay que indicar tambi�n el n�mero de puesto (un n�mero
 * entero). Cuando se resuelve una incidencia, hay que proporcionar informaci�n sobre c�mo se ha
 * resuelto o qu� es lo que fallaba, adem�s, el estado pasa a �resuelta�. El siguiente trozo de
 * c�digo que va dentro del �main� genera la salida que se muestra a continuaci�n. Se debe crear
 * tanto la clase Incidencia como el programa de prueba completo.
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
    Incidencia inc2 = new Incidencia(14, "No arranca");
    Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
    Incidencia inc4 = new Incidencia(237, "Hace un ruido extra�o");
    Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
    inc2.resuelve("El equipo no estaba enchufado");
    inc3.resuelve("Cambio del cable VGA");
    System.out.println(inc1);
    System.out.println(inc2);
    System.out.println(inc3);
    System.out.println(inc4);
    System.out.println(inc5);
    System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
  }

}
