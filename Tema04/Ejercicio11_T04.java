/**
Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche
* @Author: AdriánChSilva
 */

public class Ejercicio_11T04 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, escriba que hora es (sin los minutos)");
    int hora = Integer.parseInt( System.console().readLine() );
    
    System.out.println("Ahora escribe los minutos");
    int minutos = Integer.parseInt( System.console().readLine() );
    
    System.out.println("Son las " + hora + " horas y " + minutos + " minutos. Faltan " + (86400 - ((hora * 3600) + (minutos * 60))) + " segundos para media noche");
  
  }
}
