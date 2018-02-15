/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author Adrian
 */
public class NuevasFunciones {

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
    }

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

  public static long biToDec(long x) {
    long digito, decimal;
    int exponente;
    //proceso para pasar de binario a decimal///////////////////////////////////
    exponente = 0;
    decimal = 0;
    while (x != 0) { //Aquí decimos que coja cada 1 del numero binario////
      digito = x % 10;
      decimal = decimal + digito * (int) Math.pow(2, exponente);
      exponente++;
      x = x / 10; //Aquí vamos acortando el número para que 'digito' pueda seguir cogiendo el último numero

    }
    return decimal;
  }

  public static long decToBi(long x) {
    long digito, binario;
    int exponente;
    exponente = 0;
    binario = 0;
    while (x != 0) {
      digito = x % 2;
      binario = binario + digito * (int) Math.pow(10, exponente);
      exponente++;
      x = x / 2;

    }
    return binario;
  }

  public static String decToHex(int x) {

    int digito;
    String letra = "";
    char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    while (x > 0) {
      digito = x % 16;
      letra = hex[digito] + letra;
      x = x / 16;
    }
    return letra;
  }

  public static long hexToBi(String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;

    for (int i = 0; i < hexadecimal.length(); i++) {
      binario = binario * 10000 + decToBi(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }

    return binario;
  }

  public static long decToOct(long x) {
    long digito, octal;
    int exponente;
    exponente = 0;
    octal = 0;
    while (x != 0) {
      digito = x % 8;
      octal = octal + digito * (int) Math.pow(10, exponente);
      exponente++;
      x = x / 8;

    }
    return octal;
  }

  public static long octToDec(long numero) {
    long valor = 0, digito, total = 0;
    while (numero > 0) {
      digito = numero % 10;	//cogemos el digito
      numero /= 10;		//kitamos el digito del numero
      total += digito * (int) Math.pow(8, valor);
      valor++;
    }
    return total;
  }

}
