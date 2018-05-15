
public class Ej3_Func_Sumatorio_Producto_Array {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int x = (int) (Math.random() * 8) + 2;
    int[] array1 = new int[x];
    for (int i = 0; i < array1.length; i++) {
      array1[i]=(int) (Math.random() * 8) + 1;
      System.out.print(array1[i] + " ");
    }
    System.out.println();
    System.out.print("Sumatorio: " + sumatorio(array1));
    
  }
  public static int sumatorio(int[] n) {
    int suma = 0;
    for(int i = 0; i < n.length; i++) {
      suma += n[i];
    }
    return suma;
    
  }
}
