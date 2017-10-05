/*
Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
*/

public class ejercicio04 {// Clase principal
  public static void main(String[] args) {
    
    double pesetas = 273; 
    float euros = (float) (pesetas * 0.006);
    
    System.out.println("273 pesetas son: " + euros + "€");
  
  }
}
