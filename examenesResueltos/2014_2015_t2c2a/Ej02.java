/**
 * En una aplicaci�n de crowdfunding se necesita controlar el acceso de los usuarios a su cuenta.
 * Implementa la clase Usuario. Sobre cada usuario se quiere saber su nombre, sus apellidos, su
 * direcci�n de correo electr�nico, si tiene la cuenta activada y, en este �ltimo caso, la
 * contrase�a. Cuando se crea un nuevo usuario, por defecto est� desactivado y no tiene clave.
 * Cuando un usuario se activa, se le asigna una contrase�a de 7 d�gitos de forma aleatoria. El
 * siguiente programa genera una salida an�loga a la que se muestra:
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Usuario usu1 = new Usuario("Carmen", "Varo G�mez", "carmenvg@gmail.com");
    Usuario usuAux = new Usuario("Virginia", "V�zquez Mart�nez", "virgi84@yahoo.com");
    Usuario usu2 = new Usuario("Jes�s", "Pombo L�pez", "jpl789@yahoo.com");
    usuAux.activa();
    usu2.activa();
    System.out.println(usu1);
    System.out.println(usuAux);
    System.out.println(usu2);
    System.out.println("N� de usuarios activados: " + Usuario.getActivado());
  }

}
