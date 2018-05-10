/**
 * En una aplicación de crowdfunding se necesita controlar el acceso de los usuarios a su cuenta.
 * Implementa la clase Usuario. Sobre cada usuario se quiere saber su nombre, sus apellidos, su
 * dirección de correo electrónico, si tiene la cuenta activada y, en este último caso, la
 * contraseña. Cuando se crea un nuevo usuario, por defecto está desactivado y no tiene clave.
 * Cuando un usuario se activa, se le asigna una contraseña de 7 dígitos de forma aleatoria. El
 * siguiente programa genera una salida análoga a la que se muestra:
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Usuario usu1 = new Usuario("Carmen", "Varo Gómez", "carmenvg@gmail.com");
    Usuario usuAux = new Usuario("Virginia", "Vázquez Martínez", "virgi84@yahoo.com");
    Usuario usu2 = new Usuario("Jesús", "Pombo López", "jpl789@yahoo.com");
    usuAux.activa();
    usu2.activa();
    System.out.println(usu1);
    System.out.println(usuAux);
    System.out.println(usu2);
    System.out.println("Nº de usuarios activados: " + Usuario.getActivado());
  }

}
