
public class Linea {
  Punto p1 = new Punto();
  Punto p2 = new Punto();

  public Linea(Punto p1, Punto p2) {
    super();
    this.p1 = p1;
    this.p2 = p2;
  }

  @Override
  public String toString() {
    return " Línea formada por los puntos (" + p1.getX() +", "+ p1.getY() + ") y (" + p2.getX() + ", "+ p2.getY()+ ")";
  }


}
