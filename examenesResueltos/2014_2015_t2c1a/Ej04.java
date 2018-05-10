/**
 * Una cadena de multicines nos ha encargado una aplicaci�n para la venta on-line de entradas. Como
 * parte de esa aplicaci�n, tenemos que implementar una funci�n que coloque a los espectadores en
 * una fila de butacas. Una fila de butacas es un array de una dimensi�n. Cada celda se corresponde
 * a una butaca que tiene el valor 0 si est� libre y el valor 1 si est� ocupada. La funci�n recibe
 * como par�metros el array con la informaci�n de la fila de butacas y un n�mero que es la cantidad
 * de gente que se quiere colocar en esa fila. Si se puede colocar a los espectadores con �xito, la
 * funci�n devolver� un 0 y si no se puede, un -1. Lo primero que tiene que hacer la funci�n es
 * comprobar si hay sitio, si no lo hay devolver� -1. Si hay sitio, primero intentar� colocar juntos
 * a todo el grupo y, si no puede, los ir� colocando en los primeros huecos que encuentre. Por
 * ejemplo, si a = { 0, 1, 0, 0, 0, 1, 0 } y se quieren colocar 3 nuevos espectadores, la funci�n
 * devolver� 0 y el array se habr� modificado quedando as� a = { 0, 1, 1, 1, 1, 1, 0 }. Prueba la
 * funci�n desde un programa. La cabecera de la funci�n es la siguiente: public static int
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
      System.out.println("Fila DESPU�S de recolocar: ");
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
