/*
Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
*/

public class ejercicio05 {// Clase principal
  public static void main(String[] args) {
    
    int euros = 250000; 
    double pesetas = 166.386;
    long conversor= (int) (euros * pesetas);
    
    System.out.println("250.000€ en pesetas son: " + conversor + " pesetas");
  
  }
}
