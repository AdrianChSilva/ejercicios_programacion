import java.util.Arrays;

/**
 * 
 * @author Adrichs
 *
 */
public class Ej03_PalabrasComunes {

	public static void main(String[] args) {
		String[] a = {"casa", "coche", "sol", "mesa", "ordenador", "sol", "CASA"};
		String[] b = {"zambomba", "coche", "casa", "sol", "mermelada"};

	
		System.out.println(Arrays.toString(palabrasComunes(a,b)));
	}
	
	public static String[] palabrasComunes(String[] a, String[] b) {
		String[] resultado = new String[5];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j])) {
					
					resultado[j] = b[j]; 
				}
			}
		}
		
		return resultado;
		
	}

}
//if (a[i] == b[j]) { <--- También sirve