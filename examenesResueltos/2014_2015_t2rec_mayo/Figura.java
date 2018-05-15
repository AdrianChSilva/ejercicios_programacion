
public abstract class Figura {
  private String caracter;
  private static int figurasCreadas;

  public Figura(String c) {
    // TODO Auto-generated constructor stub
    this.caracter = c;
    figurasCreadas++;
  }

  public String getCaracter() {
    return caracter;
  }

  public void setCaracter(String caracter) {
    this.caracter = caracter;
  }

  public static int getFigurasCreadas() {
    return figurasCreadas;
  }

  public static void setFigurasCreadas(int figurasCreadas) {
    Figura.figurasCreadas = figurasCreadas;
  }


}
