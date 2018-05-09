
public class Tarjeta {
  private int numero = (int) (Math.random() * 900000) + 100000;
  private int puntos;
  private String titular;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getPuntos() {
    return puntos;
  }

  public void setPuntos(int puntos) {
    this.puntos = puntos;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Tarjeta(String titular) {
    this.puntos = 0;
    this.titular = titular;
  }

  public void acumula(int x) {
    this.puntos += x;
  }

  @Override
  public String toString() {
    return "Tarjeta nº:" + numero + ", Titular:" + titular + ", Puntos=" + puntos + "]";
  }

}
