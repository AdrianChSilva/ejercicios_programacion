
/**
 * @author Adrichs
 *
 */
public class TarjetaRegalo {

	private double saldo;
	private int numero = (int) (Math.random() * 10000 + 10000);

	TarjetaRegalo(float saldo) {

		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void gasta(double dinero) {
		if (dinero < this.saldo) {
			this.saldo = saldo - dinero;
		} else {
			System.out.print("No queda suficiente dinero como para gastar " + dinero);
		}

	}

	public TarjetaRegalo fusionaCon(TarjetaRegalo x) {
		this.saldo += x.getSaldo();
		return this;

	}

	@Override
	public String toString() {
		return "TarjetaRegalo [saldo=" + saldo + ", numero=" + numero + "]";
	}

}
