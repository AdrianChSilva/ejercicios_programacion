/**
 * Nos han encargado realizar un programa de gesti�n de tareas. El primer paso ser� crear la clase
 * que servir� como base para operar con las tareas. Crea la clase Tarea. Sobre cada tarea se debe
 * conocer su descripci�n, su prioridad y su duraci�n estimada en minutos. Adem�s a cada tarea se le
 * asignar� un n�mero a modo de c�digo que empezar� por el 1 y se ir� incrementando en uno a medida
 * que se vayan creando tareas. El siguiente trozo de c�digo que va dentro del �main� genera la
 * salida que se muestra a continuaci�n. Se debe crear tanto la clase Tarea como el programa de
 * prueba completo.
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Tarea a = new Tarea("Cambiar bombilla del pasillo", "media", 10);
    Tarea b = new Tarea("Renovar DNI", "alta", 120);
    Tarea c = new Tarea("Comprar galletas", "baja", 20);
    a.hacer();
    c.hacer();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.print(Tarea.getTiempoPendientes());
    System.out.println(" minutos pendientes para tareas");
    System.out.print(Tarea.getTiempoEmpleado());
    System.out.println(" minutos empleados en tareas");
  }

}
