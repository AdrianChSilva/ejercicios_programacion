
public class Ficha {
  private int[] valores = new int[2];

  public Ficha(int n1, int n2){
    this.valores[0] = n1;
    this.valores[1] = n2;
  }

  public int[] getValores(){
    return this.valores;
  }

  public void invertirFicha(){
    int aux = this.valores[1];
    this.valores[1] = this.valores[0];
    this.valores[0] = aux;
  }

  public int valorIzquierda(){
    return this.valores[0];
  }


   
  public int valorDerecha(){
    return this.valores[1];
  }

  @Override
  public String toString(){
    return "[ " + this.valores[0] + " | " + this.valores[1] + " ]";
  }
}

