/**
Ejercicio 15
Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como *, +,
-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
izquierda o hacia la derecha.
* @Author: AdriánChSilva
 */

public class Ejercicio15_T04 {
  public static void main(String[] args) {

    System.out.println("Vamos a pintar una pirámide, en la cual vas a elegir qué caracter tendrá de relleno.");
    System.out.println("Además, podrás elegir hacia donde apunta el vértice en la pirámide (sólo los 4 puntos cardinales)");
    String x = System.console().readLine();
    System.out.println("Elija una opción (1-4): ");
    System.out.println("1) Vértice hacia arriba");
    System.out.println("2) Vértice hacia abajo");
    System.out.println("3) Vértice hacia la izquierda");
    System.out.println("4) Vértice hacia la derecha");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.println("    "+x);
        System.out.println("   "+x+x+x);
        System.out.println("  "+x+x+x+x+x);
        System.out.println(" "+x+x+x+x+x+x+x);
        break;
      
      case 2 : 
        System.out.println(" "+x+x+x+x+x+x+x);
        System.out.println("  "+x+x+x+x+x);
        System.out.println("   "+x+x+x);
        System.out.println("    "+x);
        break;
      
      case 3 :
        System.out.println("    " + x);
        System.out.println("  " + x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println("  " + x + " " + x);
        System.out.println("    " + x);
        break;
        
      case 4:
        System.out.println(x);
        System.out.println(x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println(x + " " + x);
        System.out.println(x);  
        break;  
    
}
  }
}

