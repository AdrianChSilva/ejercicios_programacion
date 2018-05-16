
public abstract class Figura {
  private String caracter;
  private boolean estaRellena;
  
  public boolean isEstaRellena() {
    return estaRellena;
  }

  public void setEstaRellena(boolean estaRellena) {
    this.estaRellena = estaRellena;
  }

  public String getCaracter() {
    return caracter;
  }

  public void setCaracter(String caracter) {
    this.caracter = caracter;
  }

  public Figura(String caracter, boolean estaRellena) {
    super();
    this.caracter = caracter;
    this.estaRellena = estaRellena;
  }



}
