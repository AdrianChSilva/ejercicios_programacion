/**
 * 7. Queremos gestionar la venta de entradas (no numeradas) de
 *    Expocoches Campanillas que tiene 3 zonas, la sala principal con
 *    1000 entradas disponibles, la zona de compra-venta con 200
 *    entradas disponibles y la zona vip con 25 entradas disponibles.
 *    Hay que controlar que existen entradas antes de venderlas.
 *    La clase <code>Zona</code> con sus atributos y m�todos se
 *    proporciona al alumno.
 *    <p>
 *    El men� del programa debe ser el que se muestra a continuaci�n.
 *    Cuando elegimos la opci�n <code>2</code>, se nos debe preguntar
 *    para qu� zona queremos las entradas y cu�ntas queremos.
 *    L�gicamente, el programa debe controlar que no se puedan vender
 *    m�s entradas de la cuenta.
 *    <p>
 *    <code>
 *    <pre> 
 *    1. Mostrar n�mero de entradas libres
 *    2. Vender entradas
 *    3. Salir
 *    </pre>
 *    </code>
 * @author Luis José Sánchez
 */
import java.util.Scanner;
public class ExpocochesCampanillas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    int opcion = 0;
    int opcion2 = 0;
    int n = 0;
    
    do {
      System.out.println("\n\nEXPOCOCHES CAMPANILLAS");
      System.out.println("1. Mostrar n�mero de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.println("Elige una opci�n: ");
      
      opcion = Integer.parseInt(s.nextLine());
      
      if (opcion == 1) {
        System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
        System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
      }
      
      if (opcion == 2) {
        System.out.println("\n\n1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. Vip");
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");
        
        opcion2 = Integer.parseInt(s.nextLine());
        
        System.out.print("�Cu�ntas entradas quieres? ");
        n = Integer.parseInt(s.nextLine());
        
        switch (opcion2) {
          case 1:
            principal.vender(n);
            break;
          case 2:
            compraVenta.vender(n);
            break;
          case 3:
            vip.vender(n);
            break;
          default:
        }
      }
    } while (opcion < 3); // men� principal  
  }
}

