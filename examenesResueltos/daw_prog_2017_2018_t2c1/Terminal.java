
public  class Terminal {
  private String numero;
  private int conversacion;
  private int converTotal = 0;


  public int getConverTotal() {
    return converTotal;
  }

  public void setConverTotal(int converTotal) {
    this.converTotal = converTotal;
  }

  public Terminal(String numero) {
    this.numero = numero;
    this.conversacion = 0;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }


  public int getConversacion() {
    return conversacion;
  }

  public void setConversacion(int conversacion) {
    this.conversacion = conversacion;
  }

  public void llama(Terminal x, int y) {

    x.conversacion += y;
    this.conversacion += y;
    this.converTotal += y;

   // return this;
  }


  @Override
  public String toString() {
    return "Nº " + numero + " - " + conversacion + "s de conversación";
  }

}
