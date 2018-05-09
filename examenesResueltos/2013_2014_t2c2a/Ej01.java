/**
 * El programa GestiMat (gesti�n de matr�culas) necesita almacenar los datos sobre los alumnos que
 * se matriculan en un centro educativo. Crea la clase Alumno de tal forma que de cada uno de ellos
 * se sepa su nombre, sus apellidos y su direcci�n de correo electr�nico. A cada alumno se le asigna
 * de forma autom�tica un n�mero de expediente empezando por el que se decida cada curso. El
 * siguiente programa genera la salida que se muestra:
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Alumno.setExpedienteInicial(5000);
    Alumno a1 = new Alumno("Larisa", "Pel�ez Almera", "lari@gmail.com");
    Alumno a2 = new Alumno("Benito", "Cruz Santip�n", "benito32@yahoo.com");
    System.out.println(a1);
    System.out.println(a2);
  }

}
