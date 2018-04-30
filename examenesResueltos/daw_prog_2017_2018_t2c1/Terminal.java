
public class Terminal {
	private String numero;
	private int conversacion;

	
	public Terminal(String numero) {
		this.numero = numero;
		this.conversacion = 0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	

	public int getConversacion() {
		return conversacion;
	}

	public void setConversacion(int conversacion) {
		this.conversacion = conversacion;
	}

	public Terminal llama(Terminal x, int y) {
		
		x.conversacion += y;
		this.conversacion += y;
		
		return this;
	}
	
	
@Override
public String toString() {
	return "Nº " + numero + " - "+ conversacion + "s de conversación";
}

}
