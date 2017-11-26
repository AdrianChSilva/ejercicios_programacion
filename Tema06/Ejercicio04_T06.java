/**
 * Ejercicio 4
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
por espacios.
 * @author Adrian
 *
 */
public class Ejercicio04_T06 {
	public static void main(String[] args) {
		
		
		for ( int i = 0; i < 20; i++) {
			int numero = (int)(Math.random()*10);
			System.out.print(numero + " ");
			
		}
	}
}
