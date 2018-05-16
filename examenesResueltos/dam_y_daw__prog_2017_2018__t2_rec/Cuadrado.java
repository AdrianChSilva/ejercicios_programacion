
public class Cuadrado extends Figura {
  private int lado;

  public int getLado() {
    return lado;
  }

  public void setLado(int lado) {
    this.lado = lado;
  }


  public Cuadrado(String caracter, boolean estaRellena, int lado) {
    super(caracter, estaRellena);
    this.lado = lado;
  }

  @Override
  public String toString() {
    String resultado = "";
    if(isEstaRellena() == false) {
      int i, espacios;
      
      for (i = 0; i < this.lado; i++) {
        resultado += getCaracter() + " ";
      }
      resultado += "\n";
      for (i = 1; i < this.lado - 1; i++) {
        resultado += getCaracter();
        for (espacios = 1; espacios < this.lado - 1; espacios++) {
          resultado += "  ";
        }
        resultado+=" *";
        resultado += "\n";
      }
      for (i = 0; i < this.lado; i++) {
        resultado += getCaracter() + " ";
      }
      resultado += "\n";
      
    }else {
      int i, espacios;
      
      for (i = 0; i < this.lado; i++) {
        resultado += getCaracter() + " ";
      }
      resultado += "\n";
      for (i = 1; i < this.lado - 1; i++) {
        resultado += getCaracter()+ " ";
        for (espacios = 1; espacios < this.lado - 1; espacios++) {
          resultado += getCaracter()+ " ";
        }
        resultado+="*";
        resultado += "\n";
      }
      for (i = 0; i < this.lado; i++) {
        resultado += getCaracter()+ " " ;
      }
      resultado += "\n";
    }
    return resultado;

  }

}
