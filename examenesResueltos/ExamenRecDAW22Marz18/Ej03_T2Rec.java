/**
 * La empresa El Corte Island�s nos ha encargado una aplicaci�n para gestionar
 * las tarjetas regalo. Como primer paso para implementar la aplicaci�n, es
 * necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando
 * se crea una nueva tarjeta, se le da un saldo y se asigna de forma autom�tica
 * un n�mero de 5 d�gitos. Si se intenta gastar m�s dinero del que tiene la
 * tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden
 * fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y
 * un nuevo n�mero aleatorio de 5 cifras. A continuaci�n se proporciona el
 * contenido
 * 
 * @author Adrichs
 *
 */
public class Ej03_T2Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarjetaRegalo t1 = new TarjetaRegalo(100);
		TarjetaRegalo t2 = new TarjetaRegalo(120);
		System.out.println(t1);
		System.out.println(t2);
		TarjetaRegalo t3 = t1.fusionaCon(t2);
		System.out.println();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println();
		
		
	}

}
