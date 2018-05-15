import java.util.Scanner;

public class Ej03_ContarCoincidencias {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String palabra = s.nextLine().toLowerCase();
    // TODO Auto-generated method stub
    String[] a = {"casa", "coche", "sol", "mesa", "ordenador", "sol", "CASA"};
    String[] b = {"zambomba", "coche", "casa", "sol", "mermelada"};
    int cont = cuentaPalabra(a,palabra,true);

    // este bucle diferencia las mayusculas
//    for (int i = 0; i < a.length; i++) {
//      if (palabra.equals(a[i].toLowerCase())) {
//        cont++;
//      }
//    }
    System.out.print("coincidencias " + cont);
  }

  public static int cuentaPalabra(String[] a, String palabra, boolean distingueMayMin) {
    int contador = 0;
    if (distingueMayMin == false) {//Lo convierte todo en minusculas
      palabra.toLowerCase();
      for (int i = 0; i < a.length; i++) {
        if (palabra.equals(a[i].toLowerCase())) {
          contador++;
        }
      }
    } else {
      for (int i = 0; i < a.length; i++) {
        if (palabra.equals(a[i])) {
          contador++;
        }
        
      }
    }
    return contador;

  }
}
