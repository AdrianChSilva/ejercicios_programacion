/**
Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo)
 * @author AdrianChSilva
 */

public class Ejercicio17_T05{
  public static void main(String[] args) {
  
    int numeroIntroducido = 0;
    
    do { //con esto (el 'do' y el 'if') comprobamos si el numero es positivo
      System.out.print("Introduzca un número entero positivo: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
      }
    } while (numeroIntroducido < 0); //con el 'do while' hemos querido decir que repita la operación hasta que el usuario introduzca el numero positivo y se salga del bucle 'do while'
    
    int suma = 0; //siempre es conveniente declarar la variable 'suma' "vacía" para después asignarle algún valor
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    } /**con este 'for' hemos dicho que; declaramos la variable 'i' la cual será igual al 
    'numeroIntroducido'por teclado. Después con "i < numeroIntroducido + 100" hemos dicho
    * que si 'i' es menor al numerointroducido más 100 (i(5)= 5 +100=105 | i(5) < 105), éste
    * vaya incrementadose ("i++") hasta llegar al 'numeroIntroducido+100'.
    * Para acabar, la sentencia "suma += i", la cual quiere decir; suma = suma + i y el resultado pasa a ser 
    * la variable suma, y así hasta que llegue a los 100 números siguientes
    * */
    

    System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es " + suma);
  }
}
