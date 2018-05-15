
public class Movil extends Terminal {
  private String tarifa;
  private double tarificado;

  public String getTarifa() {
    return tarifa;
  }

  public void setTarifa(String tarifa) {
    this.tarifa = tarifa;
  }

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
  }
  

  public double getTarificado() {
    return tarificado;
  }

  public void setTarificado(double tarificado) {
    this.tarificado = tarificado;
  }
  
  @Override
  public String toString() {
    String resultado= "";
    if(this.tarifa.equals("rata")) {

      resultado = super.toString() + " - Tarificados " + getConverTotal() * (0.06/60);
    }
    if(this.tarifa.equals("mono")) {
      resultado = super.toString() + " - Tarificados " + getConverTotal() * (0.12/60);
    }
    if(this.tarifa.equals("bisonte")) {
      resultado = super.toString() + " - Tarificados " + getConverTotal() * (0.30/60);
    }
    
     
    return  resultado;//super.toString() + " - Tarificados " + this.tarificado + " " + this.getConversacion();
  }


  

}
