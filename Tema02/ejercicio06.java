/*
Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable
*/

public class ejercicio06 {// Clase principal
  public static void main(String[] args) {
    
    double patatas = 3.52; 
    double leche = 1.50;
    double iva = 1.11;
    double totalSin = patatas + leche;
    float totalCon = ((float)patatas + (float)leche) * (float)iva;
    
    System.out.println("Factura sin I.V.A = " + totalSin + ". Factura con I.V.A = " + totalCon);
  
  }
}
