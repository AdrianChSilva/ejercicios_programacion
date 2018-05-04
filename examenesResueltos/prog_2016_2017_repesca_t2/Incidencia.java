
public class Incidencia {
  private int codigo = (int) (Math.random() * 5) + 1;
  private int puesto;
  private boolean resolucion = false;
  private String pendiente = "pendiente";
  private String resuelto = "resuelto";
  private String incidente;
  private String metodo;
  private static int contadorPendientes;

  public int getPuesto() {
    return puesto;
  }

  public Incidencia(int puesto, String incidente) {
    this.puesto = puesto;
    this.incidente = incidente;
    if (this.resolucion == false) {
      contadorPendientes++;
    }
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
    if (this.resolucion == true) {
      contadorPendientes--;
    }
    this.metodo = x;
    return this.metodo;
  }

  public static int getPendientes() {

    return contadorPendientes;
  }

  public String toString() {
    String resultado = "";
    if (this.resolucion == false) {
      resultado =
          "Incidencia " + codigo + " - Puesto: " + puesto + " - " + incidente + " - " + pendiente;
    } else {
      resultado = "Incidencia " + codigo + " - Puesto: " + puesto + " - " + incidente + " - "
          + metodo + " - " + resuelto;
    }
    return resultado;

  }
}
