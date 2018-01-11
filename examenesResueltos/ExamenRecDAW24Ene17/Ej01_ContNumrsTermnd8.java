

/**
Escribe un programa que diga cuántos números terminados en 8 ha introducido el usuario. A priori, el
programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir
los datos metiendo el 0. Los números negativos también se tienen en cuenta.
 * @author AdriChS
 */
import java.util.Scanner;
public class Ej01_ContNumrsTermnd8 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int contador = 0;
    int numeros;
    System.out.println("Por favor, vaya introduciendo números y pulsando [INTRO]:");
    do{
      numeros = s.nextInt();
      int ochos =numeros%10;
      if(ochos == 8){
        
        contador++;
      } else if (ochos == -8){
        contador++;
      }
      
    }while(numeros != 0);
    System.out.println("Ha introducido " + contador+ " números terminados en 8");
  }
}
