/**
EXAMEN DAM 2017
Ejercicio 2
La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El
IVA ya está incluido en todas las tarifas.
Ejemplo:
Introduzca la altura de la bandera en cm: 20
Ahora introduzca la anchura: 35
¿Quiere escudo bordado? (s/n): n
Gracias. Aquí tiene el desglose de su compra.
Bandera de 700 cm²: 7.00 €
Sin escudo: 0.00 €
Gastos de envío: 3.25 €
Total: 10.25 
@author: AdriánChSilva
 */

public class Ex10acs2DAM{
  public static void main(String[] args) {
    int alto;
    int ancho;
    double precio = 0.01;
    String decision;
    double bordado = 2.50;
    double gastosEnvio = 3.25;
    
     System.out.println("Introduzca la altura de la bandera en cm:");
     alto = Integer.parseInt(System.console().readLine());
     System.out.println("Ahora introduzca la anchura:");
     ancho = Integer.parseInt(System.console().readLine());
     System.out.println("¿Quiere bordado? (s/n)");
     decision = (System.console().readLine());
     
     switch(decision){
       case "s":
         int altoXAncho = alto * ancho;
         double precioCalculado = altoXAncho * precio;
         double totalConEscudo = precioCalculado + bordado + gastosEnvio;
         
         System.out.println("Bandera de " + altoXAncho + " cm2: " + precioCalculado + "€");
         System.out.println("Con escudo: " + bordado + "€");
         System.out.println("Gastos de envío " + gastosEnvio);
         System.out.println("total: " + totalConEscudo + "€");
         break;
         
       case "n":
         int altoXAnchoSin = alto * ancho;
         double precioCalculadoSin = altoXAnchoSin * precio;
         double totalSinEscudo = precioCalculadoSin + gastosEnvio;
         
         System.out.println("Bandera de " + altoXAnchoSin + " cm2: " + precioCalculadoSin + "€");
         System.out.println("Con escudo: " + 0 + "€");
         System.out.println("Gastos de envío " + gastosEnvio + "€");
         System.out.println("total: " + totalSinEscudo + "€");
         break;
     }
  }
}
