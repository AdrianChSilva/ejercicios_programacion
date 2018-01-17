/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios01Al14;

/**
 *
 * @author Adrian
 */
import java.util.Scanner;

public class ejercicios01Al14 {

  public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
//    System.out.println("Introduce un número ");
//    int num = s.nextInt();
//    System.out.println("Introduce una potencia");
//    int potenciaIntro = s.nextInt();
//    System.out.println("Introduce una 'posicion'");
//    int posicion = s.nextInt();
//    System.out.println("Introduce un digito");
//    int digito = s.nextInt();
//    System.out.println("Introduce cuantos numeros quieres quitar");
//    int quitar = s.nextInt();
//    System.out.println("Introduce algún numero que quieras pegar");
//    int pegar = s.nextInt();
//    System.out.println("Introduce una 'posicion inicial'");
//    int posicionInicial = s.nextInt();
//    System.out.println("Introduce una 'posicion Final'");
//    int posicionFinal = s.nextInt();
//    System.out.println("Para terminar, juntaremos dos numeros ");
//    System.out.println("Introduce el primer numero para juntar ");
//    int primero = s.nextInt();
//    System.out.println("Introduce el segundo numero para juntar ");
//    int segundo = s.nextInt();
//    
//    System.out.println();
//
//    //Comprueba si es capicuo///////////////////////////////////////////////////
//    if (esCapicua(num)) {
//      System.out.println("El numero es capicuo");
//    } else {
//      System.out.println("El numero NO es capicuo");
//    }
//    //Comprueba si es primo y da el siguiente primo más cerano//////////////////
//    if (esPrimo(num)) {
//      System.out.println("El numero es primo");
//    } else {
//      System.out.println("El numero NO es primo");
//      System.out.println("Éste es el primo siguiente más cercano " + siguientePrimo(num));
//    }
//    //Nos da la potencia////////////////////////////////////////////////////////
//    System.out.println("La potencia (" + potenciaIntro + ") es " + potencia(num, potenciaIntro));
//    //Contamos el número de digitos del numero introducido//////////////////////
//    System.out.println("El número que introduciste tiene " + digitos(num) + " dígitos");
//    //Volteamos el número///////////////////////////////////////////////////////
//    System.out.println("Mostramos el número volteado " + voltea(num));
//    //Sacamos el digito según la posición N/////////////////////////////////////
//    System.out.println("El digito que está en la posición " + posicion + " es el " + digitoN(num, posicion));
//    //Sacamosla posicion del digito/////////////////////////////////////////////
//    System.out.println("La posicion de la primera ocurrencia del digito es " + posicionDeDigito(num, digito));
//    //Quitamos N numeros por detras/////////////////////////////////////////////
//    System.out.println("Quitando " + quitar + " números por detrás, el número se queda: " + quitaPorDetras(num, quitar));
//    //Quitamos N numeros por detras/////////////////////////////////////////////
//    System.out.println("Quitando " + quitar + " números por delante, el número se queda: " + quitaPorDelante(num, quitar));
//    //Pegamos N numeros por detras//////////////////////////////////////////////
//    System.out.println("Pegando " + pegar + " números por detrás, el número se queda: " + pegaPorDetras(num, pegar));
//    //Pegamos N numeros por delante/////////////////////////////////////////////
//    System.out.println("Pegando " + pegar + " números por delante, el número se queda: " + pegaPorDelante(num, pegar));
//    //Trozo de numeros//////////////////////////////////////////////////////////
//    System.out.println("Al " + num + " le cogemos el trozo que va desde " + posicionInicial + " hasta la " + posicionFinal + " y nos da " + trozoDeNumero(num, posicionInicial, posicionFinal));
//    //Juntamos dos numeros//////////////////////////////////////////////////////
//    System.out.println("Si juntamos el " + primero + " y el " + segundo + " nos da " + juntaNumeros(primero,segundo));
//
  }

  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long volteado = 0;

    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;

    }

    return volteado;
  }

  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;
      }

    }
    return true;
  }

  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {
    };

    return x;
  }

  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1 / potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }

  public static int digitos(long x) {
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;

      }
      return n;
    }
  }

  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 1) {
      x = x / 10;
    }

    return (int) x % 10;
  }

  public static int posicionDeDigito(long x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {
    };

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }

  public static long quitaPorDetras(long x, int n) {
    return x / (long) potencia(10, n);
  }

  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1);
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

  public static long juntaNumeros(long x, long y) {
    return (long) (x * potencia(10, digitos(y))) + y;
  }

}
