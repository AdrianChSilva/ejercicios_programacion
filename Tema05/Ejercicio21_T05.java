/**
Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * @author AdrianChSilva
 */

public class Ejercicio21_T05{
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int contador = -1;
    int contadorImpares = 0;
    int suma= 0;
    int maximoPar = 0;
    System.out.println("Vaya introduciendo numeros.");
    System.out.println("Para parar el programa introduzca un numero negativo");
    do {
      
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        contador++;
      if ((numeroIntroducido%2) == 1){ // con " x%2 == 1" sabemos si el numero es impar porque al dividir el numero entre 2, el resto nos da 1
        contadorImpares++;
        suma += numeroIntroducido;
      }   else { // número par
          if (numeroIntroducido > maximoPar)
            maximoPar = numeroIntroducido;
        }
    
    } while (numeroIntroducido >= 0);
  

    System.out.println("Ha introducido " + contador + " números");
    System.out.println("La media de los impares es " + suma/contadorImpares );
    System.out.println("El máximo de los pares es " + maximoPar);

    }  
}
