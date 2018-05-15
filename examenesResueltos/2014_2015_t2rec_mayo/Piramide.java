
public class Piramide extends Figura {
  private int altura;
  private static int piramidesCreadas;

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public Piramide(String c, int altura) {
    super(c);
    this.altura = altura;
    piramidesCreadas++;
  }

  public static int getPiramidesCreadas() {
    return piramidesCreadas;
  }

  public static void setPiramidesCreadas(int piramidesCreadas) {
    Piramide.piramidesCreadas = piramidesCreadas;
  }

  @Override
  public String toString() {
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = this.altura - 1;
    int espaciosInternos = 0;
    String cadena = "";
    
    while (altura < this.altura) {
      
      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
       cadena += " ";
      }
      
      // pinta la línea
      cadena += this.getCaracter();
      for (i = 1; i < espaciosInternos; i++) {
        cadena += " ";
      }
      
      if (altura>1) {
        cadena += this.getCaracter();
      }
      
      cadena += "\n";
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
      cadena += this.getCaracter();
    }
    return cadena;
  }

}
