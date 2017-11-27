/**
Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por carac-
teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.
@author: AdrianChSilva
 */
public class Ejercicio10_T06PintarLineas{
  public static void main(String[] args) {
    
    int caracter = 0;
    //El resultado es diferente al que se pide en el enunciado
    //En éste ejercicio se pintan 10 líneas con 40 caracteres aleatorios

    for(int fila = 0; fila < 10; fila++){
     System.out.println();
     
     for(int longitud = 1; longitud <= 40; longitud++){
       caracter = (int)(Math.random() * 6) + 1;
       switch (caracter){
         case 1:
         System.out.print("*");
         break;
         case 2:
         System.out.print("@");
         break;
         case 3:
         System.out.print("-");
         break;
         case 4:
         System.out.print("=");
         break;
         case 5:
         System.out.print("|");
         break;
         case 6:
         System.out.print(".");
         break;
       }
       
     }
    
      
    }
  }
}

