/** Ejercicio 5
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
@author Adrian
*/
public class Ejercicio05_T06MaximoMinimoMedia {
	public static void main(String[] args) {
		int suma = 0;
		int maximo = 100; //Para comprobar el maximo, al 'maximo' hay que darle el valor más pequeño posible
		int minimo = 199; //Igual que el máximo pero viceversa
		int numero;
		
		for ( int i = 0; i < 50; i++) {
		    numero = (int)(Math.random()*100) + 100;
			System.out.print(numero + " ");
			suma += numero;
			
			if (numero > maximo) { /**aquí se comprueba lo dicho anteriormente. si el numero (encontrado entre los 50)
			 es más grande que 100, lo almacena y después se muestra el resultado que queremos, el máximo.*/
				maximo = numero;
			}
			
			if (numero < minimo) {
				minimo = numero;
			}
		}
		System.out.print("\nLa media es " + suma/10 + "\nEl maximo es: " + maximo + "\nEl minimo es: " + minimo);
		
	}
}
