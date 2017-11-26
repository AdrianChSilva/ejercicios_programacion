/** Ejercicio 5
Muestra 50 n�meros enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra tambi�n el m�ximo, el m�nimo y la media
de esos n�meros.
@author Adrian
*/
public class Ejercicio05_T06MaximoMinimoMedia {
	public static void main(String[] args) {
		int suma = 0;
		int maximo = 100; //Para comprobar el maximo, al 'maximo' hay que darle el valor m�s peque�o posible
		int minimo = 199; //Igual que el m�ximo pero viceversa
		int numero;
		
		for ( int i = 0; i < 50; i++) {
		    numero = (int)(Math.random()*100) + 100;
			System.out.print(numero + " ");
			suma += numero;
			
			if (numero > maximo) { /**aqu� se comprueba lo dicho anteriormente. si el numero (encontrado entre los 50)
			 es m�s grande que 100, lo almacena y despu�s se muestra el resultado que queremos, el m�ximo.*/
				maximo = numero;
			}
			
			if (numero < minimo) {
				minimo = numero;
			}
		}
		System.out.print("\nLa media es " + suma/10 + "\nEl maximo es: " + maximo + "\nEl minimo es: " + minimo);
		
	}
}
