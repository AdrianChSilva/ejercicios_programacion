
public class Incidencia {
  private int codigo = (int) (Math.random() * 4) + 1;
  private int puesto;
  private boolean resolucion = false;
  private String pendiente = "pendiente";
  private String resuelto = "resuelto";
  private String incidente;
  private String metodo;

  public int getPuesto() {
    return puesto;
  }

  public Incidencia(int puesto, String incidente) {
    this.puesto = puesto;
    this.incidente = incidente;
    // this.pendiente = pendiente;
  }

  public String getIncidente() {
    return incidente;
  }

  public void setIncidente(String incidente) {
    this.incidente = incidente;
  }

  public void setPuesto(int puesto) {
    this.puesto = puesto;
  }

  public String getPendiente() {
    return pendiente;
  }

  public void setPendiente(String pendiente) {
    this.pendiente = pendiente;
  }

  public String getResuelto() {
    return resuelto;
  }

  public void setResuelto(String resuelto) {
    this.resuelto = resuelto;

  }
  
  public String resuelve(String x) {
    this.resolucion = true;
    this.metodo = x;
    return this.metodo;
  }


  public String toString() {
    String resultado = "";
    if(this.resolucion == false) {
      resultado = "Incidencia " + codigo + " - Puesto: " + puesto + " - " + incidente + " - " + pendiente;
    } else {
      resultado = "Incidencia " + codigo + " - Puesto: " + puesto + " - " + incidente + " - " + metodo +" - " +resuelto;
    }
    return resultado;

  }

//  @Override
//  public String toString() {
//
//    return incidente if (resolucion == false) {
//      String resultado = "Incidencia [codigo=" + codigo + ", puesto=" + puesto + ", pendiente="
//          + pendiente + ", resuelto=" + resuelto + ", incidente=" + incidente + "]";
//    }
//   
//
//  }


}
