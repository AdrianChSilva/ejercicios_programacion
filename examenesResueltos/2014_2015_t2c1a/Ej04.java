/**
 * Una cadena de multicines nos ha encargado una aplicación para la venta on-line de entradas. Como
 * parte de esa aplicación, tenemos que implementar una función que coloque a los espectadores en
 * una fila de butacas. Una fila de butacas es un array de una dimensión. Cada celda se corresponde
 * a una butaca que tiene el valor 0 si está libre y el valor 1 si está ocupada. La función recibe
 * como parámetros el array con la información de la fila de butacas y un número que es la cantidad
 * de gente que se quiere colocar en esa fila. Si se puede colocar a los espectadores con éxito, la
 * función devolverá un 0 y si no se puede, un -1. Lo primero que tiene que hacer la función es
 * comprobar si hay sitio, si no lo hay devolverá -1. Si hay sitio, primero intentará colocar juntos
 * a todo el grupo y, si no puede, los irá colocando en los primeros huecos que encuentre. Por
 * ejemplo, si a = { 0, 1, 0, 0, 0, 1, 0 } y se quieren colocar 3 nuevos espectadores, la función
 * devolverá 0 y el array se habrá modificado quedando así a = { 0, 1, 1, 1, 1, 1, 0 }. Prueba la
 * función desde un programa. La cabecera de la función es la siguiente: public static int
 * ocupa(int[ ] fila, int usuarios)
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej04 {

  public static void main(String[] args) {
    int tamano = (int)(Math.random()*8) +3;
    int[] array = new int[tamano];
    System.out.println("Fila antes de recolocar: ");
    for(int i = 0; i< array.length;i++) {
      array[i] = (int) (Math.random() *2);
      System.out.print(array[i] + " ");
    }
    System.out.println();
    int usuarios = 3;
    if(ocupa(array,usuarios) == 0) {
      System.out.println("Fila DESPUÉS de recolocar: ");
      for(int i = 0; i< array.length;i++) {
        if(array[i]== 0) {

          if(usuarios != 0) {
            array[i] = 1;
            usuarios--;

          }else {
            array[i] = array[i];
            
          }
        }
        System.out.print(array[i] + " ");
      }
      
    }else {
      System.out.println(ocupa(array,usuarios));
    }

  }
  public static int ocupa(int[ ] fila, int usuarios) {
    int contador = 0;
    for(int i = 0; i< fila.length;i++) {
      if(fila[i]== 0) {
        contador++;
      }
    }
    if(contador >= usuarios) {
      return 0;
    }else {
      return -1;
    }
    

    
  }
}
