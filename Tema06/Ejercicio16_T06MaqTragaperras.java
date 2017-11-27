/**
 * Ejercicio 16
Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
 * @author AdrianChSilva
 *
 */
import java.util.Scanner;
public class Ejercicio16_T06MaqTragaperras {

  public static void main(String[] args) {
    int figuras = 0;
    int monedas = 5;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    System.out.println("Bienvenido a la máquina tragaperras.");
    System.out.println("Tiene 3 monedas");
    Scanner s = new Scanner(System.in);
    
    while (monedas == 0); { //no entiendo por qué no funciona el sistema de monedas
      System.out.println("Pulse 'I' para insertar una moneda ");
      String tirada = s.nextLine();
      if (tirada.equals("i")) {
        
        for (int i = 1; i <= 3; i++) {
          
       figuras = (int)(Math.random()*5) + 1;
       
       switch (figuras) {
         case 1:
          System.out.print(" Corazon ");
           break;
         case 2:
           System.out.print(" Diamante ");
           break;
         case 3:
           System.out.print(" Herradura ");
           break;
         case 4:
           System.out.print(" Campana ");
           break;
         case 5:
           System.out.print(" Limón ");
           break;
           default:
       }
       
       switch(i) { /**En esta parte consigo que los strings anteriores tengan un valor
       para poder así aplicarles condicionales*/
         case 0:
           figura1 = figuras;
           break;
         case 1:
           figura2 = figuras;
         break;
         case 2:
           figura3 = figuras;
         break;
         default:
       }
        }
        
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
          System.out.println("\nLo siento, ha perdido.");
        } else if ((figura1 == figura2) && (figura2 == figura3)) {
          System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
        } else {
          System.out.println("\nBien, ha recuperado su moneda.");
        }
      } else {
        System.out.println("Debes pulsar la 'i' ");
      }

    }
    

  }

}
