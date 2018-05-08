/**
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Tarea {
  private String descripcion;
  private String prioridad;
  private int minutos;
  private boolean resolucion = false;
  private int numero;
  
  
  /**Todo lo que tenga que ver con contar, sumar, etc llamando al nombre de la clase, utilizaremos
   * 'Static'. Esto hace que se le asigne "algo" (un numero en este caso) en concreto al objeto
   * por cada vez que se INSTANCIA un objeto
   */
  private static int tiempoEmpleado = 0;
  private static int tiempoPendientes = 0;
  private static int numeroTarea = 0;


  public static int getTiempoEmpleado() {
    return tiempoEmpleado;
  }



  public static void setTiempoEmpleado(int tiempoEmpleado) {
    Tarea.tiempoEmpleado = tiempoEmpleado;
  }



  public static int getTiempoPendientes() {
    return tiempoPendientes;
  }



  public static void setTiempoPendientes(int tiempoPendientes) {
    Tarea.tiempoPendientes = tiempoPendientes;
  }



  public static int getNumeroTarea() {
    return Tarea.numeroTarea;
  }



  public static void setNumeroTarea(int numeroTarea) {
    Tarea.numeroTarea = numeroTarea;
  }
  
  public static int obtenerNumero() {
    Tarea.setNumeroTarea(Tarea.getNumeroTarea() + 1);
    return Tarea.getNumeroTarea();
  }


  public Tarea(String descripcion, String prioridad, int minutos) {
    this.numero = Tarea.obtenerNumero();
    this.descripcion = descripcion;
    this.prioridad = prioridad;
    this.minutos = minutos;
    if (this.resolucion == false) {
    Tarea.setTiempoPendientes(Tarea.getTiempoPendientes() + minutos);
    }
  }


  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getPrioridad() {
    return prioridad;
  }

  public void setPrioridad(String prioridad) {
    this.prioridad = prioridad;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }


  public void hacer() {
    this.resolucion = true;
    Tarea.setTiempoEmpleado(Tarea.getTiempoEmpleado() + this.minutos);
    Tarea.setTiempoPendientes(Tarea.getTiempoPendientes() - this.minutos);
  }


  @Override
  public String toString() {
    String resultado = "";
    if (resolucion == true) {
      resultado = "Tarea " + this.numero+ " :" + descripcion + ", prioridad " + prioridad + ". Hecha";
    } else {
      resultado = "Tarea "+ this.numero+ " :"+ descripcion + ", prioridad " + prioridad + ". Pendiente";
    }
    return resultado;
  }

}
