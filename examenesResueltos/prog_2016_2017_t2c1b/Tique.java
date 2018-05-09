
public class Tique {
  private static int codigo = 0;
  private int numero;
  private int horas;
  private int minutos;
  private double precio = 0.02;

  public static int getCodigo() {
    return codigo;
  }

  public static void setCodigo(int codigo) {
    Tique.codigo = codigo;
  }
  static int obtenerNumero() {
    Tique.setCodigo(Tique.getCodigo() + 1);
    return Tique.getCodigo();
  }
  public Tique(int horas, int minutos) {
    this.numero = Tique.obtenerNumero();
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
  
  public String paga(int horasP, int minutosP) {
    String resultado;
    float x = (float) (((horasP * 60 + minutosP) - (this.getHoras() * 60 + this.getMinutos())) * this.getPrecio());
    resultado = "tique nº" + this.numero+ ". Debe pagar "  + x + "€. Gracias";
    return resultado;
  }




}
