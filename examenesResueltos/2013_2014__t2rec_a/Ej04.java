import java.util.Scanner;

/**
 * Modifica el ejercicio Expocoches Campanillas realizado en clase a�adiendo las siguientes mejoras:
 * a) El precio de la entrada no ser� el mismo para todas las zonas. En el momento en que se define
 * una zona, se deber� indicar - adem�s del aforo - el precio de la entrada. b) Al realizar la
 * venta, el cajero/a indicar� el precio total seg�n la zona elegida y el n�mero de personas, luego
 * aceptar� el dinero y por �ltimo devolver� el cambio. Realiza las comprobaciones que sean
 * necesarias. Nota: Ser� necesario modificar tanto la clase Zona como el programa principal.
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);

    Zona principal = new Zona(1000, 20);
    Zona compraVenta = new Zona(200, 50);
    Zona vip = new Zona(25, 100);

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
        System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender()
            + ". Cada entrada cuesta " + principal.getPrecio());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender()
            + ". Cada entrada cuesta " + compraVenta.getPrecio());
        System.out.println("En la zona vip hay " + vip.getEntradasPorVender()
            + ". Cada entrada cuesta " + vip.getPrecio());
      }

      if (opcion == 2) {
        System.out.println("\n\n1. Principal " + ". Cada entrada cuesta " + principal.getPrecio());
        System.out.println("2. Compra-venta" + ". Cada entrada cuesta " + compraVenta.getPrecio());
        System.out.println("3. Vip" + ". Cada entrada cuesta " + vip.getPrecio());
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");

        opcion2 = Integer.parseInt(s.nextLine());

        System.out.print("�Cu�ntas entradas quieres? ");
        n = Integer.parseInt(s.nextLine());
        int paga = 0;
        System.out.print("Introduzca el dinero ");
        paga = Integer.parseInt(s.nextLine());
        switch (opcion2) {
          case 1:
            principal.vender(n, paga);
            break;
          case 2:
            compraVenta.vender(n, paga);
            break;
          case 3:
            vip.vender(n, paga);
            break;
          default:
        }
      }
    } while (opcion < 3); // men� principal
  }
}


