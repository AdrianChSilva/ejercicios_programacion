

/**
Ejercicio 2
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
 * @author Adrian
 */
public class Ejercicio02_T07 {
  public static void main(String[] args) {
    
    char[] car  = new char[12];
    
    car[0] = 'a';
    car[1] = 'x';
    car[4] = '@';
    car[6] = ' ';
    car[7] = '+';
    car[8] = 'Q';
    
    
    for(int i = 0; i < 12; i++){
      System.out.print(car[i]);
    }
   
            
  }
}


