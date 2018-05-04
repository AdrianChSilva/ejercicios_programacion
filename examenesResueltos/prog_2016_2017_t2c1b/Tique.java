
public class Tique {
  private int numero = 0;
  private int horas;
  private int minutos;
  private double precio = 0.02;

  public Tique(int horas, int minutos) {
    this.numero++;
    this.horas = horas;
    this.minutos = minutos;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {

    
    return "Tique [numero=" + this.numero + ", horas=" + horas + ", minutos=" + minutos + ", precio="
        + precio + "]";
  }



}
