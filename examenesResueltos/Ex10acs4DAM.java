/**
EXAMEN DAM 2017
El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por
el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
@author: AdriánChSilva
 */

public class Ex10acs4DAM{
  public static void main(String[] args) {
    //Quizás esta forma no es la más correcta, pero es efectiva para el ejercicio.
    System.out.println("Introduzca un número entero (mayor que cero):  ");
    int numero = Integer.parseInt(System.console().readLine());
    String cadena = ""; 
    cadena = Integer.toString(numero);
    cadena=cadena.replaceAll("8", "");
    String aux = cadena;
    aux = aux.replaceAll("0","");
    System.out.println("Después de haber sido comido por el gusano numérico se queda en " + aux);
    
    

    }
  }
