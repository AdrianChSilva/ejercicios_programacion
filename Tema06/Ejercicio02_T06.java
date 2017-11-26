/** Ejercicio 2
Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n).
@author Adrian
*/
public class Ejercicio02_T06 {
	public static void main(String[] args) {
	  
		
	    int carta = (int)(Math.random()*12) + 1;
	    int palos = (int)(Math.random()*4) + 1;
	    switch (palos) {
	    case 1:
	    	if (carta == 11) {
	    		System.out.println("J de picas" );
	    	} else if (carta == 12) {
	    		System.out.println("Q de picas" );
	    	} else if (carta == 13) {
	    		System.out.println("K de picas" );
	    	} else {
	    	System.out.println(carta + " de picas" );
	    	}
	    	break;
	    case 2:
	    	System.out.println(carta + " de corazones" );
	    	break;
	    case 3: 
	    	System.out.println(carta + " de tréboles" );
	    	break;
	    case 4: 
	    	System.out.println(carta + " de diamantes" );
	    	break;
	    }
	    
		
	}
}
