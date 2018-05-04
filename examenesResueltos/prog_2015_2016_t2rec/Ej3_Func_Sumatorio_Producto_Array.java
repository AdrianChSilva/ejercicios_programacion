
public class Ej3_Func_Sumatorio_Producto_Array {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] array = {8,2,7,1};
    System.out.print("Sumatorio: " + sumatorio(array));
    
  }
  public static int sumatorio(int[] n) {
    int suma = 0;
    for(int i = 0; i < 4; i++) {
      suma += n[i];
    }
    return suma;
    
  }
}
