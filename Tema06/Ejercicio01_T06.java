/**
Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
tambi�n la suma total (los puntos que suman entre los tres dados).
*
* @author Luis Jos� S�nchez
*/

public class Ejercicio01_T06 {
  public static void main(String[] args) {
    int dado = (int)(Math.random()*6) + 1;
    System.out.println("Tirada de tres dados");  
    System.out.println(dado);
    String dadoFigura =" ";
    int suma = 0;
    
    for (int tirada = 0; tirada < 3; tirada++) {
    	int dadoNumero = (int)(Math.random()*6) +1;
    	switch(dadoNumero) {
    	case 1:
    		dadoFigura = "1";
    	}
    }
    
    }
 
  }
