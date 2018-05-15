/**
 * Realiza una funci�n que tome como par�metro un n�mero y que devuelva un array con los d�gitos de
 * ese n�mero separados en cada una de las celdas. Por ejemplo, convierteNumeroEnArray(1728)
 * devolver�a un array de cuatro n�meros enteros con el 1 en la posici�n 0, el 7 en la posici�n 1,
 * el 2 en la posici�n 2 y el 8 en la posici�n 3. La cabecera de la funci�n es la siguiente: public
 * static int[] convierteNumeroEnArray(long n)
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    long x = 172867656;
    int cont = 0;

    int[] resu = convierteNumeroEnArray(x);
     for(int i = 0; i<resu.length;i++) {
     System.out.print(resu[i] + " ");
     }

  }


  static int[] convierteNumeroEnArray(long n) {
    int cont = 0;
    long aux1 = n;
    
    do {
      int g = (int) (aux1 % 10);
      aux1 = aux1 / 10;
      cont++;
    } while (aux1 != 0);
    
    int[] resultado = new int[cont];
    
    do {
      resultado[cont-1] = (int) (n % 10);
      n = n / 10;
      cont--;
    } while (n != 0);


    return resultado;

  }
/**
 * /**
 * int16 arrayToInt(char *digitos, unsigned char numDig) {
    unsigned char i;
    int16 resultado = 0;

    for(i = 0; i < numDig; i++) {
        resultado = resultado*10 + digitos[i];
    }
 
 */
}
