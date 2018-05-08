
public class Piramide {
  private static int piramidesCreadas = 0;
  private static String pintado = "";

  public static int getPiramidesCreadas() {
    return piramidesCreadas;
  }

  public static void setPiramidesCreadas(int piramidesCreadas) {
    Piramide.piramidesCreadas = piramidesCreadas;
  }

  static int contarPiramides() {
    Piramide.setPiramidesCreadas(Piramide.getPiramidesCreadas() + 1);
    return Piramide.getPiramidesCreadas();
  }

  private int altura;
  private int numero;

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public Piramide(int altura) {
    this.numero = Piramide.contarPiramides();
    this.altura = altura;
  }

  public void pinta() {
    int i = 0;
    int espacios = altura - 1;
    while (altura <= altura) {

      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (i = 1; i < altura * 2; i++) {
        System.out.print("*");
      }

      System.out.println();

      altura++;
      espacios--;

    }
  }

  @Override
  public String toString() {
    return null;
  
   

  }

}
