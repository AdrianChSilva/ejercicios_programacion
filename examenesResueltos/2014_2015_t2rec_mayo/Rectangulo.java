
public class Rectangulo extends Figura {

  private int base;
  private int altura;
  private static int rectangulosCreados;

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public Rectangulo(String c, int base, int altura) {
    super(c);
    this.base = base;
    this.altura = altura;
    rectangulosCreados++;
  }

  public static int getRectangulosCreados() {
    return rectangulosCreados;
  }

  public static void setRectangulosCreados(int rectangulosCreados) {
    Rectangulo.rectangulosCreados = rectangulosCreados;
  }

  @Override
  public String toString() {
    int i, espacios;
    String resultado = "";
    for (i = 0; i < this.base; i++) {
      resultado += getCaracter();
    }
    resultado += "\n";
    for (i = 1; i < this.altura - 1; i++) {
      resultado += getCaracter();
      for (espacios = 1; espacios < this.base - 1; espacios++) {
        resultado += " ";
      }
      resultado += "*";
      resultado += "\n";
    }
    for (i = 0; i < this.base; i++) {
      resultado += getCaracter();
    }
    resultado += "\n";
    return resultado;
  }

}
