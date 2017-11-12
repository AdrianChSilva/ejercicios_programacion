/**
Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.
 * @author AdrianChSilva
 */

public class Ejercicio18_T05{
  public static void main(String[] args) {
    int numeroMenor = 0;
    int numeroMayor = 0;
    System.out.println("Vamos a introducir dos numeros e ir incrementando de 7 en 7");
    do{
      System.out.println("Introduzca un número entero positivo: ");
      numeroMenor = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduzca un número entero positivo distinto al anterior: ");
      numeroMayor = Integer.parseInt(System.console().readLine());
            
      if(numeroMayor == numeroMenor) {
      System.out.println("Debe introducir un número distinto al anterior");
    }
     }while (numeroMayor == numeroMenor);
     
         // si el primer número es mayor que el segundo, se intercambian los valores
    if (numeroMenor > numeroMayor) {
      int aux = numeroMenor;
      numeroMenor = numeroMayor;
      numeroMayor = aux; 
    } /**con esto intercambiamos el orden. El primero numero, el cual era mayor, 
    pasa a ser el segundo número (el cual era menor) y el segundo pasa a ser el primero
    * para que así podamos ir contando de 7 en 7 correctamente*/
    
     int incremento = 0;
     for (int i = numeroMenor; i < numeroMayor; i+=7){
      System.out.print(i + " ");
   }
  
   
  }
 }

