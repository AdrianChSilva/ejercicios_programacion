
package funciones;

/**
 Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
es capicúa y falso en caso contrario.
2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario.
3. siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.
5. digitos: Cuenta el número de dígitos de un número entero.
6. voltea: Le da la vuelta a un número.
7. digitoN: Devuelve el dígito que está en la posición n de un número
entero. Se empieza contando por el 0 y de izquierda a derecha.
8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.
9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
derecha).
10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda).
11. pegaPorDetras: Añade un dígito a un número por detrás.
12. pegaPorDelante: Añade un dígito a un número por delante.
13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
14. juntaNumeros: Pega dos números para formar uno.
 * @author Adrian
 */


public class Ejercicios01Al14 {

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
