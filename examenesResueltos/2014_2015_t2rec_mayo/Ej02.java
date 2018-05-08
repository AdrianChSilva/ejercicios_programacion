/**
  *  * Se dice que una matriz (un array bidimensional) tiene el borde homogéneo cuando todos los dígitos
que se encuentran en el borde son iguales. Por ejemplo, la siguiente matriz tiene el borde homogéneo:
2 2 2 2 2
2 4 1 5 2
2 0 9 8 2
2 2 2 2 2
Realiza una función que diga si una matriz dada tiene o no el borde homogéneo y pruébala en un
programa. Los valores de los arrays de prueba deben estar asignados en el programa, no se piden por
teclado. La cabecera de la función es la siguiente:
public static boolean tieneBordeHomogeneo(int[ ][ ] a)
 * @author adrianchs
 *
 */
public class Ej02 {

	public static void main(String[] args) {
		int[][] array = new int[4][4];
		int fila;
		int columna;
		int tirada = (int) (Math.random() * 3) + 1;

		switch (tirada) {
		case 1:
			for (fila = 0; fila < array.length; fila++) {
				for (columna = 0; columna < array.length; columna++) {
					array[fila][columna] = 1;
					if (array[1][1] == 1 && array[1][2] == 1) {
						array[1][1] = (int) (Math.random() * 7) + 3;
						array[1][2] = (int) (Math.random() * 7) + 3;
					}
					if (array[2][1] == 1 && array[2][2] == 1) {
						array[2][1] = (int) (Math.random() * 7) + 3;
						array[2][2] = (int) (Math.random() * 7) + 3;
					}
				}
			}
			break;
		case 2:
			for (fila = 0; fila < array.length; fila++) {
				for (columna = 0; columna < array.length; columna++) {
					array[fila][columna] = 2;
					if (array[1][1] == 2 && array[1][2] == 2) {
						array[1][1] = (int) (Math.random() * 7) + 3;
						array[1][2] = (int) (Math.random() * 7) + 3;
					}
					if (array[2][1] == 2 && array[2][2] == 2) {
						array[2][1] = (int) (Math.random() * 7) + 3;
						array[2][2] = (int) (Math.random() * 7) + 3;
					}
				}
			}
			break;
		case 3:
			for (fila = 0; fila < array.length; fila++) {
				for (columna = 0; columna < array.length; columna++) {
					array[fila][columna] = (int) (Math.random() * 7) + 3;
				}
			}	
			break;
		}

		for (fila = 0; fila < array.length; fila++) {
			for (columna = 0; columna < array.length; columna++) {
				System.out.printf("%4d ", array[fila][columna]);

			}
			System.out.println();
		}
		System.out.println("tirada " + tirada);
		System.out.println(tieneBordeHomogeneo(array));
		
	}

	public static boolean tieneBordeHomogeneo(int[][] a) {
		int fila;
		int columna;
		int numero;
		boolean resultado = false;
		for (fila = 0; fila < a.length; fila++) {
			for (columna = 0; columna < a.length; columna++) {
				if(a[0][0] == a[0][1] && a[0][2] == a[0][3] && a[1][0] == a[1][3] && a[2][0] == a[2][3] && a[3][0] == a[3][1] && a[3][2] == a[3][3]) {
					resultado = true;
				}else {
					resultado = false;
				}
					

			}
		}

		return resultado;

	}

}
