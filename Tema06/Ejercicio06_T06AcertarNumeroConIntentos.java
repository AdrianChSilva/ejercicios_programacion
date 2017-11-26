/**Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
es menor o mayor que el número secreto.
@author Adrian
*/
import java.util.Scanner;
public class Ejercicio06_T06AcertarNumeroConIntentos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int intentos = 5;
		int numero;
		numero = (int)(Math.random()*100);
		int numIntroducido = 0;
		do {
			System.out.println("Adivina el numero que estoy pensando. Tienes 5 intentos");
			for (int i=0; i < 5; i++) {
			numIntroducido = Integer.parseInt(s.nextLine());
			intentos--;

			if (numIntroducido == numero) {
				System.out.println("Enhorabuena has acertado");
				
				}
			if (numIntroducido < numero) {
				System.out.println(" Más ");
				System.out.println(" Te quedan " + intentos + " intentos");
			}
			if (numIntroducido > numero) {
				System.out.println(" Menos ");
				System.out.println(" Te quedan " + intentos + " intentos");
			}
			}
		} while ((numIntroducido == numero) && (intentos == 0));
		System.out.println("El numero que había pensado era " + numero);
	}
}
