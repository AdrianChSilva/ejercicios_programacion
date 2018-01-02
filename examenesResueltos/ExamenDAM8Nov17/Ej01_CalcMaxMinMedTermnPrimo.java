
/**
Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 * @author AdriChS
 */
import java.util.Scanner;
public class Ej01_CalcMaxMinMedTermnPrimo {
  public static void main(String[] args) {
    boolean esPrimo;
    Scanner s = new Scanner(System.in);
    int contador = 0;
    int minimo = 0;
    int dividendo = 0;
    int num;
    int maximo = 0;

    System.out.println("Por favor, vaya introduciendo números enteros positivos."
      + " Para terminar,\n" + "introduzca un número primo:");
    
    do{
      num = Integer.parseInt(s.nextLine());
      int i = 2;
      esPrimo = true;
      //Aquí se comprueba si el numero es primo/////////////////////////////////
      while(i < num){
        if (num%i == 0){
          esPrimo = false;
        }
        i++;
      }
      //////////////////////////////////////////////////////////////////////////
      if (esPrimo == false){
        if ((num < minimo) || (contador == 0)){
          minimo = num;
        }
        if (num > maximo){
          maximo = num;
        }
        dividendo += num;//se suman todos los numeros introducidos
        //EL contador se puede poner aquí y ya no tendría en cuenta el primo////
      }
      contador++;
    } while (esPrimo == false);
    double media = (double)(dividendo)/(double)(contador - 1);
    System.out.println("Ha introducido "+ (contador-1) + " números no primos.");
    System.out.println("Máximo: "+ maximo);
    System.out.println("Mínimo: "+ minimo);
    System.out.println("Media: "+ media);
  }
}

