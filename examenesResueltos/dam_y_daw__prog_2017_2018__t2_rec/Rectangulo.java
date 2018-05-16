
public class Rectangulo extends Figura {
  private int altura;
  private int anchura;

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public int getAnchura() {
    return anchura;
  }

  public void setAnchura(int anchura) {
    this.anchura = anchura;
  }



  public Rectangulo(String caracter, boolean estaRellena, int altura, int anchura) {
    super(caracter, estaRellena);
    this.altura = altura;
    this.anchura = anchura;
  }

  @Override
  public String toString() {
    String resultado = "";
    if(isEstaRellena() == false) {
      int i, espacios;
      
      for (i = 0; i < this.anchura; i++) {
        resultado += getCaracter();
      }
      resultado += "\n";
      for (i = 1; i < this.altura - 1; i++) {
        resultado += getCaracter();
        for (espacios = 1; espacios < this.anchura - 1; espacios++) {
          resultado += " ";
        }
        resultado+="*";
        resultado += "\n";
      }
      for (i = 0; i < this.anchura; i++) {
        resultado += getCaracter();
      }
      resultado += "\n";
    }else {
      int i, espacios;
      
      for (i = 0; i < this.anchura; i++) {
        resultado += getCaracter();
      }
      resultado += "\n";
      for (i = 1; i < this.altura - 1; i++) {
        resultado += getCaracter();
        for (espacios = 1; espacios < this.anchura - 1; espacios++) {
          resultado += getCaracter();
        }
        resultado+="*";
        resultado += "\n";
      }
      for (i = 0; i < this.anchura; i++) {
        resultado += getCaracter();
      }
      resultado += "\n";
    }
    
    return resultado;
  }






}
