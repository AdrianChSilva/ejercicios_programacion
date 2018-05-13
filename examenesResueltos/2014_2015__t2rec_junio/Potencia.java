
public class Potencia {
  private double base;
  private int exponente;
  private boolean mismaBase = false;

  

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public int getExponente() {
    return exponente;
  }

  public void setExponente(int exponente) {
    this.exponente = exponente;
  }

  public boolean isMismaBase() {
    return mismaBase;
  }

  public Potencia(double base, int exponente) {
    this.base = base;
    this.exponente = exponente;
  }

  public String multiplicaPor(Potencia x) {
    String resultado = "";
    if (this.base == x.getBase()) {
      mismaBase = true;
      int sumaEx = this.exponente + x.getExponente();
      resultado =this.base + "^" + sumaEx;
    } else {
      resultado = "Lo siento, no puedo multiplicar potencias de distinta base.\n0^0";
    }
    return resultado;
  }

  public String divideEntre(Potencia x) {
    String resultado = "";
    if (this.base == x.getBase()) {
      mismaBase = true;
      int restaEx = this.exponente - x.getExponente();
      resultado = this.base + "^" + restaEx;
    } else {
      resultado = "Lo siento, no puedo dividir potencias de distinta base.\n0^0";
    }
    return resultado;
  }

  @Override
  public String toString() {
    return this.base +"^" +this.exponente;
  }
  
}
