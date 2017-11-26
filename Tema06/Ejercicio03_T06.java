/**
 * Ejercicio 3
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * @author Adrian
 *
 */
public class Ejercicio03_T06 {
	public static void main(String[] args) {
	    int carta = (int)(Math.random()*10) + 1;
	    int palos = (int)(Math.random()*4) + 1;
	    switch (palos) {
	    case 1:
	    	if (carta == 1) {
	    	System.out.println("as de oros");
	    	} else if (carta == 8) {
	    	System.out.println("sota de oros");
	    	} else if (carta == 9) {
	    	System.out.println("caballo de oros");
	    	} else if (carta == 10) {
	    	System.out.println("rey de oros");	
	    	} else {
	    	System.out.println(carta + " de oros" );
	    	}
	    	break;
	    case 2:
	    	if (carta == 1) {
	    	System.out.println("as de bastos");
	    	} else if (carta == 8) {
	    	System.out.println("sota de bastos");
	    	} else if (carta == 9) {
	    	System.out.println("caballo de bastos");
	    	} else if (carta == 10) {
	    	System.out.println("rey de bastos");	
	    	} else {
	    	System.out.println(carta + " de bastos" );
	    	}
	    	break;
	    case 3: 
	    	if (carta == 1) {
	    	System.out.println("as de copas");
	    	} else if (carta == 8) {
	    	System.out.println("sota de copas");
	    	} else if (carta == 9) {
	    	System.out.println("caballo de copas");
	    	} else if (carta == 10) {
	    	System.out.println("rey de copas");	
	    	} else {
	    	System.out.println(carta + " de copas" );
	    	}
	    	break;
	    case 4: 
	    	if (carta == 1) {
	    	System.out.println("as de espadas");
	    	} else if (carta == 8) {
	    	System.out.println("sota de espadas");
	    	} else if (carta == 9) {
	    	System.out.println("caballo de espadas");
	    	} else if (carta == 10) {
	    	System.out.println("rey de espadas");	
	    	} else {
	    	System.out.println(carta + " de espadas" );
	    	}
	    	break;
	    }
	}
}


