
/**
 Ejercicio 22
Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
 * @author AdriChS
 */
import java.util.Scanner;
public class Ejercicio22_T06Serpiente {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int longitud = s.nextInt();
    int ultimaPosicion = 13;    
    for (int i = 0; i < longitud; i++) {       
      for (int e = 0; e <= ultimaPosicion; e++) {
        if (i == 0 && e == ultimaPosicion) {
          System.out.print("@");
        } else if (e==ultimaPosicion){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      ultimaPosicion += (int)(Math.random() * 3) - 1;     
      System.out.println();
    }
  }
}
